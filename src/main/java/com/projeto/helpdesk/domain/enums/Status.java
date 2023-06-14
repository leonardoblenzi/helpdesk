package com.projeto.helpdesk.domain.enums;

public enum Status {

	//vamos definir os valores para não ter problemas em futuras manutençoes
	//(valor, descrição)
	ABERTO(0, "ABERTO"), ANDAMENTO(1, "ANDAMENTO"), ENCERRADO(2, "ENCERRADO");
	
	//atributos
	private Integer codigo;
	private String descricao;
	
	//construtor
	private Status(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public static Status toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		//para cada status x em status
		for(Status x : Status.values()) {
			//se cod for exatamente igual retorna o codigo
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		//se nao for igual a nenhum perfil retorna erro
		throw new IllegalArgumentException("Status inválido");
	}

	public Integer getCodigo() {
		return codigo;
	}


	public String getDescricao() {
		return descricao;
	}


	
}
