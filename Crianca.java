package Pessoa;

public class Crianca extends Pessoa {
	String escola;
	public Crianca(String nome, String endereco, int idade, String escola) {
		super(nome, endereco, idade);
		this.escola=escola;
	}
	
	public void brincar() {
		System.out.println("A criança está brincando");
	}
	
		@Override
		public void correr() {
		System.out.println("A criança está correndo");
			}

		public void dancar() {
		System.out.println("A crianca está dançando");
		}
	
		
}
