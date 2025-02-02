package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class buscarPalabra {

	public static void main(String[] args) {
		String palabraBuscada = "otra";
		int contador = 0;
		try (BufferedReader br = new BufferedReader(new FileReader("copia.txt"))){
			String linea;
			while((linea = br.readLine())!=null) {
				String[] palabras = linea.split(" ");
				for (String palabra : palabras) {
					if (palabra.equalsIgnoreCase(palabraBuscada)) {
						contador++;
					}
				}
			}
			System.out.println("La palabra '"+palabraBuscada+"' aparece "+contador+" veces en el archivo. ");
		} catch (IOException e) {
			System.out.println("Error al leer el archivo: "+e.getMessage());
		}

	}

}
