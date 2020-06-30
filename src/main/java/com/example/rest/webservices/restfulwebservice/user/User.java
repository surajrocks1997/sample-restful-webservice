package com.example.rest.webservices.restfulwebservice.user;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

@Entity
public class User {

	@Id
	@GeneratedValue
	private int id;
	
	@Size(min = 2, message = "Name should have atleast 2 characters")
	private String name;
	
	@Past
	private Date birth;
	
	@OneToMany(mappedBy = "user")
	private List<Post> posts;

	protected User() {}
	
	public User(int id, String name, Date birth) {
		super();
		this.id = id;
		this.name = name;
		this.birth = birth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birth=" + birth + "]";
	}
	
	
}
