package main;

import java.util.Random;

public class arrayAleatorio {

	public static void main(String[] args) {
		int[] numeros = generarAleatorios(10,1,100);
		System.out.println("Numeros aleatorios generados. ");
		for(int num:numeros) {
			System.out.print(num+" ");
		}
	}

	private static int[] generarAleatorios(int cantidad, int minimo, int maximo) {
		int[] numeros = new int[cantidad];
		Random aleatorio = new Random();
		for (int i = 0;i<cantidad;i++) {
			numeros[i]=aleatorio.nextInt(maximo-minimo+1)+minimo;
		}
		return numeros;
	}

}
