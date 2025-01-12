package main;

public class contarVocales {

	public static void main(String[] args) {
		String texto = "Programar es divertido";
		System.out.println("La cantidad de vocales es: "+contarVocales(texto));

	}

	private static int contarVocales(String texto) {
		int contador = 0;
		String vocales = "aeiouAEIOU";
		for (int i = 0; i<texto.length();i++) {
			if(vocales.contains(Character.toString(texto.charAt(i)))) {
				contador++;
			}
		}
		return contador;
	}

}
