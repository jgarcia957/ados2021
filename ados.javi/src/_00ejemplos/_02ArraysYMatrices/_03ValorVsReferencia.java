package _00ejemplos._02ArraysYMatrices;

import java.util.Arrays;

public class _03ValorVsReferencia {
	public static void main(String[] args) {
		int numero = 10;
		System.out.println("Antes: " + numero);
		incrementar(numero);
		System.out.println("Después: " + numero);
		
		int[] edad = {10,20,30};
		//System.out.println(edad);
		System.out.println(Arrays.toString(edad));
		incrementar(edad);
		System.out.println(Arrays.toString(edad));
		
		String nombre = "luis";
		System.out.println(nombre);
		duplicar(nombre);
		System.out.println(nombre);
		
		nombre = duplicar2(nombre);
		System.out.println(nombre);
		
	}
	
	//Paso de parámetros por valor: tipos primitivos
	public static void incrementar(int a){
		a++;
	}
	
	//Paso de parámetros por referencia: tipos no primitivos
	public static void incrementar(int[] v){
		for (int i = 0; i < v.length; i++) {
			v[i] ++;
		}
	}
	
	//En la práctica los tipos INVARIABLES funcionan como si el paso fuera por valor
	public static void duplicar(String n){
		n = n + n;
		System.out.println(n);
	}
	//Si quiero modificar un String la única salida es que el método devuelva uno nuevo
	public static String duplicar2(String n){
		n = n + n;
		return n;
	}
}
