package projetoPoo;

public class GerenciadorDiretorio {
	private Diretorio diretAtual;
	
	public GerenciadorDiretorio(Diretorio diretOrigem) {
		this.diretAtual = diretOrigem;
	}
	public Diretorio getDiretAtual() {
		return diretAtual;
	}
	public void setDiretAtual(Diretorio diretNovo) {
		this.diretAtual = diretNovo;
	}
}
