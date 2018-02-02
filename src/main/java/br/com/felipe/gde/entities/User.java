package br.com.felipe.gde.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "user_access")
public class User implements Serializable {

	private static final long serialVersionUID = -451329086514715454L;

	private Long user_id;
	private String email;
	private String name;
	private String password;
	private List<User> users_permitted;
	private List<Event> events;

	public User() {
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	
	
	@Column(nullable = false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	@Column(nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	@Column(nullable = false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	 @JoinTable(name = "user_permitted", joinColumns = {
			 @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)}, inverseJoinColumns = {
			 @JoinColumn(name = "user_permitted", referencedColumnName = "user_id", nullable = false)})
			 @ManyToMany
	public List<User> getUsers_permitted() {
		return users_permitted;
	}
	public void setUsers_permitted(List<User> users_permitted) {
		this.users_permitted = users_permitted;
	}
	
	
	@OneToMany(mappedBy = "user_event", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	public List<Event> getEvents() {
		return events;
	}
	public void setEvents(List<Event> events) {
		this.events = events;
	}	
	 
}
