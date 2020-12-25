package _02aceptaelreto;

import java.util.HashMap;
import java.util.Scanner;

public class _214AbdicacionDeUnRey {
	static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		int numReyes;
		do {
			numReyes = tec.nextInt();
			if (numReyes != 0) {
				HashMap<String, Integer> reyes = new HashMap<>();

				// Reyes de la dinastia
				for (int i = 0; i < numReyes; i++) {
					String rey = tec.next();
					Integer veces = reyes.get(rey);
					if (veces == null) {
						reyes.put(rey, 1);
					} else {
						reyes.put(rey, veces + 1);
					}
				}

				// Sucesores
				int sucesores = tec.nextInt();
				for (int i = 0; i < sucesores; i++) {
					String sucesor = tec.next();
					Integer veces = reyes.get(sucesor);
					if (veces == null) {
						reyes.put(sucesor, 1);
						System.out.println(1);
					} else {
						reyes.put(sucesor, veces + 1);
						System.out.println(veces + 1);
					}
				}
				// Salto entre dos casos de prueba
				System.out.println();
			}
		} while (numReyes != 0);
	}

}
