package conta;

public interface IConta {

	 void sacar(double valor);
	 void depositar(double saldo);
	 void transferir(double saldo,Conta contaDestino);
	 void imprimirExtrato();

	
}
