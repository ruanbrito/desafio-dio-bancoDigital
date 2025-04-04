package com.dio.conta;

import com.dio.cliente.Cliente;
import com.dio.exception.Exceptions;
import com.dio.transacoesConta.TransacoesConta;

public abstract class Conta implements TransacoesConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected Integer agencia;
	protected Integer numeroConta;
	protected Double saldo;
	protected Cliente cliente;

	public Conta() {
	}

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void saque(Double valor) {
		try {
			if (!(this.saldo > valor)) {
				saldo -= valor;
			}

		} catch (Exception e) {
			throw new Exceptions(e.getMessage());
		}

	}

	@Override
	public void deposito(Double valor) {
		try {
			this.saldo += valor;
		} catch (Exception e) {
			throw new Exceptions(e.getMessage());
		}

	}

	@Override
	public void transferencia(Double valor, Conta conta) {
		try {
			this.saque(valor);
			conta.deposito(valor);
		} catch (Exception e) {
			throw new Exceptions(e.getMessage());
		}

	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numeroConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

}
