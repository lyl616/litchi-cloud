package org.litchi.cloud.movie.bo;

public class User {

	private Long id;
	private String username;
	private String name;
	private Short age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Short getAge() {
		return age;
	}

	public void setAge(Short age) {
		this.age = age;
	}

	public User(Long id) {
		super();
		this.id = id;
	}

	public User() {
		super();
	}

}
