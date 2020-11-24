package _01ejercicios._01basicos;

import java.util.Scanner;

public class _17SumaSerie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Valor de n: ");
		int n = sc.nextInt();
		
		
		double suma = 0;
		for(int i = 1; i <= n; i++){
			suma = suma + 1.0 / i;
		}
		System.out.println(suma);
	}
}
