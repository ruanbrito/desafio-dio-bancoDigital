package com.dio.transacoesConta;

import com.dio.conta.Conta;

public interface TransacoesConta {
	
	void saque(Double valor);
	void deposito(Double valor);
	void transferencia(Double valor, Conta conta);
	void imprimirExtrato();

}
