package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class copiarArchivo {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("salida.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("copia.txt"))){
			String linea;
			while((linea = br.readLine())!= null) {
				bw.write(linea);
				bw.newLine();
			}
			System.out.println("Contenido copiado a copia.txt. ");
		}catch (IOException e) {
			System.out.println("Error al copiar el archivo: "+e.getMessage());
		}

	}

}
