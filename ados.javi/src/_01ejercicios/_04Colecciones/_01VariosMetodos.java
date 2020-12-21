package _01ejercicios._04Colecciones;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class _01VariosMetodos {
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(quitarDuplicados(new int[]{1,1,2,2})));
	}
	public static int[] quitarDuplicados (int[] v){
		//Volcamos array a un set
		LinkedHashSet<Integer> s = new LinkedHashSet<>();
		for (int i = 0; i < v.length; i++) {
			s.add(v[i]);
		}
		
		//Volcamos set a array
		int[] result = new int[s.size()];
		int i = 0;
		for(int num: s){
			result[i] = num;
			i++;
		}
		
		return result;
	}
	//Si fuese con arrays de Integer
	public static Integer[] quitarDuplicados (Integer[] v){
		//Volcamos array a un set
		LinkedHashSet<Integer> s = new LinkedHashSet<>(Arrays.asList(v));
		
		
		//Volcamos set a array
		//Object[] x = s.toArray();
		Integer[] result = s.toArray(new Integer[0]);
		return result;
	}
	public static int[] union (int[] v1, int[] v2){
		//Volcamos arrays a un set
		LinkedHashSet<Integer> s = new LinkedHashSet<>();
		for (int i = 0; i < v1.length; i++) {
			s.add(v1[i]);
		}
		for (int i = 0; i < v2.length; i++) {
			s.add(v2[i]);
		}
		
		//Volcamos set a array
		int[] result = new int[s.size()];
		int i = 0;
		for(int num: s){
			result[i] = num;
			i++;
		}
		
		return result;
	}
	public static int[] interseccion (int[] v1, int[] v2){
		//Volcamos arrays a dos set
		LinkedHashSet<Integer> s1 = new LinkedHashSet<>();
		for (int i = 0; i < v1.length; i++) {
			s1.add(v1[i]);
		}
		LinkedHashSet<Integer> s2 = new LinkedHashSet<>();
		for (int i = 0; i < v2.length; i++) {
			s2.add(v2[i]);
		}
		//Intersección
		s1.retainAll(s2);
		
		//Volcamos set a array
		int[] result = new int[s1.size()];
		int i = 0;
		for(int num: s1){
			result[i] = num;
			i++;
		}
		
		return result;
	}
	public static int[] diferencia (int[] v1, int[] v2){
		//Volcamos arrays a dos list
		LinkedList<Integer> l1 = new LinkedList<>();
		for (int i = 0; i < v1.length; i++) {
			l1.add(v1[i]);
		}
		LinkedList<Integer> l2 = new LinkedList<>();
		for (int i = 0; i < v2.length; i++) {
			l2.add(v2[i]);
		}
		//Intersección
		l1.removeAll(l2);
		
		//Volcamos set a array
		int[] result = new int[l1.size()];
		int i = 0;
		for(int num: l1){
			result[i] = num;
			i++;
		}
		
		return result;
	}
}
