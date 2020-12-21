package _01ejercicios._05clases._03Figuras;

public class Rectangulo extends Figura {
	private int altura;
	private int anchura;
	
	public Rectangulo(int posX, int posY, int altura, int anchura,  String color){
		super(posX,posY,color);
		this.altura = altura;
		this.anchura = anchura;
	}
	
	public double area(){
		return anchura * altura;
	}

}
