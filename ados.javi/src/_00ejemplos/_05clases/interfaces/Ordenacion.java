package _00ejemplos._05clases.interfaces;

public class Ordenacion {
	
	public static void ordenar (Comparable [] v){
		//Ordena los dos primeros elementos del array
		if(v[0].compareTo(v[1]) > 0){
			Comparable aux = v[0];
			v[0] = v[1];
			v[1] = aux;
		}
	}
	public static void ordenar2 (Object [] v){
		//Ordena los dos primeros elementos del array
		if(((Comparable)v[0]).compareTo(v[1]) > 0){
			Object aux = v[0];
			v[0] = v[1];
			v[1] = aux;
		}
	}

}
