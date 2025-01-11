package main;

public class ejercicioArea {

	public static void main(String[] args) {
		double radio = 1.5;
		double resultado = areaCirculo(radio);
		System.out.println("El area del circulo es: "+resultado);
	}

	private static double areaCirculo(double radio) {
		return Math.PI * radio * radio;
	}

}
