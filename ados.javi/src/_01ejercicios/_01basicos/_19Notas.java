package _01ejercicios._01basicos;

import java.util.Scanner;

public class _19Notas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nota;
		int numNotas = 0;
		int numAprob = 0;
		double sumaNotas = 0;
		do{
			System.out.println("Nota: ");
			nota = sc.nextDouble();
			if (nota >= 0){
				numNotas ++;
				sumaNotas += nota;
				if(nota >= 5){
					numAprob ++;
				}
			}
			
		} while (nota >= 0);
		System.out.println("Numero de notas: " + numNotas);
		System.out.println("Aprobados: " + numAprob);
		System.out.println("Media: " + (sumaNotas/numNotas));
	}
}
