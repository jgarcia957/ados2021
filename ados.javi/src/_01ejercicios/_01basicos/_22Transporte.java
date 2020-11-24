package _01ejercicios._01basicos;

import java.util.Scanner;

public class _22Transporte {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dia de la semana: ");
		int dia = sc.nextInt();
		if(dia >= 1 && dia <= 6){
				System.out.println("Numero de bultos: ");
				int bultos = sc.nextInt();
				if(bultos >= 0 && bultos <= 30){
					double pesoTotal = 0;
					for(int i = 0; i<= bultos && pesoTotal <= 1000; i++){
						System.out.println("Peso: ");
						double peso = sc.nextDouble();
						pesoTotal += peso;
					}
					if (pesoTotal <= 1000){
						double coste = 30 * bultos;
						if(pesoTotal > 300){
							coste += (pesoTotal - 300) * 0.9;
						}
						if(dia == 6){
							coste += 60;
						}
					} else {
						System.out.println("Podemos entregar 1000 kg como m�ximo");
					}
				} else {
					System.out.println("Podemos entregar entre 1 y 30 bultos");
				}
			
		} else {
			System.out.println("No trabajamos domingos");
		}
	}
}
