package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
			String [] patient = frame.newPatienrt();
			logic.newTurn(patient[0], patient[1], Integer.parseInt(patient[2]));
			frame.showPatient(logic.showPatient());
			break;
		}
		case "nextTurn": {	
			logic.nexTurn();
			frame.showPatient(logic.showPatient());
			break;
		}
		}}catch (Exception e) {
		}
	}
	public static void main(String[] args) {
		new Controll();

	}

}
