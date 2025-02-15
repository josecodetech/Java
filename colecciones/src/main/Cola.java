package main;

import java.util.PriorityQueue;

public class Cola {

	public static void main(String[] args) {
		PriorityQueue<Integer> cola = new PriorityQueue<>();
		cola.add(30);
		cola.add(10);
		cola.add(20);
		System.out.println(cola);
		while (!cola.isEmpty()) {
			System.out.println(cola.poll());
		}
		System.out.println(cola);
	}

}
