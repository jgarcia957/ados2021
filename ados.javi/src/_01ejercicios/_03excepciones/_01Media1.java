package _01ejercicios._03excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _01Media1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println("Edad " + i + ": ");
				int edad = sc.nextInt();
				suma = suma + edad;
			} catch (InputMismatchException e) {
				System.out.println("Valor incorrecto");
				sc.nextLine();
				i--;
			}
		}
		System.out.println("Media: " + (suma / 5.0));
	}

}
