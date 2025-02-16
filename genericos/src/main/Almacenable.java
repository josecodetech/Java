package main;

public interface Almacenable<T> {
	void guardar(T elemento);
	T obtener();
}
