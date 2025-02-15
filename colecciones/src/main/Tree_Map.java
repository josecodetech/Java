package main;

import java.util.TreeMap;

public class Tree_Map {

	public static void main(String[] args) {
		TreeMap<String, Integer> edades = new TreeMap<>();
		edades.put("Carlos",18);
		edades.put("Ana", 45);
		edades.put("Beatriz", 54);
		System.out.println("Edades ordenadas: "+edades);

	}

}
