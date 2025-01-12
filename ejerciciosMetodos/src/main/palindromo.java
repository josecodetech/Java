package main;

public class palindromo {

	public static void main(String[] args) {
		String palabra = "radar";
		System.out.println("Es "+palabra+" un palindromo? "+esPalindromo(palabra));

	}

	private static boolean esPalindromo(String palabra) {
		int inicio = 0;
		int fin = palabra.length()-1;
		while(inicio<fin) {
			if (palabra.charAt(inicio)!=palabra.charAt(fin)) {
				return false;
			}
			inicio++;
			fin--;
		}
		return true;
	}

}
