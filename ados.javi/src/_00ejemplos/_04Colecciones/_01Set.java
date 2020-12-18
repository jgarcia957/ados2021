package _00ejemplos._04Colecciones;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class _01Set {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		TreeSet<Integer> ts = new TreeSet<>();
		HashSet<Integer> hs = new HashSet<>();
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		
		for(int i = 1; i <= 5; i++){
			System.out.println("Introduce número: ");
			int num = tec.nextInt();
			
			ts.add(num);
			hs.add(num);
			lhs.add(num);
		}
		
		System.out.println("TreeSet " + ts);
		System.out.println("HashSet " + hs);
		System.out.println("LinkedHashSet " + lhs);
	}

}
