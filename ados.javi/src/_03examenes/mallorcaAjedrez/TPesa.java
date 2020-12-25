package _03examenes.mallorcaAjedrez;

public abstract class TPesa {
	//variable comun a todas las piezas
	static TPesa[][] taulell;
	
	//Atributos
	private TColor color;
	public TPesa (TColor color){
		this.color = color;
	}
	public TColor getColor(){
		return this.color;
	}
	
	public abstract boolean pucMoure(TPosicio origen, TPosicio desti);
	public abstract boolean mou(TPosicio origen, TPosicio desti);
	public boolean escac(TPosicio origen, TPosicio desti){
		//Localizamos al rey del color propio
		boolean enc = false;
		TPosicio posRey = null;
		for (int i = 0; i < taulell.length && !enc; i++) {
			for (int j = 0; j < taulell.length && !enc; j++) {
				if(taulell[i][j] != null && taulell[i][j] instanceof TRey && taulell[i][j].color.equals(this.color)){
					enc = true;
					posRey = new TPosicio(i+1, j+1);
				}
			}
		}
		//Comprobamos si alguna pieza del color contrario puede ponerse en la posicion del rey propio
		//En caso de que quitaramos la pieza de la posicion origen
		
		//Quitamos la pieza cuyo movimiento queremos ver si provoca jaque
		TPesa aux = taulell[origen.getFila()][origen.getColumna()];
		taulell[origen.getFila()][origen.getColumna()] = null;
		
		enc = false;
		for (int i = 0; i < taulell.length && !enc; i++) {
			for (int j = 0; j < taulell.length && !enc; j++) {
				TPosicio posAtacante = new TPosicio(i+1, j+1);
				if(taulell[i][j] != null && !taulell[i][j].color.equals(this.color)
						&& taulell[i][j].pucMoure(posAtacante, posRey)){
					enc = true; //Hay jaque
					
				}
			}
		}
		
		//Volvemos a colocar la pieza donde estaba
		taulell[origen.getFila()][origen.getColumna()] = null;
		
		//Devolver resultado
		return enc;
	}
}
