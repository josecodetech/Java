package main;

import java.util.HashSet;

public class Hash_Set {

	public static void main(String[] args) {
		HashSet<String> conjunto = new HashSet<>();
		conjunto.add("Rojo");
		conjunto.add("Azul");
		conjunto.add("Verde");
		System.out.println("Conjunto: "+conjunto);
		conjunto.add("Rojo");
		System.out.println("Conjunto: "+conjunto);

	}

}
