package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class datosUsuario {

	public static void main(String[] args) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("salida.txt"))){
			Scanner scanner = new Scanner(System.in);
			System.out.println("Escribe lineas de texto ('fin' para terminar): ");
			String linea;
			while(!(linea = scanner.nextLine()).equalsIgnoreCase("fin")) {
				bw.write(linea);
				bw.newLine();
			}
			System.out.println("Texto guardado en salida.txt. ");
		}catch (IOException e) {
			System.out.println("Error al escribir en el archivo: "+e.getMessage());
		}

	}

}
