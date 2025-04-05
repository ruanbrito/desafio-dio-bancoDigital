package com.dio.banco;

import java.util.List;

import com.dio.conta.Conta;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Banco {
	@Getter
	private String nome;
	@Getter
	private List<Conta> contas;

}
