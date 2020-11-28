package _01ejercicios._02arrays;

public class _11Capicua {
	public static void main(String[] args) {
		String[] palabras = {"CASA","COCHE", "MOTO","COCHE","CASA"};
		
				
		
	}
	public static boolean esCapicua (String v[]){
		boolean enc = false;
		int i = 0;
		int j = v.length-1;
		
		while (i < j && !enc){
			if(v[i].equals(v[j])){
				i++;
				j--;
			} else {
				enc = true; //No es capicua
			}
		}
		// return !enc;
		if (enc){
			//No es capicua
			return false;
		} else {
			//Es capicua
			return true;
		}
	}
	public static boolean esCapicua2 (String v[]){
		boolean enc = false;
		for (int i = 0, j = v.length-1; i < j && !enc; i++,j--) {
			if(!v[i].equals(v[j])){
				enc = true; //No es capicua
			}
		}
		return !enc;
	}
	public static boolean esCapicua3 (String v[]){
		boolean capicua = true;
		for (int i = 0, j = v.length-1; i < j && capicua; i++,j--) {
			if(!v[i].equals(v[j])){
				capicua = false; //No es capicua
			}
		}
		return capicua;
	}
	public static boolean esCapicua4 (String v[]){
		for (int i = 0, j = v.length-1; i < j; i++,j--) {
			if(!v[i].equals(v[j])){
				return false;
			}
		}
		return true;
	}

}
