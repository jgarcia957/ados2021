package _00ejemplos._01basicos;

import java.util.Scanner;

public class _05DoWhileVsWhile {
	public static void main(String[] args) {
		//Contar cuantos valores pares es capaz de introducir el usuario
		// sin equivocarse
		
		Scanner tec = new Scanner(System.in);
		//While
		int cont = 0;
		
		System.out.println("Introduce par: ");
		int num = tec.nextInt();
		
		while (num % 2 == 0){
			cont ++;
			System.out.println("Introduce par: ");
			num = tec.nextInt();
		}
		System.out.println("Has conseguido introducir " + cont + " pares");
		
		
		// do-while (esta solución es más natural)
		cont = 0;
		do {
			System.out.println("Introduce par: ");
			num = tec.nextInt();
			if(num % 2 == 0){
				cont ++;
			}
		} while (num % 2 == 0);
		
	}

}
