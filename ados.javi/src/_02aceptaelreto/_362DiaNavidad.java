package _02aceptaelreto;

import java.util.Scanner;

public class _362DiaNavidad {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int numFechas = tec.nextInt(); //Numero de casos de prueba
		
		for(int i = 0; i < numFechas; i++){
			int dia = tec.nextInt();
			int mes = tec.nextInt();
			if(dia == 25 && mes == 12){
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		}
	}

}
