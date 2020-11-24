package _00ejemplos._01basicos;

public class _08NumerosAleatorios {
	public static void main(String[] args) {
		// Real en [0,1[
		double num = Math.random();
		System.out.println(num);
		
		//Numero real en [0, 10[
		System.out.println(num * 10);
		
		//Numero real en [10, 15[
		System.out.println(10 + num * 5);
		
		//Numero entero: dado
		System.out.println((int)(num * 6 + 1));
		
		
		
	}

}
