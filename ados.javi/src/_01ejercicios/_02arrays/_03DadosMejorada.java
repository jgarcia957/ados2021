package _01ejercicios._02arrays;

public class _03DadosMejorada {
	static final int LANZAMIENTOS = 100000;
	static final int MOSTRAR_CADA = 1000;

	public static void main(String[] args) {
		int veces[] = new int[19];
		for (int contLanz = 1; contLanz <= LANZAMIENTOS; contLanz++) {
			int dado = 	1 + (int) (Math.random() * 6) + 
						1 + (int) (Math.random() * 6) +
						1 + (int) (Math.random() * 6);

			// Contamos las veces que aparece cada elemento ...
			veces[dado]++;

			if (contLanz % MOSTRAR_CADA == 0) {
				//Mostrar porcentaje de cada valor
				System.out.println("Lanzamientos: " + contLanz);
				for(int i = 1; i < veces.length; i++){
					String formato = "Porcentaje " + i + ": %7.4f %%%n";
					System.out.format(formato, 100.0 * veces[i] / contLanz);
					//De otra forma
					System.out.println("Porcentaje " + i + ": " 
								+  String.format("%7.4f %%", 100.0 * veces[i] / contLanz));
				}
			}

		}

	}

}
