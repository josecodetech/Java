package main;

public class Main {

	public static void main(String[] args) {
		// Ejemplo.contador;
		/* Ejemplo objeto1 = new Ejemplo();
		objeto1.contador=1;
		System.out.println("Desde objeto creado. "+objeto1.contador);
		System.out.println("Sin crear objeto "+Ejemplo.contador);*/
		
		new Contador();
		new Contador();
		new Contador();
		System.out.println("Objetos creados: "+Contador.cuenta);
		
		double euros = Conversor.dolaresEuros(100);
		System.out.println("100 dolares son "+euros+" euros.");
		
		System.out.println("Version del sistema: "+Configuracion.version);
		
		Externa.Interna obj = new Externa.Interna();
		obj.mostar();
		
	}

}
