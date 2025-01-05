package main;

import java.util.HashMap;

public class hashMap {

	public static void main(String[] args) {
		// creamos hashMap
		HashMap<Integer,String> mapa = new HashMap<>();
		// agregamos valores
		mapa.put(1, "Uno");
		mapa.put(2, "Dos");
		mapa.put(3, "Tres");
		// mostramos
		System.out.println("Contenido del mapa: "+mapa);
		// accedemos a valor
		System.out.println("Clave 2: "+mapa.get(2));
		// recorrerlo
		for (Integer clave:mapa.keySet()) {
			System.out.println("Clave: "+clave+", Valor: "+mapa.get(clave));
		}
	}

}
