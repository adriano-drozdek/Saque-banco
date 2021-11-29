package entities;

public class Account {

	private String nome;
	private int conta;
	private double valor;

	public Account(String nome, int conta) {
		this.nome = nome;
		this.conta = conta;
	}

	public Account(String nome, int conta, double depositoInicial) {
		this.nome = nome;
		this.conta = conta;
		deposito(depositoInicial);
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

	public double getValor() {
		return valor;
	}

	public void deposito(double quantidade) {
		valor += quantidade;
	}

	public void saque(double quantidade) {
		valor -= quantidade + 5.00;
	}

	public String toString() {

		return "Conta " + conta + ", titular: " + nome + ", valor: $ " + String.format("%.2f", valor);
	}

}
