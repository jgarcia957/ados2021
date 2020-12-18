package _00ejemplos._05clases.tiempo;

import java.util.ArrayList;
import java.util.TreeSet;

public class TestTiempo {
	public static void main(String[] args) {
		//Uso de los constructores
		Tiempo t1 = new Tiempo(10,20,30);
		Tiempo t2 = new Tiempo();
		
		//Uso de toString --------------------
		System.out.println(t1.toString());
		//equivale a 
		System.out.println(t1); //Java llama toString en contextos en que espera una cadena
		
		//Uso de equals --------------------
		//Lo siguiente mostrará true porque hemos reescrito el
		//metodo equals de Tiempo. Si no lo hubieramos hecho,
		//usaría el equals heredado de Object y devolvería false
		//porque compararía las direcciones de memoria 
		System.out.println(t1.equals(new Tiempo(10,20,30)));
		
		//--------------------
		//Algunas estructuras también llaman a equals, como por
		//ejemplo el método contains de las List
		ArrayList<Tiempo> lista = new ArrayList<>();
		lista.add(t1);
		//muestra true siempre
		System.out.println(lista.contains(t1)); 
		//muestra true xq el método equals está reescrito
		System.out.println(lista.contains(new Tiempo(10,20,30))); 
		
		//--------------------
		//Los TreeSet y TreeMap requieren que el elemento implemente
		//el interface Comparable
		//El siguiente código dará error si Tiempo no implementa
		//Comparable
		TreeSet<Tiempo> ts = new TreeSet<>();
		ts.add(t1);
		
		//Métodos getter y setter permiten consultar y modificar 
		//los atributos del objeto
		t1.setHora(22);
		System.out.println(t1.getHora());
		
	}

}
