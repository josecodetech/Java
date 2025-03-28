package main;

public class Main {

	public static void main(String[] args) {
		Externa.Interna objeto = new Externa.Interna();
		objeto.mostrarMensaje();
		
		Externa02 externa = new Externa02();
		Externa02.Interna interna = externa.new Interna();
		interna.mostrarMensaje();
		
		IMensaje mensaje = new IMensaje() {
			@Override
			public void mostrar() {
				System.out.println("Este es un mensaje desde clase anonima.");
			}
		};
		mensaje.mostrar();
		
		Local ejemplo = new Local();
		ejemplo.mostrar();
	}

}
