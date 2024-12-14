package main;

import java.util.Scanner;

public class SumaPares {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero = scanner.nextInt();
		int suma = 0;
		for (int i = 2; i<=numero;i+=2) {
			suma += i;
		}
		System.out.println("La suma de los numeros pares es: "+suma);
	}

}
