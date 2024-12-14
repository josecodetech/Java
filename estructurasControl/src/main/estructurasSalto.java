package main;

public class estructurasSalto {

	public static void main(String[] args) {
		// Break
		for (int i = 1; i<=10;i++) {
			if (i==5) {
				System.out.println("Se detiene en el numero: "+i);
				break;
			}
			System.out.println("Numero: "+i);
		}
		
		// Continue
		for (int i = 1; i<=5; i++) {
			if (i==3) {
				continue;
			}
			System.out.println("Numero: "+i);
		}
		
		// Return
		System.out.println("Inicio del programa.");
		if (true) {
			System.out.println("Terminando programa antes...");
			return;
		}
		System.out.println("Esto no se ejecutara.");
	}

}
