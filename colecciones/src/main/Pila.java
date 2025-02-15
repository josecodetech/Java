package main;

import java.util.Stack;

public class Pila {

	public static void main(String[] args) {
		Stack<String> pila = new Stack<>();
		pila.push("Uno");
		pila.push("Dos");
		pila.push("Tres");
		System.out.println("Pila inicial: "+pila);
		System.out.println("Elemento superior: "+pila.peek());
		System.out.println("Elemento eliminado: "+pila.pop());
		System.out.println("Pila final: "+pila);
		System.out.println("Elemento eliminado: "+pila.pop());
		System.out.println("Pila final: "+pila);
	}

}
