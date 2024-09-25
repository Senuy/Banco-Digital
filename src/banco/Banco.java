package banco;
import conta.Conta;

public class Banco {
	private String nome;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void buscarConta (int numeroConta) {
		Conta conta = Conta.buscarConta(numeroConta);
		if (conta != null) {
			System.out.println("Conta: "+conta.getNumero());
			conta.imprimirExtrato();
		}else {
			System.out.println("Conta não encontrada");
		}
	}
	
	public void listarTodasAsContas() {
		System.out.println("Listando todas as contas do Banco: "+ this.nome);
		Conta.listarContas();
	}
}

