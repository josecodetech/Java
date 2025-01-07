package main;

import java.util.HashSet;
import java.util.Scanner;

public class ContarPalabras {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet<String> palabrasUnicas = new HashSet<>();
		System.out.println("Introduce palabras (escribe 'fin' para terminar):  ");
		while (true) {
			System.out.print("Palabra: ");
			String palabra = scanner.nextLine();
			if (palabra.equalsIgnoreCase("fin")) {
				break;
			}
			palabrasUnicas.add(palabra);
		}
		System.out.println("Numero de palabras unicas: "+palabrasUnicas.size());
		System.out.println("Palabras unicas: "+palabrasUnicas);
	}

}
