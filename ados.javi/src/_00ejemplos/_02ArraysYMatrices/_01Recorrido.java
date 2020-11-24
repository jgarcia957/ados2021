package _00ejemplos._02ArraysYMatrices;

import java.util.Scanner;

public class _01Recorrido {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		//Leer la edad de 10 personas y mostraremos cuantas de ellas tienen más edad
		//que la media
		
		int[] edad = new int[4];
		int suma = 0;
		
		//Leemos las edades y calculamos la media
		for (int i = 0; i < edad.length; i++) {
			System.out.println("Edad " + (i+1) + ": ");
			edad[i] = tec.nextInt();
			suma = suma + edad[i];
		}
		//Calculamos la media
		double media = (double)suma / edad.length;
		
		int cont = 0;
		for (int i = 0; i < edad.length; i++) {
			if (edad[i] > media) cont++;
		}
		
		System.out.format("Hay %d personas con más edad que la media%n", cont);
		
		
		
	}
}
