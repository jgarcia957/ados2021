package _01ejercicios._05clases._03Figuras;

public class TestFiguras {
	public static void main(String[] args) {
		Circulo c1 = new Circulo(10,10,30,"rojo");
		Rectangulo r1 = new Rectangulo(10,10,30,40,"Azul");
		
		System.out.println(c1);
		System.out.println(c1.area());
		
		System.out.println(r1);
		System.out.println(r1.area());
		
		System.out.println(" --------------- ");
		Figura [] v = {new Circulo(10,10,30,"rojo"),new Rectangulo(10,10,30,40,"Azul")};
		
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
			System.out.println(v[i].area());
		}
	}

}
