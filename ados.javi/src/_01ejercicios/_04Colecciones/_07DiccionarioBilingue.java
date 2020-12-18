package _01ejercicios._04Colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class _07DiccionarioBilingue {
	

	public boolean anyadirTraduccion(Map<String, Set<String>> diccionario, String palCast, String palIngl) {

		Set<String> traducciones = diccionario.get(palCast);
		if (traducciones == null) {
			// palCast es nueva. Creo un set que contenga a la palabra
			// en ingles y pongo la pareja en el map
			traducciones = new HashSet<>();
			traducciones.add(palIngl);
			diccionario.put(palCast, traducciones);
			return true;
		} else {
			// palCast ya estaba. Anyado la traduccion (si no estaba ya)
			return traducciones.add(palIngl);
		}

	}

	public boolean quitarTraduccion(Map<String, Set<String>> diccionario, String palCast, String palIngl) {
		Set<String> traducciones = diccionario.get(palCast);
		if (traducciones == null) {
			return false;
		} else {
			boolean quitado = traducciones.remove(palIngl);
			if (traducciones.isEmpty()) {
				// La palabra se ha quedado sin traducciones
				diccionario.remove(palCast);
			}
			return quitado;
		}
	}

	// Traducciones de una palabra
	public Set<String> traduccionesDe(Map<String, Set<String>> diccionario, String palabra) {
		return diccionario.get(palabra);
	}

	// Traduce la frase usando la primera traducción de cada
	// palabra. Si una palabra no tiene traducción deja la
	// original.
	public String traducir(Map<String, Set<String>> diccionario, String frase) {
		String fraseTraducida = "";
		StringTokenizer st = new StringTokenizer(frase, " ");
		while (st.hasMoreTokens()) {
			String palCast = st.nextToken();

			// Traducir la palabra
			Set<String> traducciones = diccionario.get(palCast);
			if (traducciones == null) {
				fraseTraducida += palCast + " ";
			} else {
				// Obtenemos la primera traduccion
				Iterator<String> it = traducciones.iterator();
				String palIngl = it.next();
				fraseTraducida += palIngl + " ";
			}
		}
		return fraseTraducida;
	}

}
