package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Registro {

	public static void main(String[] args) {
		JFrame ventana = new JFrame("Registro");
		ventana.setSize(350,250);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(null);
		
		JLabel etiquetaNombre = new JLabel("Nombre:");
		etiquetaNombre.setBounds(20,20,80,25);
		JTextField campoNombre = new JTextField();
		campoNombre.setBounds(100,20,200,25);
		
		JLabel etiquetaEdad = new JLabel("Edad:");
		etiquetaEdad.setBounds(20,50,80,25);
		JTextField campoEdad = new JTextField();
		campoEdad.setBounds(100,50,200,25);
		
		JLabel etiquetaCorreo = new JLabel("Correo:");
		etiquetaCorreo.setBounds(20,80,80,25);
		JTextField campoCorreo = new JTextField();
		campoCorreo.setBounds(20,120,100,30);
		
		JButton botonRegistrar = new JButton("Registrar");
		botonRegistrar.setBounds(140,120,100,30);
		
		JLabel resultado = new JLabel("Datos: ");
		resultado.setBounds(20,160,300,25);
		
		botonRegistrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nombre = campoNombre.getText();
				String edad = campoEdad.getText();
				String correo = campoCorreo.getText();
				resultado.setText("Datos: "+nombre+", "+edad+", "+correo);
			}
		});
		ventana.add(etiquetaNombre);
		ventana.add(campoNombre);
		ventana.add(etiquetaEdad);
		ventana.add(campoEdad);
		ventana.add(etiquetaCorreo);
		ventana.add(campoCorreo);
		ventana.add(botonRegistrar);
		ventana.add(resultado);
		
		ventana.setVisible(true);
		
	}

}
