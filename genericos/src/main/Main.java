package main;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// caja para almacenar texto
		Caja<String> cajaTexto = new Caja<>();
		cajaTexto.guardar("Hola, genericos en Java");
		System.out.println("Contenido de la caja: "+cajaTexto.obtener());
		
		// caja para almacenar numeros
		Caja<Integer> cajaNumero = new Caja<>();
		cajaNumero.guardar(100);
		System.out.println("Contenido de la caja: "+cajaNumero.obtener());
		
		// metodo generico
		Utilidades.imprimir(10);
		Utilidades.imprimir("Texto");
		Utilidades.imprimir(3.14);
		
		// interfaz generica
		Almacenable<String> texto = new Deposito<>();
		texto.guardar("Mensaje guardado");
		System.out.println("Obtenido: "+texto.obtener());
		
		// limitar a tipos numericos
		Operaciones<Integer> entero = new Operaciones<>(10);
		Operaciones<Double> decimal = new Operaciones<>(5.5);
		System.out.println("Doble de 10: "+entero.obtenerDoble());
		System.out.println("Doble de 5.5: "+decimal.obtenerDoble());
		
		// wildcards, no especifica tipo
		List<Integer> numeros = Arrays.asList(1,2,3);
		List<String> palabras = Arrays.asList("Hola", "Mundo");
		Util.imprimirLista(numeros);
		Util.imprimirLista(palabras);
	}

}
