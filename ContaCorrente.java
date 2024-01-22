package ContaBancaria;

public class ContaCorrente extends ContaBanco {
	   double taxaDeOperacao;

	    public ContaCorrente(String titular, double saldoInicial, double taxaDeOperacao) {
	        super(titular, saldoInicial);
	        this.taxaDeOperacao = taxaDeOperacao;
	    }

	    @Override
	    public void retirada(double valor) {
	        double taxa = valor * (taxaDeOperacao / 100.0);
	        double valorTotal = valor + taxa;

	        if (valorTotal <= saldo) {
	            saldo -= valorTotal;
	            System.out.println("Retirada de " + valor + " realizada com taxa de " + taxa + ". Saldo atual: " + saldo);
	        } else {
	            System.out.println("Saldo insuficiente para a retirada de " + valor);
	        }
	    }
	}

