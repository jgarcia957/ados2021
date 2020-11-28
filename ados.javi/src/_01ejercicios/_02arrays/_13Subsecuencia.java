package _01ejercicios._02arrays;

public class _13Subsecuencia {
	public static void main(String[] args) {
		int[] numeros = { 8 , 2, 9, 1, 3, 3, 4, 5};
		System.out.println(posSecuenciaDeN(numeros,3));
		
	}
	public static int posSecuenciaDeN (int[] v, int n){
		
		int posSecuencia = -1;
		boolean enc = false;
		for (int i = 0; i <= v.length - n && !enc; i++) {
			if (existeSecuencia(v, n, i)) {
				posSecuencia = i;
				enc = true;
			}
		}
		return posSecuencia;
	}
	
	//Devuelve true si hay una secuencia de n o más elementos
	//en la posición pos del array
	public static boolean existeSecuencia(int[] v, int n, int pos){
		int cont = 0;
		int i = pos;
		while (i < v.length - 1 && cont < n-1 && v[i] == v[i+1] - 1){
			cont++;
			i++;
		}
		return cont == n - 1;
	}
	

}
