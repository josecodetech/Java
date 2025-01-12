package main;

public class invertirCadena {

	public static void main(String[] args) {
		String texto = "Estoy programando en Java";
		System.out.println("Texto original: "+texto);
		System.out.println("Texto invertido: "+invertirCadena(texto));

	}

	private static String invertirCadena(String texto) {
		String invertido = "";
		for (int i = texto.length()-1; i>=0;i--) {
			invertido += texto.charAt(i);
		}
		return invertido;
	}

}
