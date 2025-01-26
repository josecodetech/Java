package main;

import java.io.FileInputStream;
import java.io.IOException;

public class lecturaBinaria {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("salida.bin")){
			int byteLeido;
			while ((byteLeido = fis.read())!=-1) {
				System.out.print(byteLeido + " ");
			}
		} catch (IOException e) {
			System.out.println("Error al leer el archivo binario: "+e.getMessage());
		}
	}

}
