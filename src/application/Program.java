package application;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta cont = new Conta();

		boolean escolha = true;
		do {
			System.out.println("Deseja realizar alguma operação? ");
			String aux = sc.next();
			if (aux.equals("s") || aux.equals("S")) {
				int opcao = 0;
				System.out.println("INFORME QUE OPERAÇÃO A SER REALIZADA");
				System.out.println(" 1 - Criar conta");
				System.out.println(" 2 - Ver extrato");
				System.out.println(" 3 - Realizar depósito");
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
					System.out.println("Havera depósito inicial? (1) para sim / (2) para não");
					int resposta = sc.nextInt();
					if (resposta == 1) {
						System.out.println("Informe o valor de depósito inicial: ");
						depositoInicial = sc.nextDouble();
						cont.setDepositoInicial(depositoInicial);
					} else {
						cont.setDepositoInicial(0);
					}
					System.out.println("Conta com limite especial? (1) para sim / (2) para não");
					int resp = sc.nextInt();
					if(resp == 1) {
						cont.setLimite(true);
						cont.saldo();
					}
					break;

				case 2:
					System.out.println(cont);
					break;

				case 3:
					System.out.println("Informe o valor a depositar");
					double valor = sc.nextDouble();
					cont.deposito(valor);
					break;

				case 4:
					System.out.println("Informe o valor para saque");
					valor = sc.nextDouble();
					cont.saque(valor);
					break;

				default:
					break;
				}

			} else {
				escolha = false;
				System.out.println("Obrigado por usar nossos serviços!");
			}

		} while (escolha != false);

		System.out.println(cont.saldo());

		sc.close();

	}

}
