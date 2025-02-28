package main;

public class Main {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		System.out.println("Multiplicacion (3*4): "+calc.operacion(3, 4));
		System.out.println("Suma (5+2): "+calc.operacion(5, 2, "sumar"));
		System.out.println("Resta (10-3): "+calc.operacion(10,3, "restar"));
		
		System.out.println("Numero de operaciones realizadas: "+calc.getNumOperaciones());
	}

}
