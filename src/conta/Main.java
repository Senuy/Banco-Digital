package conta;

public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		Conta cc1 = new ContaCorrente();
		cc.depositar(100);
		cc.imprimirExtrato();
		cc.transferir(100, cp);
		
		
		//cc1.depositar(100);
		//cc1.imprimirExtrato();
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
