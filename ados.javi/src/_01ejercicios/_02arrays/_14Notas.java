package _01ejercicios._02arrays;

import java.util.Arrays;

public class _14Notas {
	public static void main(String[] args) {
		String[] alumnos = {"Juan", "Ana", "Pedro", "Luisa"};
		String[] asignaturas = {"ED","LM","PRO"};
		
		int [][] notas = {
					{5,3,2},
					{5,5,2},
					{4,3,2},
					{5,9,2}};
		
		
		imprimirNotasPorAlumno(notas, alumnos, asignaturas);
		
	}
	public static void imprimirNotasPorAlumno (int[][] n, String[] alu, String[] as){
		for(int i = 0; i < n.length; i++){
			System.out.println(alu[i] + ": ");
			
			//Mostrar las notas de todas las asignaturas
			for(int j = 0; j < n[i].length; j++){
				System.out.println("\t" + as[j] + ": " + n[i][j]);
			}
		}
	}
	public static void imprimirNotasPorAsignatura (int[][] n, String[] alu, String[] as){
		for (int j = 0; j < n[0].length; j++) {
			System.out.println(as[j] + ": ");
			for (int i = 0; i < n.length; i++) {
				System.out.println("\t" + alu[i] + ": " + n[i][j]);
				
			}
		}
	}
	public static void mediaPorAlumno(int[][] n, String[] alu){
		for(int i = 0; i < n.length; i++){
			double suma = 0;
			for(int j = 0; j < n[i].length; j++){
				suma += n[i][j];
			}
			System.out.println("Media de " + alu[i] + ": " + suma/n[i].length);
		}
	}
	public static void mediaPorAsignatura(int[][] n, String[] as){
		for(int j = 0; j < n[0].length; j++){
			double suma = 0;
			for(int i = 0; i < n.length; i++){
				suma += n[i][j];
			}
			System.out.println("Media de " + as[j] + ": " + suma/n.length);
		}
	}
	
	public static void asignaturaMasFacil(int[][] n, String[] as){
		double mejorMedia = -1;
		String asigMasFacil = "" ;
		for(int j = 0; j < n[0].length; j++){
			double suma = 0;
			for(int i = 0; i < n.length; i++){
				suma += n[i][j];
			}
			double media = suma / n.length;
			if(media > mejorMedia){
				mejorMedia = media;
				asigMasFacil = as[j];
			}
		}
		System.out.println(asigMasFacil);
	}
	
	public static boolean existeAlumnoQueSuspendeTodo(int[][] n){
		boolean encAlumno = false;
		for(int i = 0; i < n.length && !encAlumno; i++){
			//Comprobamos si el alumno i suspende todo
			boolean encAprobado = false;
			for(int j= 0; j < n[0].length && !encAprobado; j++){
				if(n[i][j] >= 5){
					encAprobado = true;
				} 
			}
			//Ha suspendido todo?
			encAlumno = !encAprobado;
		}
		return encAlumno;
	}
	public static boolean existeAsignaturaQueSuspendeTodos(int[][] n){
		boolean encAsig = false;
		for(int j = 0; j < n[0].length && !encAsig; j++){
			//Comprobamos si la asignatura j la suspenden todos
			boolean encAprobado = false;
			for(int i = 0; i < n.length && !encAprobado; i++){
				if(n[i][j] >= 5){
					encAprobado = true;
				} 
			}
			//Han suspendido todos?
			encAsig = !encAprobado;
		}
		return encAsig;
	}

}

