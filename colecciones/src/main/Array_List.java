package main;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		lista.add("Manzana");
		lista.add("Banana");
		lista.add("Cereza");
		lista.add("Manzana");
		System.out.println("Lista: "+lista);
		lista.remove("Cereza");
		System.out.println("");
		System.out.println("Lista: "+lista);
		System.out.println(lista.get(1));
	}

}
