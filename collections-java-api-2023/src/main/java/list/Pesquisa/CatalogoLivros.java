package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	private List<Livro> livroList;

	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor){
		List<Livro> livrosPorAutor = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for(Livro livro : livroList) {
				if(livro.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(livro);
				}
			}
		}
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for(Livro livro: livroList) {
				if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal ) {
					livrosPorIntervaloAnos.add(livro);
				}
			}	
		}
		
		return livrosPorIntervaloAnos;
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if(!livroList.isEmpty()) {
			for(Livro livro : livroList) {
				if(livro.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = livro;
					break;
				}
			}
		}
		return livroPorTitulo;
	}
	
	
	
	public static void main(String[] args) {
		
		CatalogoLivros catalogo = new CatalogoLivros();
		
		catalogo.adicionarLivro("Livro 1", "Marcos", 1992);
		catalogo.adicionarLivro("Estruturas de Dados","Marcos", 2000);
		catalogo.adicionarLivro("Entendendo Algoritmos: Um Guia Ilustrado Para Programadores"
				+ " e Outros Curiosos","Aditya Y. Bhargava", 2017);
		
		catalogo.adicionarLivro("O Programador Apaixonado","Chad Fowler", 2014);
		
		System.out.println(	catalogo.pesquisarPorAutor("Marcos"));
		
		System.out.println("Livros pesquisados por intervalo de anos: "+catalogo.pesquisarPorIntervaloAnos(1980, 1993));
		
		System.out.println("Livro pesquisado por titulo: "+catalogo.pesquisarPorTitulo("Estruturas de Dados"));
		
			
	}
		
	
}
