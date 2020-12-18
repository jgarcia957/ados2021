package _00ejemplos._04Colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class _04Arrays {
	
	public static void main(String[] args) {
		//Como pasar elementos de un array a una colección
		
		String[] nombres = {"Luis","Angel","Ana"};
		List<String> listaNombres = Arrays.asList(nombres);
		System.out.println(listaNombres);
		
		//ArrayList (o LinkedList) a partir de array
		ArrayList<String> arrayListNombres = new ArrayList(Arrays.asList(nombres));
		
		//Set a partir de array
		TreeSet<Integer> treesetNombres = new TreeSet(Arrays.asList(nombres));
		System.out.println(treesetNombres);
		
		//De Collection a array
		Object[] nombres2 = listaNombres.toArray();
		System.out.println(Arrays.toString(nombres2));
		
		// Esto deberia dar error de ejecución, al hacer el casting
		// pero (no entiendo por qué), no da error
		String[] nombres3 = (String[]) listaNombres.toArray();
		System.out.println(Arrays.toString(nombres3));
		//-------------
		
		String[] nombres4 = listaNombres.toArray(new String[0]);
		System.out.println(Arrays.toString(nombres4));
		
		
		
		
	}

}
