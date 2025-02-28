package main;

public class Calculadora {
	private int numOperaciones;

	public Calculadora() {
		this.numOperaciones = 0;
	}
	public int operacion(int a, int b) {
		numOperaciones++;
		return a * b;
	}
	public int operacion(int a, int b, String operacion) {
		numOperaciones++;
		if (operacion.equalsIgnoreCase("sumar")){
			return a + b;
				} else if (operacion.equalsIgnoreCase("restar")) {
					return a - b;
				} else {
					System.out.println("Operacion no valida");
					return 0;
				}
	}
	public int getNumOperaciones() {
		return numOperaciones;
	}

	
	
}
