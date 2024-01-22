package Calculadora;

public class Calculadora {

	public static void main(String[] args) {
		Calculator myCalculator= new Calculator();
		
		 System.out.println("Soma (int): " + myCalculator.somar(8, 6));
	     System.out.println("Soma (double): " + myCalculator.somar(5.5, 3.3));

	     System.out.println("Subtração (int): " +myCalculator.subtrair(4, 8));
	     System.out.println("Subtração (double): " + myCalculator.subtrair(10.4, 4.2));

	     System.out.println("Multiplicação (int): " + myCalculator.multiplicar(6, 8));
	     System.out.println("Multiplicação (double): " + myCalculator.multiplicar(6.1, 8.4));

	     System.out.println("Divisão (int): " + myCalculator.dividir(9, 3));
	      System.out.println("Divisão (double): " + myCalculator.dividir(1.01, 3.0));
	    }
	
	}


