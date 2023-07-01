package application;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta cont = new Conta();
			
		System.out.println("Informe o nome do titular da conta: ");
		String nome = sc.nextLine();
		cont.setNome(nome);
		System.out.println("Informe o numero da conta: ");
		int numero = sc.nextInt();
		cont.setNumeroConta(numero);
		
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
		
		System.out.println(cont.saldo());
		
		sc.close();

	}

}
