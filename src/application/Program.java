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
		
		System.out.println("Haverá deposto inicial? ");
		String resposta = sc.next().charAt(0);
			if(equals.resposta == 's') {
				
			};
		System.out.println("Informe o nome do titular da conta: ");
		double depositoInicial = sc.nextDouble();
		cont.setDepositoInicial(depositoInicial);
		
		
		
		sc.close();

	}

}
