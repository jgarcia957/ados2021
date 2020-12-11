package _00ejemplos._03excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _11ExcepcionesComprobadasPropagar {
	public static void main(String[] args) {
		// Sumar los números contenidos en un fichero cuyo nombre indica el
		// usuario
		Scanner tec = new Scanner(System.in);
		boolean ok = false;
		do {
			System.out.println("Nombre del fichero: ");
			String nombreFichero = tec.next();
			try {
				int suma = sumarNumerosFichero(nombreFichero);
				ok = true;
				System.out.println("Suma: " + suma);
			} catch (FileNotFoundException e){
				System.out.println("Fichero incorrecto. Vuelve a introducir el nombre");
			}
		} while (!ok);
	}

	public static int sumarNumerosFichero(String nombreFichero) throws FileNotFoundException {
		int suma = 0;
		Scanner f = null;
		f = new Scanner(new File(nombreFichero));
		while (f.hasNext()) {
			int numero = f.nextInt();
			suma = suma + numero;
		}
		if (f != null)
			f.close();

		return suma;

	}

}
