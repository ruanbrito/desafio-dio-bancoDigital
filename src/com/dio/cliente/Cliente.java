package com.dio.cliente;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
//@AllArgsConstructor
public class Cliente {
	@Getter	@Setter
	private String nome;
	@Getter	@Setter
	private String email;
	@Getter	@Setter
	private String cpf;

}
