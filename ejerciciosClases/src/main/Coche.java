package main;

public class Coche {
	private String marca;
	private String modelo;
	private int velocidad;
	// constructor
	public Coche(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = 0; // velocidad inicial
	}
	// metodos
	public void acelerar() {
		velocidad += 10; // velocidad = velocidad + 10		
	}
	public void frenar() {
		if (velocidad >= 10) {
			velocidad -= 10;
		} else {
			velocidad = 0;
		}
	}
	public void mostrarInfo() {
		System.out.println("Marca: "+marca);
		System.out.println("Modelo: "+modelo);
		System.out.println("Velocidad: "+velocidad+" km/h");
	}
}
