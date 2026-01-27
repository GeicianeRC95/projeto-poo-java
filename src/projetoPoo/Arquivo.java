package projetoPoo;

public class Arquivo extends Componente {
	private String conteudo;
	
	public Arquivo (String nome, Diretorio diretorioPai) {
		super (nome, diretorioPai);
		this.conteudo = "";
	}
	@Override
	public void exibir () {
		System.out.println(this.conteudo);
	}
	public void setConteudo (String conteudo) {
		this.conteudo = conteudo;
	}
}
