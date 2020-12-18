package _00ejemplos._04Colecciones;

import java.util.LinkedList;
import java.util.List;

public class _02List {
	public static void main(String[] args) {
		List<String> l = new LinkedList<>();
		
		//Anyadir elementos al final (Collection)
		l.add("casa");
		l.add("coche");
		System.out.println(l);
		
		//Insertar elementos en una posicion (List)
		l.add(1,"moto" );
		System.out.println(l);
		
		//Eliminar por contenido (Collection)
		System.out.println(l.remove("moto"));
		System.out.println(l);
		
		//Eliminar por posicion (List)
		System.out.println(l.remove(0));
		System.out.println(l);
		
		//Busquedas ...
		System.out.println(l.contains("casa")); //Collection
		System.out.println(l.indexOf("casa")); //List
		System.out.println(l.get(0)); //List
		System.out.println(l.set(0, "hotel")); //List
		System.out.println(l);
	}
}
