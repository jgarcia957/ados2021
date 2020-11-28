package _01ejercicios._02arrays;

import java.util.Arrays;

public class _07DosArrays {
	public static void main(String[] args) {
		double [] a = {1.5, 2.5, 3.5};
		double [] b = {2.5, 7.5, 8.4};
		double [] c = {2.5, 7.5, 8.4, 1.0, 1.0};
		
		
		double [] suma1 = sumaArraysIguales(a,b);
		System.out.println(Arrays.toString(suma1));
		
		//Al vuelo
		System.out.println(Arrays.toString(sumaArraysIguales(a, b)));
		
		System.out.println(Arrays.toString(sumaArrays(a, c)));
		
	}
	
	public static double[] sumaArraysIguales(double[] a, double b[]){
		//Creamos el array que devolveremos
		double[] res = new double[a.length];
		
		for(int i = 0; i < res.length; i++){
			res[i] = a[i] + b[i];
		}
		
		return res;
	}

	public static double[] sumaArrays(double[] a, double b[]){
		//Creamos el array que devolveremos
		double[] res = new double[Math.max(a.length, b.length)];
		
		//Res tendrá todos los elementos a 0.

		//Le añadimos los valores de a
		for (int i = 0; i < a.length; i++) {
			res[i] += a[i];
		}
		//Le añadimos los valores de b
		for (int i = 0; i < b.length; i++) {
			res[i] += b[i];
		}
		return res;
	}
	
	
	
	
	
	
	
	
	
	
}
