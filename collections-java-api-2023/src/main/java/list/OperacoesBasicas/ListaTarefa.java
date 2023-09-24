package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	//atributo da lista de tarefa ela recebe uma List com generic recebendo a classe Tarefa
	
	private List<Tarefa> tarefaList;
	
	//construtor da Lista de Tarefas, que será um ArrayList
	
	public ListaTarefa() {
		
		this.tarefaList = new ArrayList<>();
	}

	
	//metodo para adicionar nova tarefa
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	
	//metodo para remover tarefa, esse metodo cria uma lista de tarefas a serem removidas
	//de acordo com a descricao passada como argumento ele compara a descricao percorrendo
	//o tarefaList e compara se a descricao da tarefa t se for igual ele adiciona essa tarefa t
	// a List tarefasParaRemover.
	// depois disso utilizando o metodo removeAll() ele remove tarefasParaRemover de tarefasList
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for(Tarefa t: tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)){
				tarefasParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	// metodo para retornar o tamanho ou quantidade de tarefas na tarefaList utilizando meotodo
	//size()
	
	public int obterNumeroTotalDeTarefas() {
		return tarefaList.size();
	}
	
	//metodo que imprime a lista de tarefas tarefaList
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
	
	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());
		
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 2");
		listaTarefa.adicionarTarefa("Tarefa 3");
		
		listaTarefa.removerTarefa("Tarefa 2");
		System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());
		
		listaTarefa.obterDescricoesTarefas();
	}
}
