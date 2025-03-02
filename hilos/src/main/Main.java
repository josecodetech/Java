package main;

public class Main {

	public static void main(String[] args) {
		MiHilo hilo1 = new MiHilo();
		MiHilo hilo2 = new MiHilo();
		hilo1.start();
		hilo2.start();

		Thread hilo3 = new Thread(new MiRunnable());
		Thread hilo4 = new Thread(new MiRunnable());
		hilo3.start();
		hilo4.start();
		
		Contador contador = new Contador();
		Runnable tarea = () -> {
			for (int i = 0; i<1000;i++) {
				contador.incrementar();
			}
		};
		Thread hilo5 = new Thread(tarea);
		Thread hilo6 = new Thread(tarea);
		hilo5.start();
		hilo6.start();
		try {
			hilo5.join();
			hilo6.join();
		}catch(InterruptedException e) {
			System.out.println("Hilo interrumpido.");
		}
		System.out.println("Cuenta final: "+contador.getCuenta());
		
	}

}
