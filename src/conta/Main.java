package conta;

import cliente.Cliente;

public class Main {

	public static void main(String[] args) {
		Cliente yunes = new Cliente();
		yunes.setNome("Yunes da Silva Santos");
		
		Conta cc = new ContaCorrente(yunes);
		Conta cp = new ContaPoupanca(yunes);
		
		//Conta cc1 = new ContaCorrente();
		cc.depositar(100);
		cc.imprimirExtrato();
		cc.transferir(100, cp);
		
		
		//cc1.depositar(100);
		//cc1.imprimirExtrato();
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
