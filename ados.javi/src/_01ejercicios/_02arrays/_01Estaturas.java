package _01ejercicios._02arrays;

import java.util.Scanner;

public class _01Estaturas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Array para almacenar estaturas
		double[] est = new double[2];
		
		//Leemos las estaturas
		for(int i = 0; i < est.length; i++){
			System.out.format("Introduce estatura %d: %n", (i+1));
			est[i] = sc.nextDouble();
		}
		
		//Mostramos las estaturas con el formato indicado
		for (int i = 0; i < est.length; i++) {
			System.out.format("Persona %d: %4.2f m.%n", (i+1),est[i]);
		}
		
		
	}

}
