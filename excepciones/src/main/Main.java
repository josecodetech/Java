package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int resultado = a / b;
			System.out.println("Resultado: "+ resultado);
		} catch (ArithmeticException e) {
			System.out.println("Error: No se puede dividir entre cero.");
		} finally {
			System.out.println("Esto siempre se ejecuta, de error o no.");
		}
		// multiples excepciones
		try {
			int[] numeros = {1,2,3};
			System.out.println(numeros[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Indice fuera de limite.");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico: "+e.getMessage());
		}
		// lanzamos excepcion propia
		int edad = 18;
		try {
			verificarEdad(edad);
		} catch (IllegalArgumentException e) {
			System.out.println("Excepcion capturada: "+e.getMessage());
		}
		
		// declara excepciones con throws en metodo
		try {
			leerArchivo("no_existo.txt");
		} catch (IOException e) {
			System.out.println("Error: No se pudo leer el archivo");
		}
	}

	private static void leerArchivo(String nombreArchivo) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
		System.out.println(br.readLine());
		br.close();
	}

	private static void verificarEdad(int edad) {
		if (edad < 18) {
			throw new IllegalArgumentException("La edad debe ser mayor o igual a 18.");
		}
		System.out.println("Edad valida: "+edad);
		
	}
	

}
