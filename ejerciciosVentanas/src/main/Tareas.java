package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Tareas {

	public static void main(String[] args) {
		JFrame ventana = new JFrame("Lista de tareas");
		ventana.setSize(350,300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(null);
		
		JLabel etiqueta = new JLabel("Nueva tarea: ");
		etiqueta.setBounds(20,20,100,25);
		
		JTextField campoTarea = new JTextField();
		campoTarea.setBounds(20,50,100,25);
		
		JButton botonAgregar = new JButton("Agregar");
		botonAgregar.setBounds(160,50,100,25);
		
		DefaultListModel<String> modeloLista = new DefaultListModel<>();
		JList<String> listaTareas = new JList<>(modeloLista);
		JScrollPane scrollLista = new JScrollPane(listaTareas);
		scrollLista.setBounds(20,90,250,150);
		
		botonAgregar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String tarea = campoTarea.getText();
				if (!tarea.isEmpty()) {
					modeloLista.addElement(tarea);
					campoTarea.setText(""); // limpiamos el campo
				}
			}
		});
		ventana.add(etiqueta);
		ventana.add(campoTarea);
		ventana.add(botonAgregar);
		ventana.add(scrollLista);
		ventana.setVisible(true);

	}

}
