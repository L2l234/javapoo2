package Pessoa;

public class ex2_teste {

	public static void main(String[] args) {
		
		Crianca minhaCrianca= new Crianca("Joana", "Rua Amazonas, 1989", 7, "Anglo");
		System.out.println("Nome:"+ minhaCrianca.nome);
		System.out.println("Endereço: "+ minhaCrianca.endereco);
		System.out.println(" Idade: "+minhaCrianca.idade);
		System.out.println("Escola: "+minhaCrianca.escola);
		 
		minhaCrianca.correr();
		minhaCrianca.dancar();
		minhaCrianca.brincar();

	}

}
