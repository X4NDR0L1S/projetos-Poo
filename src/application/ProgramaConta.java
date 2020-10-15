package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProgramaConta {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Entre com o numero da Conta: ");
		int numero = sc.nextInt();
		System.out.print("Entre com o nome do titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Havera deposito inicial? (S/N) ");
		char resposta = sc.next().charAt(0);
		if (resposta == 'S') {
			System.out.print("Insira o valor de deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			account = new Account(numero, titular, depositoInicial);
			
		}
		else {
			account = new Account(numero, titular);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Entre com o valor do deposito: ");
		double valorDoDeposito = sc.nextDouble();
		account.deposito(valorDoDeposito);
		System.out.println("Dados atualizados da conta: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Entre com o valor do saque: ");
		double valorDoSaque = sc.nextDouble();
		account.sacar(valorDoSaque);
		System.out.println("Dados atualizados da conta: ");
		System.out.println(account);
		
		
		sc.close();
	}

}
