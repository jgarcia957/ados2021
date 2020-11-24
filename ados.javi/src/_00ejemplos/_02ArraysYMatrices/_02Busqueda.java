package _00ejemplos._02ArraysYMatrices;

public class _02Busqueda {
	public static void main(String[] args) {
		//Dado un array v, en qué posicion está el primer valor impar?
		int[] numeros = {2,4,6,1,8};
		
		System.out.println(posPrimerImpar(numeros));
	}
	
	//Devuelve la posición del primer impar o -1 sin no hay ningún impar
	public static int posPrimerImpar(int[] v){
		//Esquema de búsqueda
		boolean enc = false;
		int i= 0;
		while (i < v.length && !enc /* enc == false*/){
			if(v[i] %2 != 0) enc = true;
			else i++;
		}
		if(enc)
			return i;
		else 
			return -1;
	}
	
	public static int posPrimerImpar2(int[] v){
		int i= 0;
		while (i < v.length && v[i] % 2 == 0){
			 i++;
		}
		if (i< v.length)
			return i;
		else 
			return -1;
	}
	
	public static int posPrimerImpar3(int[] v){
		int i= 0;
		while (i < v.length ){
			if(v[i] % 2 != 0){
				return i;
			}
			i++;
		}
		return -1;
	}

}
