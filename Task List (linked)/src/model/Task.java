package model;

import java.util.LinkedList;

public class Task {
	
	private String nameT;
	private String description;
	private String date;
	private LinkedList<String> users;
	
	
	public Task(String nameT, String date, String description) {
		this.nameT = nameT;
		this.description = description;
		this.date = date;
		users = new LinkedList<>();
	}


	public String getNameT() {
		return nameT;
	}


	public void setNameT(String nameT) {
		this.nameT = nameT;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public LinkedList<String> getUsers() {
		return users;
	}


	public void setUsers(LinkedList<String> users) {
		this.users = users;
	}

	

	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Tarea=" + nameT + "\nDescribcion=" + description + "\nFecha de vencimiento=" + date ;
	}


	
	
	

	
	
	
	

}
