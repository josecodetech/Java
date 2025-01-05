package main;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// creamos arraylist
		ArrayList<String> lista = new ArrayList<>();
		// agregamos elementos
		lista.add("Manzana");
		lista.add("Platano");
		lista.add("Fresas");
		// mostramos elementos
		System.out.println("Elementos de la lista: "+lista);
		// accedemos a un elemento
		System.out.println("Elemento en indice 1: "+lista.get(1));
		// eliminar un elemento
		lista.remove("Platano");
		// recorrer lista
		for (String fruta : lista) {
			System.out.println("Fruta: "+fruta);
		}
	}

}
