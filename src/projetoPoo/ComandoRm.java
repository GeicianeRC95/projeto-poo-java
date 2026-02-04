package projetoPoo;

import java.util.List;

public class ComandoRm implements Comando {
    private GerenciadorDiretorio gerenciador;

    public ComandoRm(GerenciadorDiretorio gerenciador) {
        this.gerenciador = gerenciador;
    }

    @Override
    public void executar(String[] args) {
      
        if (args.length < 1) {
            System.out.println("rm: falta operando");
            return;
        }

        String alvo = args[0];
        Diretorio pastaEmExecucao = gerenciador.getDiretAtual();
        Componente itemParaRemover = null;

        for (Componente item : pastaEmExecucao.getItens()) {
            if (item.getNome().equals(alvo)) {
                itemParaRemover = item;
                break;
            }
        }

        if (itemParaRemover == null) {
            System.out.println("rm: Não foi possível remover '" + alvo + "': Não há arquivo ou diretório");
        } else {
            pastaEmExecucao.remover(itemParaRemover);
        }
    }
}
