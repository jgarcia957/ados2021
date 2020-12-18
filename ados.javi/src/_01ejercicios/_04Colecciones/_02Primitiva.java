package _01ejercicios._04Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TreeSet;

public class _02Primitiva {
	public static void main(String[] args) {
		Random r = new Random();
		TreeSet<Integer> apuesta = new TreeSet<>();
		while(apuesta.size() < 6) {
			apuesta.add(r.nextInt(49) + 1);
		}
		System.out.println(apuesta);
		
		ArrayList<Integer> apuesta2 = new ArrayList<>();
		while(apuesta2.size() < 6) {
			int num = r.nextInt(49) + 1;
			if(!apuesta2.contains(num)) {
				apuesta2.add(num);
			}
		}
		Collections.sort(apuesta2);
		System.out.println(apuesta2);
	}

}
