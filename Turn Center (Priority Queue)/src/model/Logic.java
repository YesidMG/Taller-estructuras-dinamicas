package model;

import java.util.PriorityQueue;

public class Logic {

	private PriorityQueue<Patient> list ;

	public Logic() {
		list = new PriorityQueue<>();
	}

	public void newTurn (String name, String disease, int severity) {
		list.add(new Patient(name, disease, severity));
	}

	public String showPatient () {
		if (list.isEmpty())return "No hay pacientes en turno";
		return list.peek().toString();
	}
	public void nexTurn () {
		list.poll();
	}

	


}
