package com.projeto.helpdesk.domain.enums;

public enum Prioridade {

	//vamos definir os valores para não ter problemas em futuras manutençoes
	//(valor, descrição)
	BAIXA(0, "BAIXA"), MEDIA(1, "MEDIA"), ALTA(2, "ALTA");
	
	//atributos
	private Integer codigo;
	private String descricao;
	
	//construtor
	private Prioridade(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public static Prioridade toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		//para cada prioridade x em prioridades
		for(Prioridade x : Prioridade.values()) {
			//se cod for exatamente igual retorna o codigo
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		//se nao for igual a nenhum perfil retorna erro
		throw new IllegalArgumentException("Prioridade inválida");
	}

	public Integer getCodigo() {
		return codigo;
	}


	public String getDescricao() {
		return descricao;
	}


	
}
