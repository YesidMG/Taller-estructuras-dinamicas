package model;

import java.util.LinkedList;

public class Logic {

	private LinkedList<User> usuarios;

	public Logic() {
		usuarios= new LinkedList<>();
	}

	public void newTask(String name, String date, String descrip, String participe) {

		String[] participes = participe.split(",");
		Task ts = new Task(name,  date,descrip);
		for (int i = 0; i < participes.length; i++) {
			ts.getUsers().add(participes[i]);
		}
		for (int i = 0; i < participes.length; i++) {
			int a=searchUser(participes[i]);
			if (a==-1) {
				User user = new User(participes[i]);
				user.getTasks().add(ts);
				usuarios.add(user);
			}else {
				usuarios.get(a).getTasks().add(ts);
			}
		}
		
	}
	public LinkedList<Task> showTasks(String name){
		return usuarios.get(searchUser(name)).getTasks();
	}
	
	public String showTask(String user, String Task){
		return usuarios.get(searchUser(user)).getTasks().get(searchTask(searchUser(user), Task)).toString();
	}
	
	public int searchTask(int user, String task) {
		int i=-1;
		for (int j = 0; j < usuarios.get(user).getTasks().size(); j++) {
			if(usuarios.get(user).getTasks().get(j).getNameT().equals(task)) {
				i=j;
			}
		}
		return i;
	}
	
	public int searchUser (String name){
		int i=-1;
		for (int j = 0; j < usuarios.size(); j++) {
			if(usuarios.get(j).getNamep().equals(name)) {
				i=j;
			}
		}
		return i;
	}

	public LinkedList<User> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(LinkedList<User> usuarios) {
		this.usuarios = usuarios;
	}





}
