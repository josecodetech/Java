package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class escrituraArchivo {

	public static void main(String[] args) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("archivo.txt",true))){
			bw.write("Nueva linea en el archivo.");
			bw.newLine();
			bw.write("Otra linea en el archivo.");
			System.out.println("Texto añadido al archivo.");
			
		} catch (IOException e) {
			System.out.println("Error al escribir en el archivo: "+e.getMessage());
		}

	}

}
