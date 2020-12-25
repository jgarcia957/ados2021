package _01ejercicios._05clases._01aulas;

public class AulaInformatica extends Aula {
	
	private int ordenadores;
	
	public AulaInformatica(int c, double l, double a, int o){
		super(c,l,a);
		this.ordenadores = o;
	}

	public int getOrdenadores() {
		return ordenadores;
	}

	public void setOrdenadores(int ordenadores) {
		this.ordenadores = ordenadores;
	}
	
	//Reescribimos el metodo capacidad. Reescritura total
	@Override
	public double capacidad(){
		return ordenadores * 2; 
	}
	@Override
	public String toString(){
		return "Aula de informática " + super.toString() 
		+ "\nOrdenadores " + ordenadores;
	}

}
