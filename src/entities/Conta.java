package entities;

public class Conta {

	private String nome;
	private int conta;
	private int valor;
	
	public Conta(String nome, int conta, int depositoInicial) {
		super();
		this.nome = nome;
		this.conta = conta;
		deposito(depositoInicial);
	}

	public Conta(String nome, int conta) {
		super();
		this.nome = nome;
		this.conta = conta;
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
	
}
