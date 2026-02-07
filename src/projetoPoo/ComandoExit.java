package projetoPoo;

import java.util.List;

public class ComandoExit implements Comando {

    private List<String> historico;
    private GerenciadorArquivo gerenciadorArquivo;

    public ComandoExit(List<String> historico, GerenciadorArquivo gerenciadorArquivo) {
        this.historico = historico;
        this.gerenciadorArquivo = gerenciadorArquivo;
    }

    @Override
    public void executar(String[] args) {
        System.out.println("Saindo do terminal...");

        gerenciadorArquivo.guardar(historico);

        System.exit(0);
    }
}
