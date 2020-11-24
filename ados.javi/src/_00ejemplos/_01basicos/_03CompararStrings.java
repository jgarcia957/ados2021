package _00ejemplos._01basicos;

import java.util.Scanner;

public class _03CompararStrings {
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		//Los strings no se DEBEN comparar con ==
		
		//Este caso funciona porque los String son literales y ya se conocen en tiempo de compilación
		//Java crea un solo objeto "silla" y lo asigna tanto a mueble1 como a mueble2
		String mueble1 = "silla";
		String mueble2 = "silla";
		if(mueble1 == mueble2) {
			System.out.println("muebles iguales");
		}
		
		//En este caso, tenemos dos Strings distintos aunque el usuario repita el nombre y
		//tengan el mismo contenido
		System.out.println("Nombre del padre: ");
		String padre = tec.nextLine();
		
		System.out.println("Nombre del hijo");
		String hijo = tec.nextLine();
		
		if(padre == hijo) {
			System.out.println("Padre e hijo se llaman igual");
		} else {
			System.out.println("Padre e hijo se llaman distinto");
		}
		
		//Los Strings se comparan con equals
		if(padre.equals(hijo)) {
			System.out.println("Padre e hijo se llaman igual");
		} else {
			System.out.println("Padre e hijo se llaman distinto");
		}
		
		//Si no queremos diferenciar mayúsculas y minúsculas
		if(padre.equalsIgnoreCase(hijo)) {
			System.out.println("Padre e hijo se llaman igual");
		} else {
			System.out.println("Padre e hijo se llaman distinto");
		}
		
		
	}

}
