package edu.dio.application;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite o seu Nome Completo: ");
		String nomeCliente = sc.nextLine();

		System.out.println("Digite o Numero da Agencia: ");
		String agencia = sc.nextLine();

		System.out.println("Digite o Numero da Conta: ");
		int numero = sc.nextInt();

		System.out.println("Digite o valor do Saldo: ");
		double saldo = sc.nextDouble();

		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
		
		sc.close();
	}

}
