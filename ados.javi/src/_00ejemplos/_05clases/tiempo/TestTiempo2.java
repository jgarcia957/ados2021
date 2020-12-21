package _00ejemplos._05clases.tiempo;

import java.util.TreeSet;

public class TestTiempo2 {
	public static void main(String[] args) {
		Tiempo t1 = new Tiempo(10,20,30);
		Tiempo t2 = new Tiempo(10,20,30);
		
		System.out.println(t1 == t2);
		System.out.println(t1 == t1);
		
		System.out.println(t1.equals(t2));
		System.out.println(t1.equals(t1));
		
		TreeSet<Tiempo> ts = new TreeSet<>();
		ts.add(new Tiempo (10,20,39));
		ts.add(new Tiempo (9,20,39));
		ts.add(new Tiempo (12,20,39));
		ts.add(new Tiempo (12,20,29));
		System.out.println(ts);
		
	}

}
