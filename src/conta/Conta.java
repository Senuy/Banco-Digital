package conta;

import cliente.Cliente;

public abstract  class Conta implements IConta{
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	private static final int AGENCIA_PADRAO = 0001;
	private static  int SEQUENCIAL = 1;
	protected Cliente cliente;
	
	


	public int getAgencia() {
		return agencia;
	}


	public int getNumero() {
		return numero;
	}


	public double getSaldo() {
		return saldo;
	}


	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	
	public void depositar(double saldo) {
		this.saldo +=saldo;
		
	}
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	public void sacar(double valor) {
		this.saldo -=valor;
	}
	
	protected void extratoContas() {
		
		System.out.println("Titular: "+cliente.getNome());
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Saldo: R$ %.2f", this.saldo));
		System.out.println("---------------------------------------");
	}
	

}
