package main;

import java.util.Scanner;

public class MayorMenor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("¿Cuantos numeros vas a introducir? ");
		int n = entrada.nextInt();
		int[] numeros = new int[n];
		System.out.println("Introduce los numeros: ");
		for (int i=0;i<n;i++) {
			numeros[i]=entrada.nextInt();
		}
		int mayor = numeros[0];
		int menor = numeros[0];
		for (int i = 1;i<n;i++) {
			if(numeros[i]>mayor) mayor = numeros[i];
			if(numeros[i]<menor) menor = numeros[i];
		}
		System.out.println("El numero mayor es: "+mayor);
		System.out.println("El numero menor es: "+menor);
	}

}
