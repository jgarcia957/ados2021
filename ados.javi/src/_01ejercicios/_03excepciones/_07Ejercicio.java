package _01ejercicios._03excepciones;

public class _07Ejercicio {
	public static void main(String args[]) {
		String texto = "";
		try {
			int a = Integer.parseInt(texto);
			System.out.println("a = " + a);
			int b = 42 / a;
			String c = "hola";
			char d = c.charAt(50);
		} catch (ArithmeticException e) {
			System.out.println("div por 0: ");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("�ndice del String fuera de l�mites: ");
		} finally {
			System.out.println("Ejecuci�n de finally");
		}
	}
}