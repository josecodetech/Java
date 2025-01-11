package main;

public class ejercicioPotencia {

	public static void main(String[] args) {
		
		double resultado = potencia(2.2,3.5);
		System.out.println(resultado);
	}

	private static double potencia(double base, double exponente) {
		return Math.pow(base, exponente);
		
	}

}
