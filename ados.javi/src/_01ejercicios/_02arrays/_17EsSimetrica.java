package _01ejercicios._02arrays;

public class _17EsSimetrica {
	public static void main(String[] args) {
		
	}
	
	public static boolean esSimetrica(int[][] m){
		if(m.length != m[0].length) return false;
		else {
			boolean enc = false;
			for (int i = 0; i < m.length - 1 && !enc ; i++) {
				for (int j = i + 1; j < m[i].length && !enc; j++) {
					if(m[i][j] != m[j][i])	enc = true;
					//return false;
				}
			}
			return !enc;
			//return true;
		}
	}
	
}
