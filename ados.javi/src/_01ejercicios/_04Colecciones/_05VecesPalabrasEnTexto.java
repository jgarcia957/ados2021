package _01ejercicios._04Colecciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class _05VecesPalabrasEnTexto {
	public static void main(String[] args) {
		Scanner f = null;
		HashMap<String, Integer> veces = new HashMap<>();
		
		try{
			f = new Scanner(new File("palabras.txt"));
			while(f.hasNext()){
				String palabra = f.next();
				
				if(veces.containsKey(palabra)){
					int antes = veces.get(palabra);
					veces.put(palabra, antes+1);
				} else {
					veces.put(palabra, 1);
				}
			}
						
			for(String pal: veces.keySet()){
				System.out.println(pal + ": " + veces.get(pal));
			}
		} catch (FileNotFoundException e){
			System.out.println("No se pudo abrir");
		} finally{
			if(f != null) f.close();
		}
	}

}
