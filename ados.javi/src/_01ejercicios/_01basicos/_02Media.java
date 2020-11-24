package _01ejercicios._01basicos;

import java.util.Scanner;

public class _02Media {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce entero 1: ");
		int num1 = tec.nextInt();
		
		System.out.println("Introduce entero 2: ");
		int num2 = tec.nextInt();
		
		System.out.println("Introduce entero 3: ");
		int num3 = tec.nextInt();
		
		double media = (num1 + num2 + num3) / 3.0; //Para que haga una división real, dividendo o divisor tienen que ser reales
		//media = (double) (num1 + num2 + num3) / 3;  //También se puede conseguir con un "casting" a double
		
		System.out.println("Media: " + media);
		
		
				
	}

}
