package FormaGeometrica;

public class test_ex3 {

	public static void main(String[] args) {
	
		Circulo novoCirculo=new Circulo(4.1);
		Retangulo novoRetangulo= new Retangulo(3.2 , 4.8);
		
		System.out.println(" Área do Circulo :" +novoCirculo.calcularArea());
		System.out.println("Área do Retângulo: " +novoRetangulo.calcularArea());

	}

}
