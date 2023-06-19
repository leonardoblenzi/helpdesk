package com.projeto.helpdesk.domain;

import java.util.ArrayList;
import java.util.List;

public class Tecnico extends Pessoa {
	//composto por uma lista de chamados
	private List<Chamado> chamados = new ArrayList<>();
	
	
	public Tecnico(Integer id, String nome, String cpf, String email, String senha) {
		super(id, nome, cpf, email, senha);
		// TODO Auto-generated constructor stub
	}

	//nao vamos passar a lista de chamados ao instanciar o TECNICO
	public List<Chamado> getChamados() {
		return chamados;
	}

	public void setChamados(List<Chamado> chamados) {
		this.chamados = chamados;
	}
}
