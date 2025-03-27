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
		this.saldo = saldo;
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

	public void setDeposito(double valorDeposito) {
		this.saldo += valorDeposito;
	}
	
	public void setSaque(double ValorSaque) {
		this.saldo = this.saldo - (ValorSaque + 5);
	}
	
	
}
