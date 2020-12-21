package _01ejercicios._05clases._03Figuras;

public abstract class Figura {
	private int posX;
	private int posY;
	private String color;

	public Figura(int posX, int posY, String color) {
		this.posX = posX;
		this.posY = posY;
		this.color = color;
	}

	public String toString() {
		return "(" + posX + "," + posY + ") - Color: " + color + " Area: " + area();
	}
//	public double area(){
//		return 0;
//	}
	public abstract double area();

}
