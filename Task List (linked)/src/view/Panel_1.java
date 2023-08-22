package view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Panel_1 extends JPanel {

	private JLabel newTaskText;
	private JLabel nameText;
	private JTextField nameTask;
	private JLabel dateText;
	private JTextField date;
	private JLabel descriptionText;
	private JTextArea description;
	private JLabel participeText;
	private JTextField participe;
	private JButton agree;
	private JLabel info;
	private JLabel showTaskUser;
	private JComboBox<String> users;
	private JButton searchUser;
	private JComboBox<String> task;
	private JButton searchTask;
	private JTextArea ts;
	


	public Panel_1( int x,int y,int width,int heigth, ActionListener listener) {
		this.setLayout(null);
		this.setBounds(x,y, width, heigth);
		this.initComponents(listener);
	}

	public void initComponents(ActionListener listener) {

		newTaskText= new JLabel("----AGREGAR NUEVA TAREA----");
		newTaskText.setFont(new Font(newTaskText.getFont().getName(), Font.PLAIN, 14));
		newTaskText.setBounds((int)(this.getWidth()*0.2), (int)(this.getHeight()*0.02), (int)(this.getWidth()*0.5), (int)(this.getHeight()*0.05));
		this.add(newTaskText);

		nameText= new JLabel("Nombre:");
		nameText.setBounds((int)(this.getWidth()*0.03), (int)(this.getHeight()*0.05), (int)(this.getWidth()*0.1), (int)(this.getHeight()*0.1));
		this.add(nameText);
		
		nameTask= new JTextField();
		nameTask.setBounds((int)(this.getWidth()*0.15), (int)(this.getHeight()*0.075), (int)(this.getWidth()*0.3), (int)(this.getHeight()*0.05));
		this.add(nameTask);

		dateText= new JLabel("Fecha de vencimiento:");
		dateText.setBounds((int)(this.getWidth()*0.5), (int)(this.getHeight()*0.045), (int)(this.getWidth()*0.25), (int)(this.getHeight()*0.1));
		this.add(dateText);
		
		date= new JTextField();
		date.setBounds((int)(this.getWidth()*0.72), (int)(this.getHeight()*0.075), (int)(this.getWidth()*0.15), (int)(this.getHeight()*0.05));
		this.add(date);
		
		descriptionText= new JLabel("Descripcion:");
		descriptionText.setBounds((int)(this.getWidth()*0.03), (int)(this.getHeight()*0.12), (int)(this.getWidth()*0.12), (int)(this.getHeight()*0.1));
		this.add(descriptionText);
		
		description= new JTextArea();
		description.setLineWrap(true);
		description.setBounds((int)(this.getWidth()*0.15), (int)(this.getHeight()*0.15), (int)(this.getWidth()*0.6), (int)(this.getHeight()*0.15));
		this.add(description);
		
		participeText= new JLabel("Delegados:");
		participeText.setBounds((int)(this.getWidth()*0.03), (int)(this.getHeight()*0.29), (int)(this.getWidth()*0.12), (int)(this.getHeight()*0.1));
		this.add(participeText);
		
		participe= new JTextField();
		participe.setBounds((int)(this.getWidth()*0.15), (int)(this.getHeight()*0.315), (int)(this.getWidth()*0.5), (int)(this.getHeight()*0.05));
		this.add(participe);
		
		info= new JLabel("Pon cada usuario separado por una coma (,)");
		info.setBounds((int)(this.getWidth()*0.03), (int)(this.getHeight()*0.34), (int)(this.getWidth()*0.5), (int)(this.getHeight()*0.1));
		this.add(info);

		agree= new JButton("Añadir Tarea");
		agree.setBounds((int)(this.getWidth()*0.35), (int)(this.getHeight()*0.42), (int)(this.getWidth()*0.25), (int)(this.getHeight()*0.05));
		agree.setActionCommand("agree");
		agree.addActionListener(listener);
		this.add(agree);

		showTaskUser= new JLabel("----VER TAREAS POR USUARIO----");
		showTaskUser.setFont(new Font(showTaskUser.getFont().getName(), Font.PLAIN, 14));
		showTaskUser.setBounds((int)(this.getWidth()*0.25), (int)(this.getHeight()*0.47), (int)(this.getWidth()*0.5), (int)(this.getHeight()*0.05));
		this.add(showTaskUser);

		users= new JComboBox<>();
		users.setBounds((int)(this.getWidth()*0.03), (int)(this.getHeight()*0.53), (int)(this.getWidth()*0.3), (int)(this.getHeight()*0.05));
		this.add(users);

		searchUser= new JButton("Buscar tareas");
		searchUser.setBounds((int)(this.getWidth()*0.35), (int)(this.getHeight()*0.53), (int)(this.getWidth()*0.3), (int)(this.getHeight()*0.05));
		searchUser.setActionCommand("searchTask");
		searchUser.addActionListener(listener);
		this.add(searchUser);

		task= new JComboBox<>();
		task.setBounds((int)(this.getWidth()*0.03), (int)(this.getHeight()*0.6), (int)(this.getWidth()*0.3), (int)(this.getHeight()*0.05));
		this.add(task);

		searchTask= new JButton("Mostrar tarea");
		searchTask.setBounds((int)(this.getWidth()*0.35), (int)(this.getHeight()*0.6), (int)(this.getWidth()*0.3), (int)(this.getHeight()*0.05));
		searchTask.setActionCommand("search");
		searchTask.addActionListener(listener);
		this.add(searchTask);
		
		ts= new JTextArea();
		ts.setLineWrap(true);
		ts.setBounds((int)(this.getWidth()*0.03), (int)(this.getHeight()*0.67), (int)(this.getWidth()*0.7), (int)(this.getHeight()*0.2));
		this.add(ts);

	
		
	}

	public JTextField getNameTask() {
		return nameTask;
	}

	public void setNameTask(JTextField nameTask) {
		this.nameTask = nameTask;
	}

	public JTextField getDate() {
		return date;
	}

	public void setDate(JTextField date) {
		this.date = date;
	}

	public JTextArea getDescription() {
		return description;
	}

	public void setDescription(JTextArea description) {
		this.description = description;
	}

	public JTextField getParticipe() {
		return participe;
	}

	public void setParticipe(JTextField participe) {
		this.participe = participe;
	}

	public JLabel getInfo() {
		return info;
	}

	public void setInfo(JLabel info) {
		this.info = info;
	}

	public JLabel getShowTaskUser() {
		return showTaskUser;
	}

	public void setShowTaskUser(JLabel showTaskUser) {
		this.showTaskUser = showTaskUser;
	}

	public JComboBox<String> getUsers() {
		return users;
	}

	public void setUsers(JComboBox<String> users) {
		this.users = users;
	}

	public JButton getSearchUser() {
		return searchUser;
	}

	public void setSearchUser(JButton searchUser) {
		this.searchUser = searchUser;
	}

	public JComboBox<String> getTask() {
		return task;
	}

	public void setTask(JComboBox<String> task) {
		this.task = task;
	}

	public JButton getSearchTask() {
		return searchTask;
	}

	public void setSearchTask(JButton searchTask) {
		this.searchTask = searchTask;
	}

	public JTextArea getTs() {
		return ts;
	}

	public void setTs(JTextArea ts) {
		this.ts = ts;
	}


	



}
