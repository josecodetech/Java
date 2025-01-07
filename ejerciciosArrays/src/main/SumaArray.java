package main;

import java.util.Scanner;

public class SumaArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce la cantidad de numeros: ");
		int n = scanner.nextInt();
		int[] numeros = new int[n];
		int suma = 0;
		for (int i=0;i<n;i++) {
			System.out.print("Introduce el numero "+(i+1)+": ");
			numeros[i]=scanner.nextInt();
			suma += numeros[i]; // suma = suma + numeros[i]
		}
		System.out.println("La suma total es: "+suma);
	}

}
