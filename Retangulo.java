package FormaGeometrica;

public class Retangulo implements GeometricForms {
	double largura;
	double comprimento;
	
	
	public Retangulo(double largura, double comprimento) {
		this.largura=largura;
		this.comprimento=comprimento;
		
	}
	@Override
    public double calcularArea() {
        return  largura * comprimento;
    }
}
