package main;

public class metodoParametro {

	public static void main(String[] args) {
		sumar(5,10); // llamada a metodo con parametros
		sumar(15,2);
	}

	private static void sumar(int num1, int num2) {
		int resultado = num1 + num2;
		System.out.println("La suma es: "+resultado);
		
	}

}
