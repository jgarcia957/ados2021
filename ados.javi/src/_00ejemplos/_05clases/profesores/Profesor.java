package _00ejemplos._05clases.profesores;

public class Profesor extends Persona {
	private String especialidad;
	private double salario;
	
	//Constructor/es
	public Profesor(String nif, String nombre, String especialidad, double salario) {
		super(nif,nombre); //Tiene que ser la primera instrucción
		//No llamar al constructor de la clase padre equivale a 
		//super();
		this.especialidad = especialidad;
		this.salario = salario;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString(){
		//Reescritura parcial
		return super.toString() + "\n" +
				"Especialidad: " + especialidad + "\n" + 
				"Salario: " + salario ;
	}
	

}
