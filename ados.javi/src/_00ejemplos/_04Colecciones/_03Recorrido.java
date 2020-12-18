package _00ejemplos._04Colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03Recorrido {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		
		l.add(10);l.add(11);l.add(20);l.add(40);
		
		//Accediendo por inidice : SOLO EN LIST
		for(int i = 0; i < l.size(); i++){
			System.out.println(l.get(i));
		}
		System.out.println("------------");
		
		//Unsando un bucle for-each
		for(Integer num: l){
			System.out.println(num);
			//if(num % 2 != 0) l.remove(num);
		}
		System.out.println("------------");
		
		//Usando un Iterator
		Iterator<Integer> it = l.iterator();
		while (it.hasNext()){
			Integer num = it.next();
			System.out.println(num);
			if(num % 2 != 0) it.remove();
		}
		System.out.println(l);
		
	}
}
