package _01ejercicios._02arrays;

public class _12Subsecuencia {
	public static void main(String[] args) {
		int[] numeros = { 8 , 2, 9, 1, 3, 2, 4, 5};
		System.out.println(posSecuenciaDe3(numeros));
		
	}
	public static int posSecuenciaDe3 (int[] v){
		
		int posSecuencia = -1;
		boolean enc = false;
		for (int i = 0; i < v.length - 2 && !enc; i++) {
			if (v[i] + 1 == v[i+1] && v[i] + 2 == v[i+2]) {
				posSecuencia = i;
				enc = true;
			}
		}
		return posSecuencia;
	}

}
