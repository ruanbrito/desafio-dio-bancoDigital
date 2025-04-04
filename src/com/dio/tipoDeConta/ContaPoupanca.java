package com.dio.tipoDeConta;

import com.dio.cliente.Cliente;
import com.dio.conta.Conta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("==Extrato Conta Poupança==");
		super.imprimirInfosComuns();

	}

}
