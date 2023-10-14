package main.java.set.Ordenacao;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class CadastroProdutos {
	// atributo
	Set<Produto> produtoSet;

	public CadastroProdutos() {
		super();
		this.produtoSet = new HashSet<>();
	}

	public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(codigo, nome, preco, quantidade));
	}

	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
		return produtosPorNome;
	}

	public Set<Produto> exibirPorPreco() {
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(produtoSet);
		return produtosPorPreco;
	}

	public static void main(String[] args) {
		CadastroProdutos cadastoProdutos = new CadastroProdutos();

		System.out.println(cadastoProdutos.produtoSet);

		cadastoProdutos.adicionarProduto(1L, "Produto 4", 20d, 10);
		cadastoProdutos.adicionarProduto(2L, "Produto 1", 18d, 5);
		cadastoProdutos.adicionarProduto(3L, "Produto 7", 12d, 1);
		cadastoProdutos.adicionarProduto(5L, "Produto 9", 8d, 19);

		System.out.println(cadastoProdutos.exibirProdutosPorNome());
		System.out.println(cadastoProdutos.exibirPorPreco());

		System.out.println(cadastoProdutos.produtoSet);
	}

}
