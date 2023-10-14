package main.java.set.Pesquisa;

import java.util.Set;
import java.util.HashSet;
public class AgendaContatos {
	//atributo
	private Set<Contato> contatoSet;

	public AgendaContatos() {
		this.contatoSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatosPorNome = new HashSet<>();
		for(Contato c: contatoSet) {
			if(c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
		}
		return contatosPorNome;
	}
	
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		for(Contato c: contatoSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}
	
	
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.exibirContatos();
		
		agendaContatos.adicionarContato("Raylander", 1111111111);
		agendaContatos.adicionarContato("Raylander Guimaraes", 1111111111);
		agendaContatos.adicionarContato("Ray_Prog", 5555555);
		agendaContatos.adicionarContato("Ray", 222222222);
		
		agendaContatos.atualizarNumeroContato("Ray", 333333333);
		
		System.out.println(agendaContatos.pesquisarPorNome("Ray_"));
		
		agendaContatos.exibirContatos();
		
	}
	
	
	
}
