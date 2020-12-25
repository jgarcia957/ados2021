package _01ejercicios._05clases._01aulas;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {

		// ArrayList para almacenar aulas

		ArrayList<Aula> listaAulas = new ArrayList<>();

		// En listaAulas puedo almacenar cualquier objeto que
		// ES_UN Aula

		listaAulas.add(new Aula(1, 15, 20));
		listaAulas.add(new AulaInformatica(2,15,20,5));
		listaAulas.add(new AulaMusica(3,10,30,true));
		
		for(Aula a: listaAulas){
			System.out.println(a.toString());
			System.out.println("---------------");
		}
	}
}
