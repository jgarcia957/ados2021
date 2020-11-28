package _00ejemplos._02ArraysYMatrices;

public class _04MatricesRecorridos {
	public static void main(String[] args) {
		
		int [][] m = {{1,2,3},{4,5}};
		
		//Recorrido de la matriz fila a fila
		System.out.println("Fila a fila: ");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print (m[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Columna a columna: ");
		int [][] m2 = {{1,2,3},{4,5,6}};
		for (int j = 0; j < m2[0].length; j++) {
			for (int i = 0; i < m2.length; i++) {
				System.out.print (m2[i][j] + " ");
			}
			System.out.println();
		}				
	}

}
