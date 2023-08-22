package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import model.Logic;
import view.MyFrame;

public class Controll implements ActionListener {
	private MyFrame frame;
	private Logic logic;

	public Controll() {
		frame = new MyFrame(this);
		logic= new Logic();

	}
	@Override
	public void actionPerformed(ActionEvent event) {
		String source = event.getActionCommand();

		try {
			switch (source) {
			case "agree": {	
				String [] newTask=frame.newTask();
				logic.newTask(newTask[0], newTask[1], newTask[2], newTask[3]);
				frame.updateusers(logic.getUsuarios());
				break;
			}
			case "searchTask": {	
				frame.updatetask(logic.showTasks(frame.returnUser()));	
				break;
			}
			case "search": {	
				frame.showTask(logic.showTask(frame.returnUser(), frame.returnTaskUser()));	
				break;
			}
			}}catch (Exception e) {
			}
	}
	public static void main(String[] args) {
		new Controll();

	}

}
