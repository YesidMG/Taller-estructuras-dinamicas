package model;

public class Patient implements Comparable<Patient> {

	private String name;
	private String disease;
	private int severity ;
	
	public Patient(String name, String disease, int severity) {
		this.name = name;
		this.disease = disease;
		this.severity = severity;
	}

	@Override
	public int compareTo(Patient patient) {
		if (this.severity > patient.severity) return -1;

		if (this.severity < patient.severity) return 1;
		
		if (this.severity == patient.severity) return 1;
		
		return 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getSeverity() {
		return severity;
	}

	public void setSeverity(int severity) {
		this.severity = severity;
	}

	@Override
	public String toString() {
		return "Nombre=" + name + "\nEnfermedad=" + disease + "\nGravedad=" + severity ;
	}

	
	
}
