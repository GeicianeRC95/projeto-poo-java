package projetoPoo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inicialização
        Diretorio raiz = new Diretorio("/", null);
        GerenciadorDiretorio gd = new GerenciadorDiretorio(raiz);
        GerenciadorArquivo ga = new GerenciadorArquivo();
        List<String> historico = new ArrayList<>();

        // Mapeamento de Comandos
        Map<String, Comando> comandos = new HashMap<>();
        comandos.put("ls", new ComandoLs(gd));
        comandos.put("pwd", new ComandoPwd(gd));
        comandos.put("cd", new ComandoCd(gd));
        comandos.put("mkdir", new ComandoMkdir(gd));
        comandos.put("rm", new ComandoRm(gd));
        comandos.put("touch", new ComandoTouch(gd));
        comandos.put("cat", new ComandoCat(gd));
        comandos.put("echo", new ComandoEcho(gd));
        comandos.put("history", new ComandoHistory(historico));

        System.out.println("Terminal Linux Simulado iniciado. Digite 'exit' para sair.");

        while (true) {
            System.out.print("user@java-terminal:~$ ");
            String entrada = scanner.nextLine().trim();
            
            if (entrada.equalsIgnoreCase("exit")) {
                ga.guardar(historico); // Salva usando seu GerenciadorArquivo
                break;
            }

            if (entrada.isEmpty()) continue;
            historico.add(entrada);

            String[] partes = entrada.split(" ");
            String nomeCmd = partes[0];
            String[] argumentos = Arrays.copyOfRange(partes, 1, partes.length);

            Comando cmd = comandos.get(nomeCmd);
            if (cmd != null) {
                cmd.executar(argumentos);
            } else {
                System.out.println(nomeCmd + ": comando não encontrado");
            }
        }
        scanner.close();
    }
}
