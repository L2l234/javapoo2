package FormaGeometrica;

public class Circulo implements GeometricForms {
	double raio;
	
	public Circulo(double raio) {
		this.raio=raio;
	}
	@Override
    public double calcularArea() {
        return  raio * raio;
    }

}
