package _01ejercicios._01basicos;

import java.util.Scanner;

public class _18Divisores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce numero");
		int num = sc.nextInt();
		
		int cont = 0;
		int divisor = 1;
		while (divisor <= num && cont < 3){
			if(num % divisor == 0){
				cont ++;
				System.out.println(divisor);
			}
			divisor++;
		}
	}
}
