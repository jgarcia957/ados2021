package _01ejercicios._04Colecciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class _06TraductorSimple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner f = null;
		HashMap<String, String> diccionario = new HashMap<>();
		
		try{
			//Rellenamos diccionario con palabras y su traduccion
			f = new Scanner(new File("diccionario.txt"));
			while(f.hasNext()){
				String esp = f.next();
				String ingl = f.next();
				diccionario.put(esp, ingl);
			}
			//Leemos frase y traducimos
			System.out.println("Introduce frase: ");
			String frase = sc.nextLine();
			String[] palabrasFrase = frase.split(" ");
			
			String traduccion = "";
			for(String palabra: palabrasFrase){
				String ingles = diccionario.get(palabra);
				if(ingles == null){
					traduccion += palabra + " ";
				} else {
					traduccion += ingles + " ";
				}
			}
			System.out.println("Frase traducida: ");
			System.out.println(traduccion);
		} catch (FileNotFoundException e){
			System.out.println("No se pudo abrir");
		} finally{
			f.close();
		}
		
	}

}
