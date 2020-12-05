package _02aceptaelreto;

import java.util.Scanner;

public class _207SombrasEnElCamping {
	static Scanner tec = new Scanner(System.in);
	public static void main(String[] args) {
		int numC, numF, numA;
		do{
			numC = tec.nextInt();
			numF = tec.nextInt();
			numA = tec.nextInt();
			if(!(numC == 0 && numF == 0 && numA == 0)){
				boolean[][] arboles = new boolean[numF][numC];
				boolean[][] sombras = new boolean[numF][numC];
				//Leer posicion de los arboles
				for(int i = 0; i< numA; i++){
					int col = tec.nextInt()-1;
					int fil = tec.nextInt()-1;
					arboles[fil][col] = true;
				}
				//Comprobar donde hay sombra
				for (int i = 0; i < arboles.length; i++) {
					for (int j = 0; j < arboles[i].length; j++) {
						if(arboles[i][j]){
							if(i > 0 && j > 0 ) sombras[i-1][j-1] = !arboles[i-1][j-1];
							if(i > 0) sombras[i-1][j] = !arboles[i-1][j];
							if(i > 0 && j < arboles[i].length-1) sombras[i-1][j+1] = !arboles[i-1][j+1] ;
							if(j > 0) sombras[i][j-1] = !arboles[i][j-1];
							if(j < arboles[i].length-1) sombras[i][j+1] = !arboles[i][j+1];
							if(i < arboles.length-1 && j > 0) sombras[i+1][j-1] = !arboles[i+1][j-1];
							if(i < arboles.length-1) sombras[i+1][j] = !arboles[i+1][j];
							if(i < arboles.length-1 && j < arboles[i].length-1) sombras[i+1][j+1] = !arboles[i+1][j+1] ;
						}
					}
					
				}
				int contSombras = 0;
				for (int i = 0; i < sombras.length; i++) {
					for (int j = 0; j < sombras[i].length; j++) {
						if(sombras[i][j]){
							contSombras++;
						}
					}
					
				}
				System.out.println(contSombras);
			}
		} while (!(numC == 0 && numF == 0 && numA == 0));
		
	}

}
