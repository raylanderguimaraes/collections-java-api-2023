package main.java.list.OperacoesBasicas;

public class Item {
	private String nome;
	private double preco;
	private int quantidade;
	
	

	public Item(String nome, double preco, int quantidade) {
	
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getName() {
		return nome;
	}
	public void setName(String name) {
		this.nome = name;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public String toString() {
		return "Item [name=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
	
	
}