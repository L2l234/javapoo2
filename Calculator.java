package Calculadora;

public class Calculator {
	public int somar (int a,int b) {
		return a+b;
	}
	public int subtratir(int a, int b) {
		return a-b;
	}
	public int multiplicar( int a, int b) {
		return a*b;
	}
	public int dividir(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
    }
	public double somar(double a, double b) {
		return a+b;
	} 
	
	public double subtrair( double a, double b) {
		return a-b;
	}
	
	public double multiplicar(double a, double b) {
		return a*b;
	}
	
	public double dividir(double a, double b) {
		if(b!=00.0) {
			return a / b;
		}else {
			throw new ArithmeticException("Divisão por zero não é permitida.");
		}
	}
}
	
