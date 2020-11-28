package _01ejercicios._02arrays;

public class _02Lluvias {
	public static void main(String[] args) {
		double[] precip = { 2.3, 2.2, 2.1, 2.0, 1.8, 0.0, 0.0, 0.0, 0.0, 0.0, 12, 13, 12, 12, 13, 20, 21, 22, 23, 24,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 8 };
		// Lluvia total
		System.out.println("Lluvia total: " + lluviaTotal(precip));
		// Lluvia media
		System.out.println("Lluvia media: " + lluviaMedia(precip));
		// Lluvia máxima
		System.out.println("LLuvia maxima: " + lluviaMaxima(precip));
		// Cuántos días llovió cierta cantidad
		System.out.println("Cuantos días llovió 2.1 litros: " + contarDiasLluviaX(precip, 2.1));
		System.out.println("Dias sin lluvia: " + contarDiasLluviaX(precip, 0));
	}

	public static double lluviaTotal(double[] p) {
		// Recorro el array sumando sus componentes
		double suma = 0;
		for (int i = 0; i < p.length; i++) {
			suma += p[i];
		}
		return suma;
	}

	public static double lluviaMedia(double[] p) {
		// Recorro el array sumando sus componentes
		double suma = 0;
		for (int i = 0; i < p.length; i++) {
			suma += p[i];
		}
		return suma / p.length;
	}

	public static double lluviaMedia2(double[] p) {
		double suma = lluviaTotal(p);
		return suma / p.length;
	}

	public static double lluviaMaxima(double p[]) {
		// Suponemos que el maximo esta en la posicion 0
		double max = p[0];
		// Recorremos a partir de la posicion 1
		for (int i = 1; i < p.length; i++) {
			if (p[i] > max) {
				max = p[i];
			}
		}
		return max;
	}

	public static double lluviaMinima(double p[]) {
		// Suponemos que el minimo esta en la posicion 0
		double min = p[0];
		// Recorremos a partir de la posicion 1
		for (int i = 1; i < p.length; i++) {
			if (p[i] < min) {
				min = p[i];
			}
		}
		return min;
	}

	public int diaMasLluvia(double p[]) {
		// Suponemos que el dia de mas lluvia fue el 0
		int diaMax = 0;
		// Recorremos a partir de la posicion 1
		for (int i = 1; i < p.length; i++) {
			if (p[i] > p[diaMax]) {
				diaMax = i;
			}
		}
		return diaMax;
	}

	public int diaMenosLluvia(double p[]) {
		// Suponemos que el dia de menos lluvia fue el 0
		int diaMin = 0;
		// Recorremos a partir de la posicion 1
		for (int i = 1; i < p.length; i++) {
			if (p[i] < p[diaMin]) {
				diaMin = i;
			}
		}
		return diaMin;
	}

	public static int contarDiasLluviaX(double p[], double x) {
		int cont = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i] == x) {
				cont++;
			}
		}
		return cont;
	}

	public static double lluviaTotalPeriodo(double p[], int ini, int fin) {
		double suma = 0;
		for (int i = ini; i <= fin; i++) {
			suma += p[i];
		}
		return suma;
	}

	public static int contarDiasLluviaCreciente(double p[]) {
		int cont = 0;
		// Recorremos hasta el penúltimo elemento
		for (int i = 0; i < p.length - 1; i++) {
			if (p[i] < p[i + 1]) {
				cont++;
			}
		}
		return cont;
	}
	public static int primerDiaLluviaX(double[] p, double x){
		//Búsqueda ascendente
		boolean enc = false;
		int i = 0;
		while(i < p.length && !enc){
			if(p[i] == x){
				enc = true;
			} else {
				i++;
			}
		}
		if(enc){
			return i;
		} else {
			return -1;
		}
	}
	public static int ultimoDiaLluviaX(double[] p, double x){
		//Búsqueda ascendente
		boolean enc = false;
		int i = p.length-1;
		while(i >= 0 && !enc){
			if(p[i] == x){
				enc = true;
			} else {
				i--;
			}
		}
		if(enc){
			return i;
		} else {
			return -1;
		}
	}
}
