package projetoPoo;

public class Arquivo extends Componente {
	private String dados;
	
	public Arquivo(String nome, Diretorio diretorioPai) {
		super(nome, diretorioPai);
		this.dados = "";
	}
	@Override
	public void exibir() {
		System.out.println(this.dados);
	}
	public String getDados() {
		return this.dados;
	}
	public void setDados(String dados) {
		this.dados = dados;
	}
}
