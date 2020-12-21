package _00ejemplos._05clases.interfaces;

public class Vino implements Valorable, Comparable<Vino> {
	private String nombre;
	private int anyo;
	public Vino(String nombre, int anyo){
		this.nombre = nombre;
		this.anyo = anyo;
	}
	@Override
	public double valorar() {
		return 3 + anyo;
	}
	public int compareTo(Vino v){
		//Se considera menor el vino mas antiguo
		return this.anyo - v.anyo;
	}
	@Override
	public String toString() {
		return "Vino [nombre=" + nombre + ", anyo=" + anyo + "]";
	}

}
