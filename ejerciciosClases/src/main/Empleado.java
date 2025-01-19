package main;

public class Empleado {
	// atributos
	private String nombre;
	private double salario;
	// constructor
	public Empleado(String nombre, double salario)
	{
		this.nombre = nombre;
		this.salario = salario;
	}
	// metodos
	public void incrementarSalario(double porcentaje) {
		salario += salario * (porcentaje / 100);
	}
	public void mostrarInfo() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Salario: "+ salario);
	}
}
