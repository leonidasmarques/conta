package application;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta cont = new Conta();
			
		int opcao = 0;
		
		System.out.println("INFORME QUE OPERAÇÃO A SER REALIZADA");
		System.out.println(" 1 - Criar conta");
		System.out.println(" 2 - Ver saldo");
		System.out.println(" 3 - Realizar deposito");
		System.out.println(" 4 - Realizar saque");
		opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Informe o numero da conta: ");
			int numero = sc.nextInt();
			cont.setNumeroConta(numero);
			System.out.println("Informe o nome do titular da conta: ");
			String nome = sc.next();
			cont.setNome(nome);
			double depositoInicial;
			System.out.println("Havera depositio inicial? (1) para sim / (2) para não");
			int resposta = sc.nextInt();
			if( resposta == 1) {
				System.out.println("Informe o valod de depoisito inicial: ");
				depositoInicial = sc.nextDouble();
				cont.setDepositoInicial(depositoInicial);
			}else {
				cont.setDepositoInicial(0);
			}
			break;
		case 2: 
			System.out.println(cont.saldo());
			break;
			
		case 3: 
			System.out.println("Informe o valor a depositar");
			double valor = sc.nextDouble();
			cont.deposito(valor);
		default:
			break;
		}
		
		/*
		System.out.println("Informe o numero da conta: ");
		int numero = sc.nextInt();
		cont.setNumeroConta(numero);
		System.out.println("Informe o nome do titular da conta: ");
		String nome = sc.nextLine();
		cont.setNome(nome);
		double depositoInicial;
		System.out.println("Havera depositio inicial? (1) para sim / (2) para não");
		int resposta = sc.nextInt();
		if( resposta == 1) {
			System.out.println("Informe o valod de depoisito inicial: ");
			depositoInicial = sc.nextDouble();
			cont.setDepositoInicial(depositoInicial);
		}else {
			cont.setDepositoInicial(0);
		}*/
		
		System.out.println(cont.saldo());
		
		sc.close();

	}

}
