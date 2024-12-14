package main;

import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int secreto = random.nextInt(100)+1; // numero aleatorio entre 1 y 100
		int intento = 0;
		
		System.out.println("Adivina el numero entre 1 y 100 ");
		
		while(true) {
			System.out.println("Introduce el numero: ");
			intento = scanner.nextInt();
			if (intento == secreto) {
				System.out.println("Felicidades, has acertado.");
				break;
			} else if (intento < secreto) {
				System.out.println("El numero secreto es mayor.");
			} else {
				System.out.println("El numero secreto es menor.");
			}
		}
		
		
	}

}
