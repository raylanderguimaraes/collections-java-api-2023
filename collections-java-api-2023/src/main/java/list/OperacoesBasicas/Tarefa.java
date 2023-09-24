package main.java.list.OperacoesBasicas;
//cria uma classe Tarefa com seu atributo, construtor e metodos getter and setter
public class Tarefa {
	//atributo
	private String descricao;
	
	//cria construtor
	public Tarefa(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return  descricao ;
	}
	
	
	
}
