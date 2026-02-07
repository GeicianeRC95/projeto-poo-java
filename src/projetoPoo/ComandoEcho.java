package projetoPoo;

public class ComandoEcho implements Comando {
    private GerenciadorDiretorio gerenciador;

    public ComandoEcho(GerenciadorDiretorio gerenciador) {
        this.gerenciador = gerenciador;
    }

    @Override
    public void executar(String[] args) {
        // Formato esperado: echo texto > nome_arquivo
        if (args.length < 3 || !args[args.length - 2].equals(">")) {
            System.out.println("Uso: echo <texto> > <arquivo>");
            return;
        }

        String nomeArquivo = args[args.length - 1];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < args.length - 2; i++) {
            sb.append(args[i]).append(" ");
        }
        
        String textoParaGravar = sb.toString().trim();
        Diretorio atual = gerenciador.getDiretAtual();

        // Busca o arquivo ou cria se não existir
        Arquivo arquivoAlvo = null;
        for (Componente item : atual.getItens()) {
            if (item instanceof Arquivo && item.getNome().equals(nomeArquivo)) {
                arquivoAlvo = (Arquivo) item;
                break;
            }
        }

        if (arquivoAlvo == null) {
            arquivoAlvo = new Arquivo(nomeArquivo, atual);
            atual.adicionar(arquivoAlvo);
        }

        // Usa o método setDados que você definiu em Arquivo.java
        arquivoAlvo.setDados(textoParaGravar);
    }
}
