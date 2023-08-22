package model;

import java.util.LinkedList;

public class User {
	
	private String namep;
	private LinkedList<Task> tasks;
	
	public User(String name) {
		this.namep = name;
		tasks = new LinkedList<>();
	}

	public String getNamep() {
		return namep;
	}

	public void setNamep(String name) {
		this.namep = name;
	}

	public LinkedList<Task> getTasks() {
		return tasks;
	}

	public void setTasks(LinkedList<Task> tasks) {
		this.tasks = tasks;
	}
	
	
	
	

}
