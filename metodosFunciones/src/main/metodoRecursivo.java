package main;

public class metodoRecursivo {

	public static void main(String[] args) {
		int numero = 4;
		System.out.println("El factorial de "+numero+" es: "+factorial(numero));

	}

	private static int factorial(int n) {
		if (n==0) {
			return 1; // caso base
		} else {
			return n * factorial(n-1); // llamada recursiva
		}
	}

}
