package main;

public class Deposito<T> implements Almacenable<T> {
	private T objeto;
	@Override
	public void guardar(T elemento) {
		this.objeto = elemento;
		
	}

	@Override
	public T obtener() {
		return objeto;
	}

}
