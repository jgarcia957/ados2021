package _00ejemplos._04Colecciones;

import java.util.Scanner;
import java.util.TreeMap;

public class _06PalabrasFrase {
	//El usuario introduce una frase y le decimos cuantas veces se repite cada palabra
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Frase: ");
		String frase = tec.nextLine();
		
		TreeMap<String, Integer> veces = new TreeMap<>();
		
		//Convertimos la frase en un array de String
		String[] palabrasFrase = frase.split(" ");
		for (int i = 0; i < palabrasFrase.length; i++) {
			if(veces.containsKey(palabrasFrase[i])){
				int antes = veces.get(palabrasFrase[i]);
				veces.put(palabrasFrase[i], antes + 1);
				
			} else {
				//Es la primera vez que aparece la palabra en la frase
				veces.put(palabrasFrase[i], 1);
			}
		}
		System.out.println(veces);
		veces.clear();
		//De otra forma: 
		for (int i = 0; i < palabrasFrase.length; i++) {
			Integer valor = veces.get(palabrasFrase[i]);
			if(valor == null){
				valor = 1;
			} else {
				valor = valor + 1;
			}
			veces.put(palabrasFrase[i], valor);
		}
		System.out.println(veces);
	}

}
