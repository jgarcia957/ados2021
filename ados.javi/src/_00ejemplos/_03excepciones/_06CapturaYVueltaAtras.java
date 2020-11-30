package _00ejemplos._03excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _06CapturaYVueltaAtras {
	
	static Scanner tec = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Edad: ");
		int edad = leerEntero();
		System.out.println("Estatura: ");
		double estatura = leerDouble();
		
	}
	
	public static int leerEntero(){
		boolean ok = false;
		int num = 0;
		do{
			try {
				num = tec.nextInt();
				ok = true;
			} catch (InputMismatchException e){
				System.out.println("Vuelve a intentarlo: ");
				tec.nextLine();
			}
		} while (!ok);
		return num;		
	}
	
	public static double leerDouble(){
		boolean ok = false;
		double num = 0;
		do{
			try {
				num = tec.nextDouble();
				ok = true;
			} catch (InputMismatchException e){
				System.out.println("Vuelve a intentarlo: ");
				tec.nextLine();
			}
		} while (!ok);
		return num;		
	}

}
