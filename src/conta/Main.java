package conta;

import banco.Banco;
import cliente.Cliente;

public class Main {

	public static void main(String[] args) {
		Cliente yunes = new Cliente("Yunes da Silva Santos", "12345678910", 99999999);
		Banco  banco = new Banco();
		banco.setNome("Bradesco");
		//yunes.setNome("Yunes da Silva Santos");
		
		Conta cc = new ContaCorrente(yunes);
		Conta cp = new ContaPoupanca(yunes);
		
		//Conta cc1 = new ContaCorrente();
		cc.depositar(100);
		//cc.imprimirExtrato();
		cc.transferir(100, cp);
		
		
		//cc1.depositar(100);
		//cc1.imprimirExtrato();
		
		//cc.imprimirExtrato();
		//cp.imprimirExtrato();
		
		//cc.listarContas();
		
		
		banco.buscarConta(1);
		banco.listarTodasAsContas();

	}

}
