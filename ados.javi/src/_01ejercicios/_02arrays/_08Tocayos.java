package _01ejercicios._02arrays;

public class _08Tocayos {
	public static void main(String[] args) {
		String[] grupo1 = {"miguel", "jose","ana","maria"};
		String[] grupo2 = {"ana", "jose", "lujan", "juan", "jose", "pepa", "angela", "sofia", "andres", "bartolo"};
		
		int cont = 0;
		//Recorremos grupo 1
		for (int i = 0; i < grupo1.length; i++) {
			//Busquda para comprobar si grupo1[i] esta en grupo2
			
			boolean enc = false;
			for (int j = 0; j < grupo2.length && !enc; j++) {
				if(grupo1[i].equals(grupo2[j])){
					enc = true;
					System.out.println(grupo1[i] + " tiene tocayo en grupo 2");
					cont ++;
				}
			}
		}
		System.out.println( cont + " personas del primer grupo tienen tocayo");
	}
}
