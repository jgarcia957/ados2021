package _01ejercicios._02arrays;

public class _03Dados {
	static final int LANZAMIENTOS = 1000;
	static final int MOSTRAR_CADA = 100;

	public static void main(String[] args) {
		int veces[] = new int[7];
		for (int contLanz = 1; contLanz <= LANZAMIENTOS; contLanz++) {
			int dado = 1 + (int) (Math.random() * 6);

			// Contamos las veces que aparece cada elemento ...
			if (dado == 1)
				veces[1]++;
			else if (dado == 2)
				veces[2]++;
			else if (dado == 3)
				veces[3]++;
			else if (dado == 4)
				veces[4]++;
			else if (dado == 5)
				veces[5]++;
			else
				veces[6]++;

			if (contLanz % MOSTRAR_CADA == 0) {
				System.out.println("Lanzamientos: " + contLanz);
				System.out.format("Porcentaje 1: %7.4f %%%n", 100.0 * veces[1] / contLanz);
				System.out.format("Porcentaje 2: %7.4f %%%n", 100.0 * veces[2] / contLanz);
				System.out.format("Porcentaje 3: %7.4f %%%n", 100.0 * veces[3] / contLanz);
				System.out.format("Porcentaje 4: %7.4f %%%n", 100.0 * veces[4] / contLanz);
				System.out.format("Porcentaje 5: %7.4f %%%n", 100.0 * veces[5] / contLanz);
				System.out.format("Porcentaje 6: %7.4f %%%n", 100.0 * veces[6] / contLanz);
			}

		}

	}

}
