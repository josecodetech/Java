package main;

public class Operaciones<T extends Number> {
	private T numero;
	public Operaciones(T numero) {
		this.numero = numero;
	}
	public double obtenerDoble() {
		return numero.doubleValue()*2;
	}
}
