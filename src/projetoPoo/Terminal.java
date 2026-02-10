package projetoPoo;

import java.util.*;

public class Terminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Diretorio raiz = new Diretorio("/", null);
        GerenciadorDiretorio gd = new GerenciadorDiretorio(raiz);
        GerenciadorArquivo ga = new GerenciadorArquivo();
        List<String> historico = new ArrayList<>();

        GerenciadorComandos gc = new GerenciadorComandos(gd, historico, ga);

        System.out.println("Terminal Linux Simulado iniciado. Digite 'exit' para sair."); 
        
        while (true) {
            System.out.print("user@java-terminal:~$ ");
            String entrada = scanner.nextLine().trim();
            
            if (entrada.equalsIgnoreCase("exit")) {
                ga.guardar(historico); 
                System.out.println("Encerrando programa...");
                break;
            }

            if (!entrada.isEmpty()) {
                historico.add(entrada);
                gc.processar(entrada);
            }
        }
        scanner.close();
    }
}
