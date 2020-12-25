package _01ejercicios._05clases._01aulas;

public class AulaMusica extends Aula{
	private boolean piano;
	
	public AulaMusica(int c, double l, double a, boolean p){
		super(c,l,a);
		this.piano = p;
	}
	public boolean isPiano(){
		return piano;
	}
	public void setPiano(boolean p){
		piano = p;
	}
	public double capacidad(){
		if(piano) return super.capacidad() - 2;
		else return super.capacidad();
		
	}
	@Override
	public String toString(){
		return "Aula de musica " + super.toString() 
		+ (piano? "con piano":"sin piano");
	}
}
