package _00ejemplos._05clases.interfaces;

public class Inmueble implements Valorable {
	//Si una clase implementa un interface, entonces tiene que 
	//implementar todos los métodos que el interface contenga
	//o bien ser abstracta.
	private int metros;
	private String descripcion;
	
	public Inmueble(String descripcion, int metros){
		this.descripcion = descripcion;
		this.metros = metros;
	}

	@Override
	public double valorar() {
		return 1000 * metros;
	}
	

}
