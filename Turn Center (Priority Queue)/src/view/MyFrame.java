package view;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class MyFrame extends JFrame {
	public Panel_1 panel;


	public MyFrame(ActionListener listener) {
		super("Matriz");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setVisible(true);
		this.initComponets(listener);
		this.revalidate();
		this.repaint();
	}

	public void initComponets (ActionListener listener) {
		panel = new Panel_1(0, 0, this.getWidth(), this.getHeight(), listener);
		this.add(panel);
	}

	public String [] newPatienrt() {
		String [] data = {panel.getNamePatient().getText(),panel.getDesease().getText(),panel.getSeverity().getText()};
		panel.getNamePatient().setText("");
		panel.getDesease().setText("");
		panel.getSeverity().setText("");
		panel.revalidate();
		panel.repaint();
		return  data;
	}
	public void showPatient(String patient) {
		panel.getPatient().setText(patient);
		panel.revalidate();
		panel.repaint();
	}

}
