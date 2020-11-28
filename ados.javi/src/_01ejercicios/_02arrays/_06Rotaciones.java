
package _01ejercicios._02arrays;

import java.util.Arrays;

public class _06Rotaciones {
	public static void main(String[] args) {
		int[] numeros = {1,2,3,4};
		System.out.println(Arrays.toString(numeros));
		for(int veces = 0; veces < numeros.length; veces++){
			rotarDerecha(numeros);
			System.out.println(Arrays.toString(numeros));
			
		}
	}
	public static void rotarDerecha(int[] v){
		//Salvamos el ultimo elemento
		int aux = v[v.length-1];
		
		for (int i = v.length-1; i >= 1; i--) {
			v[i] = v[i-1];
		}
		
		//Copiamos en la primera posición el elemento salvado
		v[0] = aux;
	}
	public static void rotarDerecha2(int[] v){
		//Apoyandonos en otro array

		//Hacemos un duplicado de v
		int[] aux = new int[v.length];
		for (int i = 0; i < v.length; i++) {
			aux[i] = v[i];
		}
		//Copiamos aux en v, pero desplazando a la derecha
		for (int i = 0; i < aux.length-1; i++) {
			v[i+1] = aux[i];
		}
		v[0] = aux[aux.length-1];
	}
}
