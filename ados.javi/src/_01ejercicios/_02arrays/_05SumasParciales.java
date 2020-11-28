package _01ejercicios._02arrays;

import java.util.Arrays;

public class _05SumasParciales {
	public static void main(String[] args) {
		int[] original = {2,4,6,8,10,12};
		
		//Guardando en una variable e imprimiendo
		int[] suma = sumaParcial(original);
		System.out.println(Arrays.toString(suma));
	}
	
	public static int[] sumaParcial( int[] v){
		//Creamos un array del mismo tamaño que v
		int[] t = new int[v.length];
		
		t[0] = v[0];
		for (int i = 1; i < t.length; i++) {
			t[i] = t[i-1] + v[i];
		}
		
		return t;
	}
	public static int[] sumaParcialLenta( int[] v){
		//Creamos un array del mismo tamaño que v
		int[] t = new int[v.length];
		
		for (int i = 0; i < t.length; i++) {
			//Calculamos la suma desde v[0] hasta v[i]
			int suma = 0;
			for(int j = 0; j <= i; j++) {
				suma = suma + v[j];
			}
			//Guardamos en t[i]
			t[i] = suma;
		}
		
		return t;
	}
}

