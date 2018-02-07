package br.com.felipe.gde.dtos;

public class UserDto {
	
	private Long id;
	private String name;
	private String password;
	
	public UserDto() {
		
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDto [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
	

}
