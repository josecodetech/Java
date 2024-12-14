package main;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero = scanner.nextInt();
		for (int i = 1; i <= 10;i++) {
			System.out.println(numero + " x "+i+" = "+(numero * i ));
		}
	}

}
