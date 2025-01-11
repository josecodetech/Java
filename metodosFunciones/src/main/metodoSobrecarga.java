package main;

public class metodoSobrecarga {

	public static void main(String[] args) {
		saludar(); // llamada sin parametros
		saludar("@josecodetech"); // llamada con parametros
	}
	public static void saludar() {
		System.out.println("Hola");
	}
	public static void saludar(String nombre) {
		System.out.println("Hola, "+nombre);
	}
}
