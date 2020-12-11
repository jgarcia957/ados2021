package _00ejemplos._03excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _10ExcepcionesComprobadas {
	public static void main(String[] args) {
		//Sumar los números contenidos en un fichero cuyo nombre indica el usuario
		Scanner tec = new Scanner(System.in);
		System.out.println("Nombre del fichero: ");
		String nombreFichero = tec.next();
		
		int suma = sumarNumerosFichero(nombreFichero);
		System.out.println("Suma: " + suma);
	}
	
	public static int sumarNumerosFichero(String nombreFichero){
		int suma = 0;
		Scanner f = null;
		try {
			f = new Scanner(new File(nombreFichero));
			while(f.hasNext()){
				int numero = f.nextInt();
				suma = suma + numero;
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se puede abrir el fichero");
		} finally {
			if(f != null) f.close();
			return suma;
		}
		
		
		//return suma;
	}

}
