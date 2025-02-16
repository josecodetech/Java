package main;

import java.util.List;

public class Util {
	public static void imprimirLista(List<?> lista) {
		for (Object elem : lista) {
			System.out.println(elem);
		}
	}
}
