package main;

public class Local {
	void mostrar() {
		class InternaLocal{
			void mensaje() {
				System.out.println("Clase dentro de un metodo.");
			}
		}
		InternaLocal obj = new InternaLocal();
		obj.mensaje();
	}
}
