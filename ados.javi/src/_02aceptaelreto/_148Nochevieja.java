package _02aceptaelreto;

import java.util.Scanner;

public class _148Nochevieja {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String hora;
		do {
			hora = tec.next();
			if(!hora.equals("00:00")){
				int h = Integer.parseInt(hora.substring(0,hora.indexOf(":")));
				int m = Integer.parseInt(hora.substring(hora.indexOf(":") + 1));
				
				int restante = (60 - m) + (24 - h - 1) * 60; 
				System.out.println(restante);
			}
			
		} while (!hora.equals("00:00"));
	}

}
