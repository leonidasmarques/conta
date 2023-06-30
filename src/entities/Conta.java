package entities;

public class Conta {

	private String nome;
	private int numeroConta;
	private double depositoInicial;
	private double saldo;
	
	
	public Conta(String nome, int numeroConta, double saldo) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}


	public Conta(String nome, int numeroConta, double depositoInicial, double saldo) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.depositoInicial = depositoInicial;
		this.saldo = saldo;
	}
	
	
	
	
}
