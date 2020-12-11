package _01ejercicios._03excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _01Media3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		boolean ok = false;
		do {
			try {
				for (int i = 1; i <= 5; i++) {
					System.out.println("Edad " + i + ": ");
					int edad = sc.nextInt();
					suma = suma + edad;
				}
				System.out.println("Media: " + (suma / 5.0));
				ok = true;
			} catch (InputMismatchException e) {
				System.out.println("Volvemos a empezar");
				sc.nextLine();
			}
		} while (!ok);
	}

}
