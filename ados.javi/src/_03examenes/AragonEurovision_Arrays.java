package _03examenes;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class AragonEurovision_Arrays {
	
	public static void main(String[] args) {
		//Nombre de los 43 paises votantes
		String[] paisesVotantes = {
				"AA","AB","AC","AD","AE","AF","AG","AH",
				"AI","AJ","AK","AL","AM","AN","AO","AP",
				"AQ","AR","AS","AT","AU","AV","AW","AX",
				"AZ","BA","BB","BC","BD","BE","BF","BG",
				"BH","BI","BJ","BK","BL","BM","BN","BO",
				"BP","BQ","BR"};
		
		//Nombre de los 26 paises finalistas (a los que se vota)
		String[] paisesFinalistas = {
				"AA","AB","AC","AD","AE","AF","AG","AH",
				"AI","AJ","AK","AL","AM","AN","AO","AP",
				"AQ","AR","AS","AT","AU","AV","AW","AX",
				"AZ","BA"};
		
		//Ordenar finalistas alfabeticamente para el listado final
		Arrays.sort(paisesFinalistas);
				
		//Puntuaciones (tantas como finalistas hay)
		int[] puntuaciones = new int[paisesFinalistas.length];
		
		
		//Obtener las votaciones de cada pais que vota y anyadir sus resultados
		//al total
		for (int i = 0; i < paisesVotantes.length; i++) {
			int[] votacionPais = obtenerVotacionPais(paisesVotantes[i], paisesFinalistas);
			anyadirVotacionAlTotal(votacionPais,puntuaciones);
		}
		
		//Mostrar clasificacion alfabetica
		mostrarClasificacion(paisesFinalistas,puntuaciones);
		
		//Mostrar clasificacion mas alta y mas baja
		int min = obtenerPosMinimo(puntuaciones);
		int max = obtenerPosMaximo(puntuaciones);
		System.out.format("Mejor clasificado: %s con %d puntos%n",paisesFinalistas[max],puntuaciones[max] );
		System.out.format("Peor clasificado: %s con %d puntos%n",paisesFinalistas[min],puntuaciones[min] );
		
	}

	/**
	 * Devuelve un array con las votaciones que un pais otorga a cada uno de los finalistas
	 * @param paisQueVota Nombre del pais que vota. Se necesita para que no se pueda votar a sí mismo
	 * @param paisesFinalistas Nombres de los paises finalistas. Se necesita para que no se pueda votar a sí mismo
	 * @return array con tantos elementos como paises finalistas con la puntuación que se ha otorgado a cada uno
	 */
	private static int[] obtenerVotacionPais(String paisQueVota, String[] paisesFinalistas) {
		
		/* Para cada una de las puntuaciones que se pueden dar (1,2, ..., 8, 10, 12), se elije aleatoriamente
		 * un país al que darsela.
		 * Hay que controlar que no se da puntuacion dos veces al mismo país y que el pais no se voto a si mismo
		 */
		
		int[] votacion = new int[paisesFinalistas.length]; //Array que se rellenara con las puntuaciones otorgadas
		
		//Asignar cada una de las 10 puntuaciones
		for (int puntos = 1 ; puntos <= 10; puntos++) {
			//Generamos aleatoriamente el pais al que se dara la votacion
			//Si el pais obtenido es el que vota o ya ha sido votado, lo generamos
			//de nuevo
			int pais;
			do{
				pais = (int) (Math.random() * paisesFinalistas.length);
			} while(paisesFinalistas[pais].equals(paisQueVota) || votacion[pais] !=0);
			
			if (puntos == 9) votacion[pais] = 10; //La novena puntuacion son 10 puntos
			else if(puntos == 10) votacion[pais] = 12; //La decima puntuacion son 12 puntos
			else votacion[pais] = puntos;
		}
		return votacion;
	}
	

	/**
	 * Anyade al array que contiene los totales obtenidos por cada finalista, las puntuaciones
	 * otorgadas por algún nuevo país.
	 * @param votacionPais lo que hay que anyadir a cada pais
	 * @param puntuaciones puntuaciones totales de cada pais
	 */
	private static void anyadirVotacionAlTotal(int[] votacionPais, int[] puntuaciones) {
		for (int i = 0; i < puntuaciones.length; i++) {
			puntuaciones[i] += votacionPais[i];
		}
	}
	
	/**
	 * Devuelve en que posicion del array se encuentra el maximo
	 * @param puntuaciones array a recorrer
	 * @return posicion del máximo
	 */
	
	private static int obtenerPosMaximo(int[] puntuaciones) {
		int posMax = 0;
		for (int i = 1; i < puntuaciones.length; i++) {
			if(puntuaciones[i]  > puntuaciones[posMax]){
				posMax = i;
			}
		}
		return posMax;
	}
	
	/**
	 * Devuelve en que posicion del array se encuentra el maximo
	 * @param puntuaciones array a recorrer
	 * @return posicion del máximo
	 */
	private static int obtenerPosMinimo(int[] puntuaciones) {
		int posMin = 0;
		for (int i = 1; i < puntuaciones.length; i++) {
			if(puntuaciones[i] < puntuaciones[posMin]){
				posMin = i;
			}
		}
		return posMin;
	}

	/**
	 * Muestra el nombre de cada país y su puntuación
	 * @param paisesFinalistas Nombre de los paises
	 * @param puntuaciones Puntuacion obtenida
	 */
	private static void mostrarClasificacion(String[] paisesFinalistas, int[] puntuaciones) {
		System.out.println("CLASIFICACION");
		System.out.println("=============");
		for (int i = 0; i < paisesFinalistas.length; i++) {
			System.out.println(paisesFinalistas[i] + ": " + puntuaciones[i]);
		}
	}
}
