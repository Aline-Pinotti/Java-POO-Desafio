package main;

import desafioBanco.Cliente;
import desafioBanco.Conta;
import desafioBanco.ContaCorrente;
import desafioBanco.ContaPoupanca;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1 = new Cliente("Aline");
		Cliente cliente2 = new Cliente("Vinicius");
		
		Conta cc= new ContaCorrente(cliente1);
		if(cc.depositar(100)) System.out.println("Depósito realizado com sucesso!");
		
		Conta cc2= new ContaCorrente(cliente2);
		
		if(cc.transferir(100, cc2)) System.out.println("Transferência realizada com sucesso!");
		
		cc.imprimirExtrato();
		cc2.imprimirExtrato();
		
		Conta cp = new ContaPoupanca(cliente1);
		
		if(cp.depositar(100)) System.out.println("Depósito realizado com sucesso!");
		
		if(cp.sacar(200)) {
			System.out.println("Saque realizado com sucesso!");
		}else {
			System.out.println("Saldo insuficieente!");
		}
		
		cp.imprimirExtrato();

	}

}
