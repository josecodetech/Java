package main;

public class numeroPrimo {

	public static void main(String[] args) {
		int numero = 29;
		System.out.println("Es "+numero+" un numero primo? "+esPrimo(numero));

	}

	private static boolean esPrimo(int numero) {
		if (numero<=1) return false;
		for (int i = 2; i<= Math.sqrt(numero);i++) {
			if(numero % i == 0) {
				return false;
			}
		}
		return true;
	}

}
