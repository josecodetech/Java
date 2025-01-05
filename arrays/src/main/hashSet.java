package main;

import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {
		// creamos hashset
		HashSet<String> conjunto = new HashSet<>();
		// agregamos elementos
		conjunto.add("Rojo");
		conjunto.add("Verde");
		conjunto.add("Azul");
		conjunto.add("Rojo"); // no se añadira, ya existe
		// mostramos elementos
		System.out.println("Elementos del conjunto: "+conjunto);
		// recorremos 
		for (String color:conjunto) {
			System.out.println("Color: "+color);
		}

	}

}
