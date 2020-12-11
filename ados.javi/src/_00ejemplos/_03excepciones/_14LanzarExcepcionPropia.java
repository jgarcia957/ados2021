package _00ejemplos._03excepciones;

import java.util.Scanner;

public class _14LanzarExcepcionPropia {

	static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			System.out.println("Introduzca nif");
			String nif = leerNif();
			System.out.println("Gracias " + nif);
		} catch (NifIncorrectoException e) {
			System.out.println(e.getMessage());
		}
	}

	public static String leerNif() throws NifIncorrectoException {
		try {
			String nif = tec.next();
			nif = nif.trim().toUpperCase(); // Quitamos espacios y pasamos a
											// mayusculas

			char letra = nif.charAt(nif.length() - 1);
			int numeros = Integer.parseInt(nif.substring(0, nif.length() - 1));

			String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
			if (letras.charAt(numeros % 23) == letra) {
				return nif;
			} else {
				throw new NifIncorrectoException("La letra y el número no se corresponden");
			}
		} catch (NumberFormatException e) {
			throw new NifIncorrectoException("El numero de nif no es correcto");
		}

	}
}
