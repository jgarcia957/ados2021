package _01ejercicios._03excepciones;

public class _09Ejercicio {
	public static void metodo() {
		try {
			throw new NullPointerException("demo");
		} catch (NullPointerException e) {
			System.out.println("capturada en método");
			throw e;
		}
	}

	public static void main(String args[]) {
		try {
			metodo();
		} catch (NullPointerException e) {
			System.out.println("capturada en main ");
		}
	}
}