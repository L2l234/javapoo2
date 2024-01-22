package ContaBancaria;

public class ContaPoupanca extends ContaBanco {
	 double limite;
	
	public ContaPoupanca (String titular, double SaldoInicial, double limite) {
		super(titular, SaldoInicial);
		this.limite=limite;
		
	}
	@Override
	public void retirada(double valor) {
        if (valor <= saldo && valor<=limite) {
            saldo -= valor;
            System.out.println("Retirada de " + valor + " realizada. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente ou acima do limite para a retirada de " + valor);
        }
}
}