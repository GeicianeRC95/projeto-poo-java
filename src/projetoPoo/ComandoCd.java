package projetoPoo;

public class ComandoCd implements Comando {
    private GerenciadorDiretorio gerenciador;

    public ComandoCd(GerenciadorDiretorio gerenciador) {
        this.gerenciador = gerenciador;
    }

    @Override
    public void executar(String[] args) {
        
        if (args.length < 1) return; 

        String destino = args[0];
        Diretorio pastaEmExecucao = gerenciador.getDiretAtual();

        if (destino.equals("..")) {
            if (pastaEmExecucao.diretorioPai != null) {
                gerenciador.setDiretAtual(pastaEmExecucao.diretorioPai);
            }
            return;
        }

        Componente encontrado = null;
        for (Componente item : pastaEmExecucao.getItens()) {
            if (item.getNome().equals(destino)) {
                encontrado = item;
                break;
            }
        }

        if (encontrado == null) {
            System.out.println("-bash: cd: " + destino +: "Arquivo ou diretório inexistente");
        } else if (encontrado instanceof Arquivo) {
            System.out.println("-bash: cd: " + destino + ": Não é um diretório");
        } else {
            gerenciador.setDiretAtual((Diretorio) encontrado);
        }
    }
}
