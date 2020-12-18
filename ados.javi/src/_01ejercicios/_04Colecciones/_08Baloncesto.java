package _01ejercicios._04Colecciones;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _08Baloncesto {
	public static void main(String[] args) {
	
		simularExpulsiones(Arrays.asList(new String[] {"A","B","C","B","B","C","B","B","A","A","A","A","C","C"}));
		
	}
	public static void simularExpulsiones (List<String> faltas){
		Map<String,Integer> cuentaFaltas = new HashMap<>();
		for(String jugadorFalta: faltas){
			
			Integer cometidas = cuentaFaltas.get(jugadorFalta);
			if(cometidas == null) cuentaFaltas.put(jugadorFalta, 1);
			else {
				cometidas = cometidas + 1;
				cuentaFaltas.put(jugadorFalta, cometidas);
				if(cometidas == 5){
					System.out.println("Expulsion del jugador " + jugadorFalta);
				}

			}
		}
		System.out.println(cuentaFaltas);
	}
}
