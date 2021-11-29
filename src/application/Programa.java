package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Informe o numero da conta: ");
		int conta = sc.nextInt();
		System.out.print("Titular da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Existe um deposito inicial (Y/N)?");
		char resposta = sc.next().charAt(0);
		if (resposta == 'y') {
			System.out.println("Insira o valor do depósito inicial:");
			double depositoInicial = sc.nextDouble();
			account = new Account(nome, conta, depositoInicial);
		}
		else {
			account = new Account(nome, conta);
		}

		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(account);

		System.out.println();
		System.out.print("Insira um valor de depósito: ");
		double depositoV = sc.nextDouble();
		account.deposito(depositoV);

		System.out.println("Dados da conta atualizados: " + account);
		System.out.println();

		System.out.print("Insira um valor de retirada: ");
		double saque = sc.nextDouble();
		account.saque(saque);
		System.out.print("Dados atualizados: ");
		System.out.print(account);

		sc.close();
	}

}
