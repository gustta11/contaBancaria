package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Conta conta = new Conta();
		
		System.out.println("Informe o número da conta:");
		int numeroConta = scan.nextInt();
		System.out.println("Informe o nome do titular:");
		String nomeTitular = scan.next();
		System.out.println("Você quer realizar o primeiro depósito (y/n)?");
		String primeiroDeposito = scan.next();
		
		if(primeiroDeposito.contains("y")) {
			System.out.println("Informe o valor do depósito:");
			double valor = scan.nextDouble(); 
			 conta = new Conta(numeroConta, nomeTitular,valor);
		}else {
			conta = new Conta(numeroConta, nomeTitular,0);
		}
		
		System.out.println();
		
		
		
		System.out.println("Dados da conta:");	
		System.out.println("Conta " + conta.getNumeroConta() + ", Titular:" + conta.getTitular() + ", Saldo: $ " + conta.getSaldo());
		
		System.out.println();
		
		System.out.println("Deposite um valor:");
		double valorDeposito = scan.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Atualização da conta:");
		System.out.println("Conta " + conta.getNumeroConta() + ", Titular:" + conta.getTitular() + ", Saldo: $ " + conta.getSaldo());
		
		System.out.println("Saque um valor:");
		double valorSaque = scan.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Atualização da conta:");
		System.out.println("Conta:" + conta.getNumeroConta() + ", Titular:" + conta.getTitular() + ", Saldo: $ " + conta.getSaldo());
		
		
		
		
				
		scan.close();

	}

}
