package main;

public class arrayMultidimensional {

	public static void main(String[] args) {
		int [][] tabla = {
				{1,2,3},
				{4,5,6}
		};
		// acceder a elementos
		System.out.println("Elemento en posicion [1][2]: "+tabla[1][2]);
		for (int i = 0; i<tabla.length; i++) {
			for (int j = 0; j<tabla[i].length; j++) {
				System.out.print(tabla[i][j]+" ");
			}
			System.out.println();
		}
	}

}
