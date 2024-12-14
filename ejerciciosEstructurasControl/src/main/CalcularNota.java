package main;
import java.util.Scanner;
public class CalcularNota {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce tu nota: ");
		int nota = scanner.nextInt();
		if (nota<0 || nota>100) {
			System.out.println("Nota invalida.");
		} else if (nota < 60) {
			System.out.println("Suspenso.");
		} else if (nota<80) {
			System.out.println("Aprobado.");
		} else {
			System.out.println("Sobresaliente.");
		}
	}

}
