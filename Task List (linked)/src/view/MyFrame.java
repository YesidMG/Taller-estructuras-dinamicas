package view;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import model.Task;
import model.User;



public class MyFrame extends JFrame {
	public Panel_1 panel;


	public MyFrame(ActionListener listener) {
		super("Matriz");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		this.setVisible(true);
		this.initComponets(listener);
		this.revalidate();
		this.repaint();
	}

	public void initComponets (ActionListener listener) {
		panel = new Panel_1(0, 0, this.getWidth(), this.getHeight(), listener);
		this.add(panel);
	}
	
	public String [] newTask() {
		String [] task = {panel.getNameTask().getText(),panel.getDate().getText(),panel.getDescription().getText(),panel.getParticipe().getText()};
		return task;
	}
	
	public String returnUser() {
		return panel.getUsers().getSelectedItem().toString();
	}
	public String returnTaskUser() {
		return panel.getTask().getSelectedItem().toString();
	}
	public void showTask(String task) {
		panel.getTs().setText(task);
	}
	
	public void updateusers(LinkedList<User> users) {
		panel.getUsers().removeAllItems();
		for (int i = 0; i < users.size(); i++) {
			panel.getUsers().addItem(users.get(i).getNamep());
		}
	}
	public void updatetask(LinkedList<Task> tasks) {
		panel.getTask().removeAllItems();
		for (int i = 0; i < tasks.size(); i++) {
			panel.getTask().addItem(tasks.get(i).getNameT());
		}
	}

	
	

}
