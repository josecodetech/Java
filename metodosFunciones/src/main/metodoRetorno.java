package main;

public class metodoRetorno {

	public static void main(String[] args) {
		int producto = multiplicar(6,5);
		System.out.println("El producto es: "+producto);

	}

	private static int multiplicar(int num1, int num2) {
		
		return num1*num2;
	}

}
