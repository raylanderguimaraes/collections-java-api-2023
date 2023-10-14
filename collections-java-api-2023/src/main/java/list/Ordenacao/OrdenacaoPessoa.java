package main.java.list.Ordenacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoPessoa {
	private List<Pessoa> pessoaList;

	public OrdenacaoPessoa() {
		this.pessoaList = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));
	}
	
	public void listarPessoas() {
		System.out.println(pessoaList);
	}
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
		Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
		return pessoaPorAltura;
	}
	
	
	
	
	public static void main(String[] args) {
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
		ordenacaoPessoa.adicionarPessoa("Raylander", 31, 1.76);
		ordenacaoPessoa.adicionarPessoa("Leo", 11, 1.56);
		ordenacaoPessoa.adicionarPessoa("Marcos", 21, 1.90);
		ordenacaoPessoa.adicionarPessoa("Ana", 25, 1.55);
		ordenacaoPessoa.adicionarPessoa("Maria", 27, 1.65);
		
		System.out.println("Ordem normal");
		ordenacaoPessoa.listarPessoas();
		System.out.println("-------------------");
		System.out.println("Ordenado por altura: " + ordenacaoPessoa.ordenarPorAltura());
		System.out.println("-------------------");
		System.out.println("Ordenado por idade: " + ordenacaoPessoa.ordenarPorIdade());
		
	}
	
}
