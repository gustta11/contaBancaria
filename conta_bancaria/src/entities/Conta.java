package entities;

public class Conta {
	
	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	public Conta() {
		
	}
	
	public Conta(int numeroConta, String nomeTitular, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		deposito(saldo);
	}
	
	 public Conta(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	
	 
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getTitular() {
		return nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	} 

	public void deposito(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	public void saque(double ValorSaque) {
		saldo = saldo - (ValorSaque + 5);
	}
	
	
}
