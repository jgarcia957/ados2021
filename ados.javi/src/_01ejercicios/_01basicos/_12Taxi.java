package _01ejercicios._01basicos;

import java.util.Scanner;

public class _12Taxi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dia de la semana: ");
		int dia = sc.nextInt();

		System.out.println("Quilometros: ");
		double km = sc.nextDouble();

		System.out.println("Hora de comienzo del trayecto");
		String horario = sc.next();
		int hora = Integer.parseInt(horario.substring(0, horario.indexOf(":")));
		int min = Integer.parseInt(horario.substring(horario.indexOf(":") + 1));

		System.out.format("Coste del trayecto: %.2f\n", costeTrayecto(dia, km, hora, min));

	}

	public static double costeTrayecto(int dia, double km, int hora, int min) {
		double coste;
		boolean diurno = (hora >= 6 && (hora <= 21 || hora == 22 && min == 0));
		if (dia == 7) { // domingos
			coste = 0.93 * km;
		} else { 		// laborables
			if (diurno) {
				coste = 0.73 * km;
			} else {
				coste = 0.84 * km;
			}
		}

		// Tarifa minima
		if (diurno) {
			// Usando if
			if (coste < 2.95) {
				coste = 2.95;
			}
		} else {
			// o bien usando Math.max
			coste = Math.max(coste, 4);
		}

		return coste;
	}

}
