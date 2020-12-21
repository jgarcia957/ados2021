package _00ejemplos._05clases.interfaces;

public class TestValorar {
	public static void main(String[] args) {
		Object[] patrimonio =  {new Vino("x",2000), new Vino("y",1990), new Inmueble("piso",100), new Inmueble("chalet",200)};
		
		double valor = 0;
		for (int i = 0; i < patrimonio.length; i++) {
			valor = valor + ((Valorable)patrimonio[i]).valorar();
		}
		System.out.println(valor);
		
		Valorable[] patrimonio2 =  {new Vino("x",2000), new Vino("y",1990), new Inmueble("piso",100), new Inmueble("chalet",200)};
		
		valor = 0;
		for (int i = 0; i < patrimonio2.length; i++) {
			valor = valor + patrimonio2[i].valorar();
		}
		System.out.println(valor);
	}
	

}
