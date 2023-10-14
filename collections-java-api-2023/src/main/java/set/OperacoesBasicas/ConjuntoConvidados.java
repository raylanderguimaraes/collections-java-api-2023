package main.java.set.OperacoesBasicas;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {
	//atributo
	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}
	
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for(Convidado c : convidadoSet) {
			if(c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
		} 
		convidadoSet.remove(convidadoParaRemover);
	}
	
	public int contarConvidados() {
		return convidadoSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
	
	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
		
		conjuntoConvidados.adicionarConvidado("Convidado 1", 12345);
		conjuntoConvidados.adicionarConvidado("Convidado 2", 12346);
		conjuntoConvidados.adicionarConvidado("Convidado 3", 12346);
		conjuntoConvidados.adicionarConvidado("Convidado 4", 12349);
		
		
		conjuntoConvidados.removerConvidadoPorCodigoConvite(12346);
		
		conjuntoConvidados.exibirConvidados();
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
	}
	
}
