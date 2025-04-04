package com.dio.banco;

import java.util.List;

import com.dio.conta.Conta;

public class Banco {
	
	private String nome;
	private List<Conta> contas;
	
	public Banco() {}

	public String getNome() {
		return nome;
	}

	public List<Conta> getContas() {
		return contas;
	}
	
	

}
