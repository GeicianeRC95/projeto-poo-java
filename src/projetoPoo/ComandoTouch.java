package projetoPoo;

public class ComandoTouch implements Comando{
	private GerenciadorDiretorio gerenciador;
	
	public ComandoTouch(GerenciadorDiretorio gerenciador) {
		this.gerenciador = gerenciador;
	}
	@Override
	public void executar(String[] args) {
		if(args.length < 1) {
			System.out.println("Inválido! É necessário um nome!(Comando Touch)");
			return;
		}
		String nomeArquivo = args[0];
		Diretorio pastaEmExecucao = gerenciador.getDiretAtual();
		Arquivo novoArquivo = new Arquivo(nomeArquivo, pastaEmExecucao);
		pastaEmExecucao.adicionar(novoArquivo);
		System.out.println("Novo arquivo criado: " + nomeArquivo);
	}
}
