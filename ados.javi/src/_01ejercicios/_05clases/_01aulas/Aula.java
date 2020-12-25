package _01ejercicios._05clases._01aulas;

public class Aula {
	private int codigo;
	private double longitud;
	private double anchura;

	//Constructor
	public Aula(int codigo, double longitud, double anchura){
		this.codigo = codigo;
		this.longitud = longitud;
		this.anchura = anchura;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getAnchura() {
		return anchura;
	}

	public void setAnchura(double anchura) {
		this.anchura = anchura;
	}
	
	public double capacidad(){
		return superficie() / 1.4;
	}
	
	public double superficie(){
		return longitud * anchura;
	}
	
	@Override
	public String toString(){
		
		return String.format("%d - %5.1f m2 - %4.1f alumnos",
				codigo, superficie(), capacidad()); 
	}
}






