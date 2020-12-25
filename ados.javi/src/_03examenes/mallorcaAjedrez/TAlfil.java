package _03examenes.mallorcaAjedrez;

public class TAlfil extends TPesa{

	public TAlfil(TColor color) {
		super(color);
	}

	@Override
	public boolean pucMoure(TPosicio origen, TPosicio desti) {
		//Posicion incorrecta
		if(origen.getFila() < 1 || origen.getFila()>8) return false;
		if(desti.getFila() < 1 || desti.getFila()>8) return false;
		if(origen.getColumna() < 1 || origen.getColumna()>8) return false;
		if(desti.getColumna() < 1 || desti.getColumna()>8) return false;
		
		//El destino tiene una pieza de color propio
		TPesa pesaOrigen = taulell[origen.getFila()-1][origen.getColumna()-1];
		TPesa pesaDesti = taulell[desti.getFila()-1][desti.getColumna()-1];
		if(pesaOrigen != null && pesaDesti != null && pesaOrigen.getColor().equals(pesaDesti.getColor()) ) return false;
		
		//Origen y destino misma posicion
		if(origen.equals(desti)) return false;
				
		//Se produce jaque
		if(escac(origen,desti)) return false;
		
		//Movimiento tiene que ser diagonal. Hay que desplazarse mismo numero de filas que de columnas
		int despFila = desti.getFila() - origen.getFila();
		int despCol = desti.getColumna() - origen.getColumna();
		if(Math.abs(despFila) != Math.abs(despCol)) return false;
		
		//Camino despejado: No puede haber otras piezas en el camino
		boolean enc = false;
		int i = origen.getFila() - 1  + despFila;
		int j = origen.getColumna() - 1 + despCol;
		while(i != desti.getFila() - 1){
			if(taulell[i][j] != null ) return false;
		}
		return true;
		
	}

	@Override
	public boolean mou(TPosicio origen, TPosicio desti) {
		if(pucMoure(origen,desti)) {
			taulell[desti.getFila()-1][desti.getColumna() -1] = taulell[origen.getFila()-1][origen.getColumna() -1];
			taulell[origen.getFila()-1][origen.getColumna() -1] = null;
			return true;
		} else {
			return false;
		}
	}

}
