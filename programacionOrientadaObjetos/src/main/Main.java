package main;

public class Main {

	public static void main(String[] args) {
		// creamos objeto de la clase persona
		Persona persona1 = new Persona("Jose",53);
		// asignamos valores a los atributos
		// persona1.nombre = "Jose";
		// persona1.edad = 53;
		// llamar a metodo
		// persona1.saludar();
		Persona persona2 = new Persona("Eva",12);
		// persona2.nombre = "Eva";
		// persona2.edad = 12;
		// persona2.setNombre("Eva");
		// persona2.setEdad(12);
		persona2.saludar();
		System.out.println(persona2.getNombre());
		Perro perro1 = new Perro();
		// metodo heredado
		perro1.comer();
		// metodo propio
		perro1.ladrar();
		// Animal miAnimal;
		Animal miAnimal01 = new Perro();
		miAnimal01.hacerSonido(); // llama al metodo de perro
		Animal miAnimal02 = new Gato();
		miAnimal02.hacerSonido(); // llama al metodo de gato
		
	}

}
