package main;

public class Externa02 {
	private String mensaje = "Hola desde la clase externa.";
	class Interna{
		void mostrarMensaje() {
			System.out.println(mensaje);
		}
	}
}
