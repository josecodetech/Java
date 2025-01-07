package main;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaNombres {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> nombres = new ArrayList<>();
		System.out.println("Introduce nombres (escribe 'fin' para terminar): ");
		while(true) {
			System.out.print("Nombre: ");
			String nombre = scanner.nextLine();
			if (nombre.equalsIgnoreCase("fin")) {				
				break;
			}
			nombres.add(nombre);

		}
		System.out.println("\nNombres introducidos: ");
		for (String persona : nombres) {
			System.out.println(persona);
		}
		System.out.println("Adios");
	}

}
