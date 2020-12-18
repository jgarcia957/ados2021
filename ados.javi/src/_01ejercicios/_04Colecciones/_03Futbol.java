package _01ejercicios._04Colecciones;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class _03Futbol {
	public static void main(String[] args) {
		// Equipos de la liga de futbol del instituto
		String[] equipos = { "1dam", "2dam", "1smr", "2smr", "1vdj", "2vdj" };

		// Partidos disputados {local, visitante}
		String[][] partidos = { { "1dam", "1smr" }, { "2dam", "1smr" }, { "1smr", "2smr" }, { "2smr", "1smr" },
				{ "1dam", "2smr" }, { "2dam", "2smr" },

		};
	}

	public static String[] hanJudadoCasa(String[] equipos, String[][] partidos) {
		// Mostrar qué equipos no hay jugado todavia en casa
		LinkedHashSet<String> yaHanJugadoLocal = new LinkedHashSet<>();
		for (int i = 0; i < partidos.length; i++) {
			// Añado el equipo local del partido
			yaHanJugadoLocal.add(partidos[i][0]);

		}
		// Volcamos set a array
		String[] result = yaHanJugadoLocal.toArray(new String[0]);
		

		return result;
	}
	public static String[] noHanJugadoFuera(String[] equipos, String[][] partidos) {
		//Set con todos los equipos
		LinkedHashSet<String> noHanJugado = new LinkedHashSet<>(Arrays.asList(equipos));
	
		// Quitamos los que ya han jugado
		for (int i = 0; i < partidos.length; i++) {
			// Añado el equipo local del partido
			noHanJugado.remove(partidos[i][0]);

		}
		//Volcamos a un array
		String[] result = noHanJugado.toArray(new String[0]);
		return result;
	}
}
