package _01ejercicios._05clases._03Figuras;

public class Circulo extends Figura {
	private int radio;
	
	public Circulo(int posX, int posY, int radio,  String color){
		super(posX,posY,color);
		this.radio = radio;
	}
	
	public double area(){
		return Math.PI * radio * radio;
	}

}
