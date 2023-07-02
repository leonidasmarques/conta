package entities;

public class Conta {

	private String nome;
	private int numeroConta;
	private double depositoInicial = 0;
	private boolean limite = false;
	private double saldoEspecial = 100.00;
	private double saldo;
	
	public Conta() {}
	
	public Conta(String nome, int numeroConta, double saldo) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}


	public Conta(String nome, int numeroConta, double depositoInicial, double saldoEspecial, double saldo) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.depositoInicial = depositoInicial;
		this.saldoEspecial =  saldoEspecial;
		this.saldo = saldo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}


	public double getDepositoInicial() {
		return depositoInicial;
	}


	public void setDepositoInicial(double depositoInicial) {
		this.saldo += depositoInicial;
	}
	
	public boolean isLimite() {
		return limite;
	}

	public void setLimite(boolean limite) {
		this.limite = limite;
	}

	public double getSaldo() {
		return saldo;
	}
	public double saldo() {	
		double aux;
		if(limite == true) {
			aux = saldo + saldoEspecial() + depositoInicial;
		}else {
			aux = saldo + depositoInicial;
		}
		return aux;
	}
	
	public double saldoEspecial() {	
		return saldoEspecial += saldo + depositoInicial ;
	}
	
	public double deposito(double valor) {
		 return saldo += valor;
	}
	
	public double saque(double valor) {
		double aux;
		if(saldo >= valor) {
			aux = saldo - valor;
			saldo = aux;
			System.out.println("Saque realizado com sucesso!!!");
			System.out.println("Seu saldo é : R$" + saldo);
		} else {
			System.out.println("Saque indisponivél! Valor de saque maior que o saldo da conta!");
		}
		 
		return saldo;
	}

	@Override
	public String toString() {
		return "Extrato de Conta - Titular: " 
				+ nome + ", Número de Conta: " 
				+ numeroConta + ", Saldo: " 
				+ saldo + ", Saldo com limite: "
				+ saldoEspecial;
	}
	
	
	
	
	
	
}
