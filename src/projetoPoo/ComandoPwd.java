package projetoPoo;

public class ComandoPwd implements Comando {

    private GerenciadorDiretorio gerenciador;

    public ComandoPwd(GerenciadorDiretorio gerenciador) {
        this.gerenciador = gerenciador;
    }

    @Override
    public void executar(String[] args) {
        Diretorio pastaEmExecucao = gerenciador.getDiretAtual();
        System.out.println(mostrarCaminho(pastaEmExecucao));
    }

    private String mostrarCaminho(Componente componente) {
        if (componente == null) {
            return "";
        }

        if (componente.diretorioPai == null) {
            return "/" + componente.getNome();
        }

        return mostrarCaminho(componente.diretorioPai) + "/" + componente.getNome();
    }
}
