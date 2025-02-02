package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class contarLineas {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))){
			int contadorLineas = 0;
			while (br.readLine()!=null) {
				contadorLineas++;
			}
			System.out.println("El archivo contiene "+contadorLineas+" lineas.");
		} catch(IOException e) {
			System.out.println("Error al leer el archivo: "+ e.getMessage());
			crearArchivo();
			System.out.println("Se ha creado el archivo para proxima ejecucion.");
		}

	}

	private static void crearArchivo() {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("archivo.txt",true))){
			bw.write("Nueva linea en el archivo.");
			bw.newLine();
			bw.write("Otra linea en el archivo.");
			bw.newLine();
			bw.write("Otra linea en el archivo.");
			bw.newLine();
			bw.write("Otra linea en el archivo.");
			bw.newLine();
			bw.write("Otra linea en el archivo.");
			// System.out.println("Texto añadido al archivo.");
			
		} catch (IOException e) {
			System.out.println("Error al escribir en el archivo: "+e.getMessage());
		}
		
	}

}
