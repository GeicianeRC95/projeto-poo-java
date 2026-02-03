package projetoPoo;

public class ComandoCat implements Comando {
	GerenciadorDiretorio gerenciador;
	
	public ComandoCat(GerenciadorDiretorio gerenciador) {
		this.gerenciador = gerenciador;
	}
	@Override
	public void executar(String[] args) {
		if(args.length < 1) {
			System.out.println("Inválido! É necessário informar o nome do arquivo! (Comando Cat) ");
            return;
		}
		String nomeProcurado = args[0];
		Diretorio pastaEmExecucao = gerenciador.getDiretAtual();
		boolean encontrou = false;
		for(Componente item : pastaEmExecucao.getItens()) {
			if(item.getNome().equals(nomeProcurado) && item instanceof Arquivo) {
				Arquivo arquivo = (Arquivo) item;
				System.out.println(arquivo.getDados());
				encontrou = true;
				break;
			}
		}
		if(!encontrou) {
			System.out.println("Cat: " + nomeProcurado + "=> Arquivo não encontrado.");
		}
	}
}
