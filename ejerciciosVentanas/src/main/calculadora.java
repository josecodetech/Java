package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class calculadora {

	public static void main(String[] args) {
		// Crear ventana
		JFrame ventana = new JFrame("Calculadora");
		ventana.setSize(300,200);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Crear componentes
		JLabel etiqueta1 = new JLabel("Numero 1");
		etiqueta1.setBounds(20,20,80,25);
		
		JTextField campo1 = new JTextField();
		campo1.setBounds(100,20,150,25);
		
		JLabel etiqueta2 = new JLabel("Numero 2");
		etiqueta2.setBounds(20,50,80,25);
		
		JTextField campo2 = new JTextField();
		campo2.setBounds(100,50,150,25);
		
		JButton botonSumar = new JButton("Sumar");
		botonSumar.setBounds(100,100,100,25);
		
		JLabel resultado = new JLabel("Resultado: ");
		resultado.setBounds(20,110,200,25);
		
		// Accion del boton
		botonSumar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					double num1 = Double.parseDouble(campo1.getText());
					double num2 = Double.parseDouble(campo2.getText());
					double suma = num1 + num2;
					resultado.setText("Resultado: "+suma);
				} catch (NumberFormatException ex) {
					resultado.setText("Error: ingresa numeros validos.");
				}
			}
		});
		// Agregar componentes a ventana
		ventana.add(etiqueta1);
		ventana.add(campo1);
		ventana.add(etiqueta2);
		ventana.add(campo2);
		ventana.add(botonSumar);
		ventana.add(resultado);
		
		ventana.setVisible(true);
	}

}
