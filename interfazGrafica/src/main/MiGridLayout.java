package main;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MiGridLayout {

	public static void main(String[] args) {
		JFrame ventana = new JFrame("GridLayout");
		ventana.setSize(300,200);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(new GridLayout(2,2)); // 2 filas y 2 columnas
		ventana.add(new JButton("Boton 1"));
		ventana.add(new JButton("Boton 2"));
		ventana.add(new JButton("Boton 3"));
		ventana.add(new JButton("Boton 4"));
		ventana.setVisible(true);
	}
}
