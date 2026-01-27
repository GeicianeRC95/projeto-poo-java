package projetoPoo;

public abstract class Componente {
	protected String nome;
	protected Diretorio diretorioPai;

	public Componente (String nome, Diretorio diretorioPai) {
		this.nome = nome;
		this.diretorioPai = diretorioPai;
		
	}
	public abstract void exibir ();
	
	public String getNome () {
		return nome;
	}
		
	
}
