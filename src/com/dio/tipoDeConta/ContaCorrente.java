package com.dio.tipoDeConta;

import com.dio.cliente.Cliente;
import com.dio.conta.Conta;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("==Extrato Conta Corrente==");
		super.imprimirInfosComuns();
		
	}

}
