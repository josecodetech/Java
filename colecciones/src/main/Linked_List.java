package main;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		LinkedList<String> lista = new LinkedList<>();
		lista.add("Uno");
		lista.add("Dos");
		System.out.println("Lista: "+lista);
		lista.addFirst("Cero");
		lista.addLast("Tres");
		System.out.println("Lista: "+lista);

	}

}
