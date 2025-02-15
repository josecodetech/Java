package main;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {
		HashMap<Integer, String> mapa = new HashMap<>();
		mapa.put(1, "Uno");
		mapa.put(2, "Dos");
		mapa.put(3, "Tres");
		System.out.println("Valor de clave 2: "+mapa.get(2));
		System.out.println("Mapa completo: "+mapa);
		System.out.println("Tamaño del diccionario: ");
		System.out.println(mapa.size());

	}

}
