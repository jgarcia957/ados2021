package _00ejemplos._05clases.interfaces;

import java.util.Arrays;

public class TestOrdenacion {
	public static void main(String[] args) {
		//Ordenar un array de 2 String
		String[] v1 = {"coche","casa"};
		Ordenacion.ordenar(v1);
		System.out.println(Arrays.toString(v1));
		
		//Ordenar un array de vinos
		Vino[] v2 = { new Vino("casas viejas",2018), new Vino("aguja",2019)};
		//Ordenacion.ordenar(v2);
		Ordenacion.ordenar2(v2);
		
		System.out.println(Arrays.toString(v2));
		
		//Hay clases que utilizan el interface comparable
		Arrays.sort(v1);
		
		
	}

}
