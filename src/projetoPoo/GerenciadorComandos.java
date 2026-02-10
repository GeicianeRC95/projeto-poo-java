package projetoPoo;

import java.util.*;

public class GerenciadorComandos {
    private Map<String, Comando> comandos = new HashMap<>();

    public GerenciadorComandos(GerenciadorDiretorio gd, List<String> historico, GerenciadorArquivo ga) {
        
        comandos.put("ls", new ComandoLs(gd));
        comandos.put("pwd", new ComandoPwd(gd));
        comandos.put("cd", new ComandoCd(gd));
        comandos.put("mkdir", new ComandoMkdir(gd));
        comandos.put("rm", new ComandoRm(gd));
        comandos.put("touch", new ComandoTouch(gd));
        comandos.put("cat", new ComandoCat(gd));
        comandos.put("echo", new ComandoEcho(gd));
        comandos.put("history", new ComandoHistory(historico));
    }

    public void processar(String entrada) {
        if (entrada.isEmpty()) return;

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
}