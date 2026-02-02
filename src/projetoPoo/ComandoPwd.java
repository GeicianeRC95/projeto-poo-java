package projetoPoo;

public class ComandoPwd implements Comando {

    private GerenciadorDiretorio gerenciador;

    public ComandoPwd(GerenciadorDiretorio gerenciador) {
        this.gerenciador = gerenciador;
    }

    @Override
    public void executar() {
        Diretorio atual = gerenciador.getDiretAtual();
        System.out.println(mostrarCaminho(atual));
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
