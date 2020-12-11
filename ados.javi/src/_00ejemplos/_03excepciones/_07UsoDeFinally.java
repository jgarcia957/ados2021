package _00ejemplos._03excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class _07UsoDeFinally {
	public static void main(String[] args) {
		//Escribir en un fichero de texto los números del 1 al 100
		PrintStream f = null;
 		try {
			//Abrir el fichero
			f = new PrintStream(new File("numeros1a100.txt"));
			
			//Escribir el fichero
			for(int num = 1; num <= 100; num++){
				f.println(num);				
			}			
		} catch (FileNotFoundException e) {
			System.out.println("No se puede crear o escribir el fichero");
		} finally {
			if (f != null) f.close();
		}
		
	}

}
