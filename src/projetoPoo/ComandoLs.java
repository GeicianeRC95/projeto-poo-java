package projetoPoo;

public class ComandoLs implements Comando {

    private GerenciadorDiretorio gerenciador;

    public ComandoLs(GerenciadorDiretorio gerenciador) {
        this.gerenciador = gerenciador;
    }

    @Override
    public void executar(String[] args) {
        Diretorio pastaEmExecucao = gerenciador.getDiretAtual();

        if (atual == null) {
            System.out.println("Diretório atual não definido.");
            return;
        }

        pastaEmExecucao.exibir();
    }
}
