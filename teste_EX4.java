package ContaBancaria;

public class teste_EX4 {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente("Liliana", 8500.0, 2.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Jonathan", 700.0, 500.0);

        contaCorrente.retirada(100.0);
        contaPoupanca.retirada(200.0); 
        contaCorrente.retirada(1500.0); 
        contaPoupanca.retirada(400.0); 
    }
}

