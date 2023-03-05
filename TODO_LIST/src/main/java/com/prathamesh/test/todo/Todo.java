package com.prathamesh.test.todo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

//data base
//JPA
//Bean -> Database Table
@Entity
//static list of todos
public class Todo {
	
	
	public Todo() {
		
	}

	@Id
	@GeneratedValue
	private Integer id;
	private String username;
	@Size(min=10, message="Enter atleast 10 characters")
	private String description;
	private LocalDate targetDate;
	private Boolean Done;
	private Integer Priority ;

	public Todo(Integer id, String username, String description, LocalDate targetDate, Boolean done,Integer Priority) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.targetDate = targetDate;
		this.Priority = 0;
		//this.Done = Done;
		Done = done;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPriority() {
		return Priority;
	}

	public void setPriority(Integer priority) {
		Priority = priority;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public Boolean getDone() {
		return Done;
	}

	public void setDone(Boolean done) {
		Done = done;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", targetDate="
				+ targetDate + ", Done=" + Done + ", Priority=" + Priority + "]";
	}
}
