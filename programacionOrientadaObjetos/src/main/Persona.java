package main;

public class Persona {
	// atributos, lo ponemos privado
	private String nombre;
	private int edad;
	// constructor
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	// getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	// metodos
	public void saludar() {
		System.out.println("Hola, mi nombre es "+nombre+" y tengo "+edad+" años.");
	}
}
