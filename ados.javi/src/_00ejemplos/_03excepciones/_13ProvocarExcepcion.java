package _00ejemplos._03excepciones;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class _13ProvocarExcepcion {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Dia de la semana");

		int dia = tec.nextInt();
		System.out.println("Nombre del dia: " + nombreDia(dia));
	}

	public static String nombreDia(int d) {
		String nombre;
		switch (d) {
		case 1:
			nombre = "lunes";
			break;
		case 2:
			nombre = "martes";
			break;
		case 3:
			nombre = "mierc";
			break;
		case 4:
			nombre = "juev";
			break;
		case 5:
			nombre = "vier";
			break;
		case 6:
			nombre = "sab";
			break;
		case 7:
			nombre = "dom";
			break;
		default: throw new NoSuchElementException("Dia de la semana no válido");

		}
		return nombre;
	}

}
