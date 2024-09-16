package conta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca() {
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("-------EXTRATO CONTA POUPANÇA ---------");
		super.extratoContas();	
	}


}
