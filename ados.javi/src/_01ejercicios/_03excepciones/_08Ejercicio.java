package _01ejercicios._03excepciones;

public class _08Ejercicio {
	public static void procA() {
		try {
			System.out.println("dentro del procA");
			throw new RuntimeException("demo");
		} finally {
			System.out.println("Finally del procA");
		}
	}

	public static void procB() {
		try {
			System.out.println("dentro del procB");
			return;
		} finally {
			System.out.println("finally del procB");
		}
	}

	public static void main(String args[]) {
		try {
			procA();
		} catch (Exception e) {
			procB();
		}
	}
}