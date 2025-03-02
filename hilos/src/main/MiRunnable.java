package main;

public class MiRunnable implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i<= 5; i++) {
			System.out.println("Ejecutando hilo: "+Thread.currentThread().getName());
		}
		
	}

}
