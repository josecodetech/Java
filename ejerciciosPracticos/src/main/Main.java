package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Ingrese la cantidad de notas: "); int cantidad =
		 * sc.nextInt(); double[] notas = new double[cantidad]; double suma = 0; for
		 * (int i = 0; i < cantidad; i++) {
		 * System.out.println("Ingrese la nota "+(i+1)+": "); notas[i]=sc.nextDouble();
		 * suma += notas[i]; } double promedio = suma / cantidad;
		 * System.out.println("El promedio de las notas es: "+promedio); sc.close();
		 */
		
		  Scanner sc = new Scanner(System.in); int[] numeros = {3,7,15,20,25,30,45};
		  System.out.println("Ingrese el numero a buscar: "); int numeroUsuario =
		  sc.nextInt(); boolean encontrado = false; for (int num : numeros) { if (num
		  == numeroUsuario) { encontrado = true; break; } } if (encontrado) {
		  System.out.println("El numero "+numeroUsuario+ " esta en el array."); } else
		  { System.out.println("El numero "+numeroUsuario+
		  " no se encontro en el array."); } sc.close();
		 
		
	}

}
