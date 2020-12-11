package _00ejemplos._03excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _08NoCapturarException {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int[] edades = new int[3];
		
		try{
			for (int i = 0; i <= edades.length; i++) {
				System.out.println("Introduce edad: ");
				edades[i] = tec.nextInt();
			}
//		} catch (Exception e){  //No se debe capturar Exception porque no "saltaran" los posibles errores
			// de programación que hayamos podido cometer.
			
		} catch (InputMismatchException e){
			System.out.println("Se deben introducir valores enteros");
		}
	}
}
