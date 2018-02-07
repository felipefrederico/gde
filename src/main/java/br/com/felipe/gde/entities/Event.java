package br.com.felipe.gde.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "event")
public class Event implements Serializable{
	
	private static final long serialVersionUID = 8561658198768399173L;

	private long event_id;
	private String description;
	private String name;
	private Date deadline;
	private User user_event;
	private List<Document> documents;
	
	
	public Event() {
		
	}
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long getEvent_id() {
		return event_id;
	}
	public void setEvent_id(long event_id) {
		this.event_id = event_id;
	}
	
	@Column
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="user_id")
	public User getUser_event() {
		return user_event;
	}
	public void setUser_event(User user_event) {
		this.user_event = user_event;
	}

	@JoinTable(name = "event_has_document", joinColumns = {
			 @JoinColumn(name = "event_id", referencedColumnName = "event_id", nullable = false)}, inverseJoinColumns = {
			 @JoinColumn(name = "document_id", referencedColumnName = "document_id", nullable = false)})
			 @ManyToMany
	public List<Document> getDocuments() {
		return documents;
	}
	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	
	
}
