package projetoPoo;

import java.util.List;

public class ComandoHistory implements Comando {

    private List<String> historico;

    public ComandoHistory(List<String> historico) {
        this.historico = historico;
    }

    @Override
    public void executar(String[] args) {
        if (historico.isEmpty()) {
            System.out.println("Nenhum comando no histórico.");
            return;
        }

        int i = 1;
        for (String comando : historico) {
            System.out.println(i + " " + comando);
            i++;
        }
    }
}
