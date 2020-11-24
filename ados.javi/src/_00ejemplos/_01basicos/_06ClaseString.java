package _00ejemplos._01basicos;

import java.util.Scanner;

public class _06ClaseString {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Nombre: ");
		String nombre = tec.nextLine();
		
		//Tamaño del String
		int tamanyo = nombre.length();
		
		//Pasar a mayúsc. y minúsc.
		
		String nombreMayus = nombre.toUpperCase();
		String nombreMinus = nombre.toLowerCase();
		
		//Acceder a cierta posicion del String
		char inicial = nombre.charAt(0);
		char fin = nombre.charAt(nombre.length() - 1);
		
		//Localizar un caracter o Strings
		int pos = nombre.indexOf('M');
		if(pos == -1) System.out.println("El nombre no contiene la M");
		
		int posGarcia = nombre.toUpperCase().indexOf("GARCIA");
		if(pos != -1) System.out.println("Tu apellido es muy común");
		
		//Sub strings
		String cuatroPrimeros = nombre.substring(0,4);
		String delSegundoAlFinal = nombre.substring(1);
	}
}
