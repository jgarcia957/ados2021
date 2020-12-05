package _02aceptaelreto;

import java.util.Scanner;

public class _459PresupuestandoSemaforos {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		
		while (tec.hasNext()){
			//Leer datos de un convertir a matriz de boolean
			int cols = tec.nextInt();
			int filas = tec.nextInt();
			boolean[][] pueblo = new boolean[filas][cols];
			for (int i = 0; i < pueblo.length; i++) {
				String linea = tec.next();
				for (int j = 0; j < pueblo[0].length; j++) {
					pueblo[i][j] = linea.charAt(j) == '#';
				}
			}
			
			//Recorremos la matriz y averiguamos, para cada celda,
			//cuántas adyacentes ocupadas tiene al norte, sur, este y oeste
			int semaforos = 0;
			for (int i = 0; i < pueblo.length; i++) {
				for (int j = 0; j < pueblo[0].length; j++) {
					if(pueblo[i][j]){
						int ady = contarAdyacentes(pueblo, i, j);
					
						if(ady == 3) semaforos += 3;
						else if (ady == 4) semaforos += 4;
					}
				}
			}
			System.out.println(semaforos);
		}
	}
	public static int contarAdyacentes(boolean[][] pueblo, int i, int j){
		int adyacentes = 0;
		
		if(i > 0 && pueblo[i-1][j] ) adyacentes++; //norte
		if(i < pueblo.length-1 && pueblo[i+1][j] ) adyacentes++; //sur
		if(j < pueblo[i].length-1 && pueblo[i][j+1]) adyacentes++; //este
		if(j > 0 && pueblo[i][j-1]) adyacentes++;  //oeste
		
		return adyacentes;			
	}
}
