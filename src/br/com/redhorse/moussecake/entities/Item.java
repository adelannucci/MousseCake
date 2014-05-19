package br.com.redhorse.moussecake.entities;

public class Item {
	
	private String nome;
	private String descricao;
	private double preco;
	
	
	
	public Item(String nome, String descricao, double preco) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Item [nome=" + nome + ", descricao=" + descricao + ", preco="
				+ preco + "]";
	}
	
	

	
}
