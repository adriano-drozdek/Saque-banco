package entities;

public class Account {

	private String nome;
	private int conta;
	private int valor;

	public Account(String nome, int conta, double depositoInicial) {
		this.nome = nome;
		this.conta = conta;
		deposito(depositoInicial);
	}

	public Account(String nome, int conta) {
		this.nome = nome;
		this.conta = conta;
	}

	public Account(int conta2, String nome2, double depositoInicial) {
		this.nome = nome2;
		this.conta = conta2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public int getValor() {
		return valor;
	}

	public void deposito(double quantidade) {
		valor += quantidade;
	}

	public void saque(double quantidade) {
		valor -= quantidade + 5.00;
	}

	public String toString() {

		return "account" 
		+ conta 
		+ ", titular: " 
		+ nome 
		+ ", valor: $ " 
		+ String.format("%.2f", valor);
	}

}
