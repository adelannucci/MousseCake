package br.com.redhorse.moussecake.entities;

import java.util.List;

public class Categorias {
	
	private String nome;
	private List<Item> itens;
	
	public Categorias(String nome, List<Item> itens) {
		super();
		this.nome = nome;
		this.itens = itens;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	@Override
	public String toString() {
		return nome;
	}	
}
