package _01ejercicios._02arrays;

import java.util.Arrays;

public class _04Invertir {
	public static void main(String[] args) {
		int[] original = {2,4,6,8,10,12};
		
		//Guardando en una variable e imprimiendo
		int[] invertido = invertirArray(original);
		System.out.println(Arrays.toString(invertido));
		
		//Imprimiendo "al vuelo"
		System.out.println(Arrays.toString(invertirArray2(original)));
		
	}
	
	public static int[] invertirArray( int[] v){
		//Creamos un array del mismo tamaño que v
		int[] res = new int[v.length];
		
		//Recorremos v y copiamos los elementos a res
		int pos = v.length-1;
		for (int i = 0; i < v.length; i++) {
			res[pos] = v[i];
			pos--;
		}
		return res;
	}
	public static int[] invertirArray2( int[] v){
		//Creamos un array del mismo tamaño que v
		int[] res = new int[v.length];
		
		//Recorremos v y copiamos los elementos a res
		int i = 0;
		int j = v.length-1;
		while(i< v.length){
			res[j] = v[i];
			i++;
			j--;
		}
		return res;
	}
	public static int[] invertirArray3( int[] v){
		//Creamos un array del mismo tamaño que v
		int[] res = new int[v.length];
		
		//Recorremos v y copiamos los elementos a res
		for (int i = 0; i < v.length; i++) {
			res[v.length-1-i] = v[i];
		}
		return res;
	}
	
}

