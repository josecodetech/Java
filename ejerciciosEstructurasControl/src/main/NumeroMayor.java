package main;

import java.util.Scanner;

public class NumeroMayor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el primer numero: ");
		int num1 = scanner.nextInt();
		System.out.println("Introduce el segundo numero: ");
		int num2 = scanner.nextInt();
		System.out.println("Introduce el tercero numero: ");
		int num3 = scanner.nextInt();
		if (num1 > num2 && num1 > num3) {
			System.out.println("El mayor es: "+num1);
		
		} else if (num2 > num3) {
			System.out.println("El mayor es: "+num2);
		} else {
			System.out.println("El mayor es: "+num3);
		}
	}

}
