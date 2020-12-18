package _00ejemplos._04Colecciones;

import java.util.Set;
import java.util.TreeMap;

public class _05Map {
	public static void main(String[] args) {
		TreeMap<String, Integer> veces = new TreeMap<>();
		
		//Inserción de parejas
		veces.put("de",18);
		veces.put("esquina",1);
		System.out.println(veces.put("la", 20));
		System.out.println(veces.put("la", 21));
		veces.put("cocina", 2);
		System.out.println(veces);
		
		//Eliminación (por clave)
		System.out.println(veces.remove("la"));
		System.out.println(veces);
		
		//Consultas
		System.out.println(veces.containsKey("cocina"));
		System.out.println(veces.containsValue(37));
		
		System.out.println(veces.get("cocina"));
		
		
		//Recorrido de un Map
		Set<String> claves = veces.keySet();
		for(String c: claves) {
			Integer valor = veces.get(c);
			System.out.println(c + " - " + valor);
		}
		
		
		
		
	}
}
