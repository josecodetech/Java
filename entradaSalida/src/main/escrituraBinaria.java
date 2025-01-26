package main;

import java.io.FileOutputStream;
import java.io.IOException;

public class escrituraBinaria {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("salida.bin")){
			fos.write(new byte[] {65,66,67,68});
			System.out.println("Archivo binario creado.");
		}catch(IOException e) {
			System.out.println("Error al escribir en el archivo binario: "+e.getMessage());
		}

	}

}
