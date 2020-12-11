package _01ejercicios._03excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _02ValidarNif {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("NIf: ");
		String nif = sc.next();
		if (esNifValido(nif)) {
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}

	}

	public static boolean esNifValido(String nif) {
		boolean valido;
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letra = nif.charAt(nif.length() - 1);
		String textoNumero = nif.substring(0, nif.length() - 1);
		try {
			int numero = Integer.parseInt(textoNumero);
			if (letras.charAt(numero % 23) == letra) {
				valido = true;
			} else {
				valido = false;
			}
		} catch (NumberFormatException e) {
			valido = false;
		}
		return valido;
	}

}
