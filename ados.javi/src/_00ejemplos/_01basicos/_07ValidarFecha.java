package _00ejemplos._01basicos;

import java.util.Scanner;

public class _07ValidarFecha {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Fecha (dd/mm/aaaa): ");
		String fecha = tec.next();
		
		//Extraemos el dia, mes y año
		int posBarra1 = fecha.indexOf('/');
		int posBarra2 = fecha.indexOf('/', posBarra1 + 1); //fecha.lastIndexOf('/')
		
		String sDia = fecha.substring(0,posBarra1);
		String sMes = fecha.substring(posBarra1 + 1, posBarra2);
		String sAnyo = fecha.substring(posBarra2 + 1);
		
		//Convertimos de String a entero: Clases envoltorio
		int dia = Integer.parseInt(sDia);
		int mes = Integer.parseInt(sMes);
		int anyo = Integer.parseInt(sAnyo);
		
		//Validar fecha
		if(dia < 1 || dia > 31 || mes < 1 || mes > 12 || anyo <0) System.out.println("Incorrecta");
		else System.out.println("Puede que sea correcta");
		
		
		
		
	}

}
