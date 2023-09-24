package main.java.list.OperacoesBasicas;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
	private List<Item> carrinhoCompra;
	
	public CarrinhoDeCompras() {
		this.carrinhoCompra = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade ) {
		carrinhoCompra.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>(); 
		
		for(Item item : carrinhoCompra) {
			if(item.getName().equalsIgnoreCase(nome)) {
				itensParaRemover.add(item);
			}
		}
		carrinhoCompra.removeAll(itensParaRemover);
		System.out.println("Voce removeu o(s) item(s) " + itensParaRemover + " do carrinho.");
	}
	
	public double calcularValorTotal() {
		
		
		double valorTotal = 0;
		
		for(Item i : carrinhoCompra) {
			double valorItem = i.getPreco() * i.getQuantidade();
			valorTotal+= valorItem;
		}
		return valorTotal;
	}
	
	public void exibirItens() {
		System.out.println(carrinhoCompra);
	}
	
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();
		
		//adiciona itens ao carrinho
		carrinho1.adicionarItem("Playstation 5", 4500.99, 1);
		carrinho1.adicionarItem("Iphone 15", 10000.99, 2);
		carrinho1.adicionarItem("Óculos de Sol", 500.00, 1);
		carrinho1.adicionarItem("Fone de ouvido", 200.00, 1);
		carrinho1.adicionarItem("Iphone 14", 7000.00, 1);
		
		//lista itens no carrinho
		carrinho1.exibirItens();
		
		//remove item especifico do carrinho
		carrinho1.removerItem("Iphone 14");
		
		//exibe o valor total da compra
		System.out.println("Valor total da compra é: " + carrinho1.calcularValorTotal());
		
	}
	
}
