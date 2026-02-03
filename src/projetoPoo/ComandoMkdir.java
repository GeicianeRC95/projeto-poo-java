package projetoPoo;

public class ComandoMkdir implements Comando {
	private GerenciadorDiretorio gerenciador;

	public ComandoMkdir(GerenciadorDiretorio gerenciador) {
		this.gerenciador = gerenciador;
	}

	@Override
	public void executar(String[]args) {
		if(args.length < 1) {
			System.out.println("Inválido! É necessário um nome!(Comando Mkdir)");
			return;
		}
		String nomePasta = args[0];
		Diretorio pastaEmExecucao = gerenciador.getDiretAtual();
		Diretorio novaPasta = new Diretorio(nomePasta, pastaEmExecucao);
		pastaEmExecucao.adicionar(novaPasta);
		System.out.println("Novo diretório criado: " + nomePasta);
	}
}
