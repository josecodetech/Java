package main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Formulario {

	public static void main(String[] args) {
		JFrame ventana = new JFrame("Formulario");
		ventana.setSize(300,200);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(null);
		JPanel panel = new JPanel();
		panel.setBounds(20,20,250,120);
		panel.setLayout(null);
		JLabel etiqueta = new JLabel("Nombre: ");
		etiqueta.setBounds(10,10,100,20);
		JTextField campoTexto = new JTextField();
		campoTexto.setBounds(80,10,150,20);
		JButton boton = new JButton("Enviar");
		boton.setBounds(80,50,100,30);
		panel.add(etiqueta);
		panel.add(campoTexto);
		panel.add(boton);
		ventana.add(panel);
		ventana.setVisible(true);
	}

}
