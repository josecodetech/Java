package main;

public class Perro extends Animal{
	public void ladrar() {
		System.out.println("El perro esta ladrando.");
	}
	@Override
	public void hacerSonido() {
		System.out.println("El perro ladra.");
	}
}
