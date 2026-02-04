package projetoPoo;

public class ComandoEcho implements Comando {

    private GerenciadorDiretorio gerenciador;
    private String texto;
    private String nomeArquivo;

    public ComandoEcho(GerenciadorDiretorio gerenciador, String texto, String nomeArquivo) {
        this.gerenciador = gerenciador;
        this.texto = texto;
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public void executar(String[] args) {
        Diretorio pastaEmExecucao = gerenciador.getDiretAtual();

        for (Componente item : pastaEmExecucao.getItens()) {
            if (item instanceof Arquivo && item.getNome().equals(nomeArquivo)) {
                Arquivo arquivo = (Arquivo) item;
                arquivo.setDados(texto); 
                return;
            }
        }

        System.out.println("Arquivo não encontrado.");
    }
}

