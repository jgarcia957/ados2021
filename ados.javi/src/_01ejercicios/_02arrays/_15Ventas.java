package _01ejercicios._02arrays;

public class _15Ventas {
	final static double COMISION_BAJA = 5;
	final static double COMISION_ALTA = 8;
	final static double LIMITE_COMISION_BAJA = 30000;
	final static double LIMITE_COMISION_ALTA = 70000;
	
	
	public static void main(String[] args) {
		int[][] ventas = {
				{100,100,100,100,100},
				{100,200,300,400,500},
				{1600,1600,600,600,600},
				{600,500,400,300,200}};
		double[] precio = {10,20,15,30,18};
		
		System.out.println("Mejor distrib: " + mejorDistribuidor(ventas));
		listarComisiones(ventas, precio);
	}
	
	public static int mejorDistribuidor(int[][] ventas){
		//Hay que calcular cuanto ha vendido cada distribuidor y
		// averiguar el máximo
		
		int maxVentas = -1;
		int mejorDist = -1;
		
		//Recorremos por distribuidor (por filas)
		for (int i = 0; i < ventas.length; i++) {
			int total = 0;
			for (int j = 0; j < ventas[i].length; j++) {
				total += ventas[i][j];
			}
			//Compruebo si este distribuidor es el que mas ha vendido
			if(total > maxVentas){
				maxVentas = total;
				mejorDist = i;
			}
		}
		return mejorDist;
	}
	public static int mejorArticulo(int[][] ventas){
		//Hay que calcular cuanto se ha vendido cada articulo y
		// averiguar el máximo
		
		int maxVentas = -1;
		int mejorArt = -1;
		
		//Recorremos por articulo (por columnas)
		for (int j = 0; j < ventas[0].length; j++) {
			int total = 0;
			for (int i = 0; i < ventas.length; i++) {
				total += ventas[i][j];
			}
			//Compruebo si este articulo es el que mas ha vendido
			if(total > maxVentas){
				maxVentas = total;
				mejorArt = j;
			}
		}
		return mejorArt;
	}

	public static void listarComisiones(int[][] ventas, double precio[]){
		//REcorremos por distribuidor
		for (int i = 0; i < ventas.length; i++) {
			//Calcular importe vendido por el distribuidor
			double importeVendido = 0;
			for (int j = 0; j < ventas[i].length; j++) {
				importeVendido += ventas[i][j] * precio[j];
			}
			double porcComision = 0;
			if(importeVendido >= LIMITE_COMISION_ALTA){
				porcComision = COMISION_ALTA;
			} else if(importeVendido >= LIMITE_COMISION_BAJA){
				porcComision = COMISION_BAJA;
			}
			//Si tiene comisión, imprimimos por pantalla
			if(porcComision > 0){
				System.out.format("Vendedor %d - Importe vendido: %8.2f - "
						+ "%%Comision: %5.2f%% - Comsion: %6.2f€%%%n",
						i,importeVendido,porcComision, 
						importeVendido * porcComision / 100);
			}
		}
	}
}







