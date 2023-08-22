package view;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Panel_1 extends JPanel {
	
	private JLabel newPatientTurn;
	private JLabel nameText;
	private JLabel deseaseText;
	private JLabel severityText;
	private JTextField namePatient;
	private JTextField desease;
	private JTextField severity;
	private JButton agree;
	private JLabel actuallyTurn;
	private JLabel patientText;
	private JTextArea patient;
	private JButton nextTurn;

	public Panel_1( int x,int y,int width,int heigth, ActionListener listener) {
		this.setLayout(null);
		this.setBounds(x,y, width, heigth);
		this.initComponents(listener);
	}

	public void initComponents(ActionListener listener) {

		newPatientTurn= new JLabel("----NUEVO TUERNO DE PACIENTE----");
		newPatientTurn.setFont(new Font(newPatientTurn.getFont().getName(), Font.PLAIN, 14));
		newPatientTurn.setBounds((int)(this.getWidth()*0.2), (int)(this.getHeight()*0.04), (int)(this.getWidth()*0.5), (int)(this.getHeight()*0.05));
		this.add(newPatientTurn);
		
		nameText= new JLabel("Nombre:");
		nameText.setBounds((int)(this.getWidth()*0.05), (int)(this.getHeight()*0.1), (int)(this.getWidth()*0.1), (int)(this.getHeight()*0.1));
		this.add(nameText);
		
		deseaseText= new JLabel("Caso o enfermedad:");
		deseaseText.setBounds((int)(this.getWidth()*0.05), (int)(this.getHeight()*0.175), (int)(this.getWidth()*0.25), (int)(this.getHeight()*0.1));
		this.add(deseaseText);
		
		severityText= new JLabel("Gravedad (1-50):");
		severityText.setBounds((int)(this.getWidth()*0.05), (int)(this.getHeight()*0.25), (int)(this.getWidth()*0.25), (int)(this.getHeight()*0.1));
		this.add(severityText);

		namePatient= new JTextField();
		namePatient.setBounds((int)(this.getWidth()*0.3), (int)(this.getHeight()*0.125), (int)(this.getWidth()*0.4), (int)(this.getHeight()*0.05));
		this.add(namePatient);
		
		desease= new JTextField();
		desease.setBounds((int)(this.getWidth()*0.3), (int)(this.getHeight()*0.2), (int)(this.getWidth()*0.5), (int)(this.getHeight()*0.05));
		this.add(desease);
		
		severity= new JTextField();
		severity.setBounds((int)(this.getWidth()*0.3), (int)(this.getHeight()*0.275), (int)(this.getWidth()*0.05), (int)(this.getHeight()*0.05));
		this.add(severity);
		
		agree= new JButton("Agregar turno");
		agree.setBounds((int)(this.getWidth()*0.3), (int)(this.getHeight()*0.35), (int)(this.getWidth()*0.3), (int)(this.getHeight()*0.07));
		agree.setActionCommand("agree");
		agree.addActionListener(listener);
		this.add(agree);
		
		actuallyTurn= new JLabel("----TURNO ACTUAL EN CURSO----");
		actuallyTurn.setFont(new Font(actuallyTurn.getFont().getName(), Font.PLAIN, 14));
		actuallyTurn.setBounds((int)(this.getWidth()*0.2), (int)(this.getHeight()*0.45), (int)(this.getWidth()*0.5), (int)(this.getHeight()*0.05));
		this.add(actuallyTurn);
		
		patientText= new JLabel("Paciente:");
		patientText.setBounds((int)(this.getWidth()*0.05), (int)(this.getHeight()*0.5), (int)(this.getWidth()*0.15), (int)(this.getHeight()*0.1));
		this.add(patientText);
		
		patient= new JTextArea();
		patient.setBounds((int)(this.getWidth()*0.2), (int)(this.getHeight()*0.52), (int)(this.getWidth()*0.7), (int)(this.getHeight()*0.2));
		patient.setEditable(false);
		this.add(patient);
		
		nextTurn= new JButton("Siguiente turno");
		nextTurn.setBounds((int)(this.getWidth()*0.3), (int)(this.getHeight()*0.75), (int)(this.getWidth()*0.3), (int)(this.getHeight()*0.07));
		nextTurn.setActionCommand("nextTurn");
		nextTurn.addActionListener(listener);
		this.add(nextTurn);
	}


	public JTextField getNamePatient() {
		return namePatient;
	}

	public void setNamePatient(JTextField namePatient) {
		this.namePatient = namePatient;
	}

	public JTextField getDesease() {
		return desease;
	}

	public void setDesease(JTextField desease) {
		this.desease = desease;
	}

	public JTextField getSeverity() {
		return severity;
	}

	public void setSeverity(JTextField severity) {
		this.severity = severity;
	}

	public JTextArea getPatient() {
		return patient;
	}

	public void setPatient(JTextArea patient) {
		this.patient = patient;
	}
	
	


	


	}
