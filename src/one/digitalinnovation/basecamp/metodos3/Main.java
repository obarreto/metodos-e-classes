package one.digitalinnovation.basecamp.metodos3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exercício retornos");
		
		double areaQuadrado = Quadrilatero.area(3d);
		System.out.println("Área do quadrado:" + areaQuadrado);
		
		double areaQuadrado2 = Quadrilatero.area(5d, 5d);
		System.out.println("Área do quadrado:" + areaQuadrado2);
		
		double areaQuadrado3 = Quadrilatero.area(7, 8, 9);
		System.out.println("Área do quadrado:" + areaQuadrado3);
		
		double areaQuadrado4 = Quadrilatero.area(5f, 5f);
		System.out.println("Área do quadrado:" + areaQuadrado4);
		
		double pontoFlutuante = Quadrilatero.abc();
		System.out.println(pontoFlutuante);
	}
}
