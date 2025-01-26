package main;
import java.util.Scanner;
public class entradaSalidaConsola {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("Dime tu edad: ");
		int edad = scanner.nextInt();
		System.out.println("Hola "+nombre+", tienes "+edad+" años.");

	}

}
