package _01ejercicios._04Colecciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class _04PalabrasTexto {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Nombre del fichero: ");
		String nomFich = tec.next();
		Scanner f = null;
		try {
			f = new Scanner(new File(nomFich));
			LinkedHashSet<String> palabras = new LinkedHashSet<>(); //Orden de aparición
			while(f.hasNext()){
				String palabra = f.next();
				palabras.add(palabra);
			}
			
			System.out.println("Palabras del texto: ");
			for(String p: palabras){
				System.out.println(p);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe");
		} finally{
			if(f != null) f.close();
		}
		
	}

}
