package com.projeto.helpdesk.domain.enums;

public enum Perfil {

	//vamos definir os valores para não ter problemas em futuras manutençoes
	//(valor, descrição)
	ADMIN(0, "ROLE_ADMIN"), CLIENTE(1, "ROLE_CLIENTE"), TECNICO(2, "ROLE_TECNICO");
	
	//atributos
	private Integer codigo;
	private String descricao;
	
	//construtor
	private Perfil(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public static Perfil toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		//para cada perfil x em perfis
		for(Perfil x : Perfil.values()) {
			//se cod for exatamente igual retorna o codigo
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		//se nao for igual a nenhum perfil retorna erro
		throw new IllegalArgumentException("Perfil inválido");
	}

	public Integer getCodigo() {
		return codigo;
	}


	public String getDescricao() {
		return descricao;
	}


	
}
