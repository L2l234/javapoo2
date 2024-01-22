package ContaBancaria;

public class ContaBanco {
	 String titular;
     double saldo;

    public ContaBanco(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void deposito(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado. Saldo atual: " + saldo);
    }

    public void retirada(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Retirada de " + valor + " realizada. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para a retirada de " + valor);
        }
    }
}

