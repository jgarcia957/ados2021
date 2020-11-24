package _01ejercicios._01basicos;

import java.util.Scanner;

public class _08Salario {
	public static void main(String[] args) {
		//Constantes
		final int PRECIO_ORDINARIA = 6;
		final int PRECIO_EXTRA = 10;
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Horas trabajadas: ");
		int trabajadas = tec.nextInt();
		
		//Separamos horas trabajadas en ordinarias y extraordinarias
		int ordinarias,extraordinarias;
		if (trabajadas <= 40) {
			ordinarias = trabajadas;
			extraordinarias = 0;
		} else {
			ordinarias = 40;
			extraordinarias = trabajadas - 40;
		}
		
		//Calcularmos el salario bruto
		//double salarioBruto = ordinarias * 6 + extraordinarias * 10;
		double salarioBruto = ordinarias * PRECIO_ORDINARIA 
				+ extraordinarias * PRECIO_EXTRA;
		
		//Calculamos el salario neto
		double salarioNeto;
		if(salarioBruto <= 350) {
			salarioNeto = salarioBruto - salarioBruto * 2 / 100;
			//salarioNeto = salarioBruto * 0.98;
		} else {
			salarioNeto = salarioBruto - salarioBruto * 10 / 100;
			//salarioNeto = salarioBruto * 0.90;
		}
		//Mostrar resultados
		System.out.println("Salario neto: " + salarioNeto);
		
	}
}








