package _03examenes.mallorcaAjedrez;

public class TPosicio {
	private int fila;
	private char columna;
	public TPosicio(int fila, char columna){
		this.fila = fila;
		this.columna = columna;
	}
	//Para poder usar columnas numéricas
	public TPosicio(int fila, int columna){
		this.fila = fila;
		this.columna = (char) ((int) 'a' + columna -1);
	}
	public int getFila() {
		return fila;
	}
	
	//Se trabaja más facil con enteros
	public int getColumna() {
		return (int) columna -  'a' + 1;
	}
	
	
}
