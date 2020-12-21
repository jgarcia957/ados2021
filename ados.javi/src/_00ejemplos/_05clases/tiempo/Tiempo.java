package _00ejemplos._05clases.tiempo;

public class Tiempo implements Comparable<Tiempo> /* extends Object */ {
	// Atributos
	private int hora;
	private int minuto;
	private int segundo;

	// Constructores
	public Tiempo(int hora, int minuto, int segundo) {
//		this.hora = hora;
//		this.minuto = minuto;
//		this.segundo = segundo;
		this.setHora(hora);
		this.setMinuto(minuto);
		this.setSegundo(segundo);
	}

	public Tiempo() {
		this(0, 0, 0);
		// hace lo mismo que ...
		// hora = 0;
		// minuto = 0;
		// segundo = 0;
	}

	@Override
	public String toString() {
		//return hora + ":" + minuto + "::" + segundo;
		return String.format("%02d:%02d:%02d", hora, minuto, segundo);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true; // mismo objeto
		if (o == null)
			return false;
		if (!(o instanceof Tiempo))
			return false;

		Tiempo t = (Tiempo) o;
		return this.hora == ((Tiempo)o).hora && this.minuto == t.minuto && this.segundo == t.segundo;
	}

	public int compareTo(Tiempo t) {
		if (this.hora < t.hora)
			return -1;
		else if (this.hora > t.hora)
			return 1;
		else if (this.minuto < t.minuto)
			return -1;
		else if (this.minuto > t.minuto)
			return 1;
		else
			return this.segundo - t.segundo;
	}

	public int hashCode() {
		String t = hora + " " + minuto + "  " + segundo;
		return t.hashCode();
		//return hora;
	}

	public int getHora() {
		return this.hora;
	}

	public void setHora(int hora) {
		if(hora < 0) this.hora = 0;
		else if (hora > 23) this.hora = 23;
		else this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if(minuto < 0) minuto = 0;
		else if (minuto > 59) minuto = 59;
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if(segundo < 0) segundo = 0;
		else if (segundo > 59) segundo = 59;
		this.segundo = segundo;
	}

}
