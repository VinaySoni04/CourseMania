package com.coursemaniabackend.springrestapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@JsonIgnoreProperties({"hibernateLazyInitializer"}) 
@Entity // @Entity annotation is used to mark a Java class as an entity, which represents a persistent object that can be mapped to a database table. 
public class Course {
	
	@Id // id is marked as primary key
	private long id;
	private String name;
	private String description;
	private int price;
	
	public Course(long id, String name, String description, int price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public Course() {
		super();
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
