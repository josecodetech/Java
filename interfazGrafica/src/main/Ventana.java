package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana {

	public static void main(String[] args) {
		JFrame ventana = new JFrame("Ventana con componentes");
		ventana.setSize(400,200);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(null); // desactivar diseño automatico
		JLabel etiqueta = new JLabel("Hola, Swing!");
		etiqueta.setBounds(50,30,200,30); // posicion y tamaño
		JButton boton = new JButton("Haz clic");
		boton.setBounds(50,80,100,30);
		boton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				etiqueta.setText("Boton presionado!");
			}
		});
		ventana.add(etiqueta);
		ventana.add(boton);
		ventana.setVisible(true);

	}

}
