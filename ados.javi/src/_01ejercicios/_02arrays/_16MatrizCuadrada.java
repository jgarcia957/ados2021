package _01ejercicios._02arrays;

import java.util.Arrays;

public class _16MatrizCuadrada {
	public static void main(String[] args) {
		int[][] m ={{1,2,3},{4,5,6},{7,8,9}};
		intercambiarFilas2(m,0,2);
		for (int i = 0; i < m.length; i++) {
			System.out.println(Arrays.toString(m[i]));
		}
	}
	
	public static void mostrarDiagonalPrincipal(int [][] m){
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i][i]);
		}
	}
	public static int filaDelMayor(int [][] m){
		int mayor = Integer.MIN_VALUE;
		int filaMayor = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(m[i][j] > mayor){
					mayor = m[i][j];
					filaMayor = i;
				}
			}
		}
		return filaMayor;
	}
	
	public static void intercambiarFilas1(int[][] m, int f1, int f2){
		//Recorremos las columnas de la matriz.
		
		for (int j = 0; j < m[0].length; j++) {
			//En cada columna intercambiamos los valores de las
			//filas indicadas
			int aux = m[f1][j];
			m[f1][j] = m[f2][j];
			m[f2][j] = aux;
		}
	}

	public static void intercambiarFilas2(int[][] m, int f1, int f2){
		int[] aux;
		aux = m[f1];
		m[f1] = m[f2];
		m[f2] = aux;
	}
}




