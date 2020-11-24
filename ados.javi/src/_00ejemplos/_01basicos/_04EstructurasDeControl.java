package _00ejemplos._01basicos;

import java.util.Scanner;

public class _04EstructurasDeControl {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Edad: ");
		int edad = tec.nextInt();
		
		// Condicionales ------------

		if (edad < 18) {
			System.out.println("No adulto");
		} else if (edad >= 65) {
			System.out.println("Jubilado");
		} else {
			System.out.println("Adulto");
		}

		switch (edad) { //Se permiten expresiones de datos enumerables y Strings
		case 18:
			System.out.println("Es el año de tu mayoría de edad");
			break;
		case 65:
		case 66:
			System.out.println("Es el año de tu jubilación");
			break;
		default: //No es obligatorio
			System.out.println("No es ningún año especial");
		}
		
		//Bucles ---------------
		
		//while	
		System.out.println("----------");
		int num = 1;
		while (num <= edad) {
			System.out.println(num);
			num++;
		}
		
		//do-while
		System.out.println("----------");
		int num2 = 1;
		do {
			System.out.println(num2);
			num2++;
		} while (num2 <= edad);
		
		//for: es como un while "concentrado" en una línea
		System.out.println("----------");
		for (int num3 = 1; num3 <= edad; num3++){
			System.out.println(num3);
		}
		
		//La inicialización y el incremento son opcionales
		System.out.println("----------");
		int num4 = 1;
		for (; num4 <= edad; num4++){
			System.out.println(num4);
		}
		
		System.out.println("----------");
		int num5 = 1;
		for (; num5 <= edad; ){
			System.out.println(num5);
			num5++;
		}
		
		//Se pueden poner varias instrucciones en la inicialización y en el incremento
		System.out.println("----------");
		for(int i = 1, j = edad;  i < j; i++, j--){
			System.out.println(i + ", " + j);
		}
		
		
	}

}
