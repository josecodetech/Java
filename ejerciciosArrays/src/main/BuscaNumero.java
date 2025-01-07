package main;

import java.util.Scanner;

public class BuscaNumero {

	public static void main(String[] args) {
		int[] numeros = {10,20,30,40,50};
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el numero a buscar: ");
		int buscado = scanner.nextInt();
		boolean encontrado = false;
		for (int i = 0; i<numeros.length;i++) {
			if (numeros[i] == buscado) {
				encontrado = true;
				System.out.println("Numero encontrado, como elemento numero: "+(i+1));
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Numero no encontrado en el array.");
		}
	}

}
