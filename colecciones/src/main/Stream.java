package main;

import java.util.Arrays;
import java.util.List;

public class Stream {

	public static void main(String[] args) {
		List<String> nombres = Arrays.asList("Ana", "Luis", "Carlos","Lucia");
		nombres.stream()
				.filter(nombre -> nombre.startsWith("L"))
				.map(String::toUpperCase)
				.forEach(System.out::println);

	}

}
