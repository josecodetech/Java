package main;

import java.util.HashMap;
import java.util.Scanner;

public class Frecuencia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> frecuenciaPalabras = new HashMap<>();
		System.out.println("Introduce palabras ('fin' para terminar): ");
		while (true) {
			System.out.print("Palabra: ");
			String palabra = scanner.nextLine();
			if (palabra.equalsIgnoreCase("fin")) {
				break;
			}
			frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra,0)+1);
			
		}
		System.out.println("\nFrecuencia de palabras: ");
		for (String clave:frecuenciaPalabras.keySet()) {
			System.out.println(clave + ": "+frecuenciaPalabras.get(clave));
		}
	}

}
