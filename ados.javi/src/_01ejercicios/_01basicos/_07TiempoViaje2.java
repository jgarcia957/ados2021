package _01ejercicios._01basicos;

import java.util.Scanner;

public class _07TiempoViaje2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Salida (hh mm): ");
		int hSalida = tec.nextInt();
		int mSalida = tec.nextInt();
		
		System.out.println("Llegada (hh mm): ");
		int hLlegada = tec.nextInt();
		int mLlegada = tec.nextInt();
		
		//Pasamos la hora minutos a minutos
		int tSalida = hSalida * 60 + mSalida;
		int tLlegada = hLlegada * 60 + mLlegada;
		
		//Nueva duracion del trayecto
		System.out.println("Duracion del trayecto: " + (tLlegada - tSalida));
		int nuevaDuracion = (int) Math.round((tLlegada - tSalida) * 1.15);
		System.out.println("Nueva duracion del trayecto: " + nuevaDuracion);
		int tNuevaLlegada = tSalida + nuevaDuracion;
		
		//Nuevo instante de llegada
		int hNueva = tNuevaLlegada / 60;
		int mNueva = tNuevaLlegada % 60;
		System.out.println("Nueva llegada: " + hNueva + ":" + mNueva);
		
		
		
		
	}

}
