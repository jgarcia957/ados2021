package _01ejercicios._03excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _01Media2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Edad " + i + ": ");
				int edad = sc.nextInt();
				suma = suma + edad;
			}
			System.out.println("Media: " + (suma / 5.0));
		} catch (InputMismatchException e) {
			System.out.println("Fin de programa");
			sc.nextLine();
		}
	}

}
