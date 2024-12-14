package main;

import java.util.Scanner;

public class Impares {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero = scanner.nextInt();
		for (int i = 1; i <= numero; i++) {
			if (i%2 == 0) {
				continue; // salta los numeros pares
			}
			System.out.println(i);
		}
	}

}
