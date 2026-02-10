package projetoPoo;

import java.io.BufferedWriter; 
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GerenciadorArquivo {
    
    public void leituraArquivo(Arquivo arquivo) {
        if (arquivo != null) {
            arquivo.exibir(); 
        }
    }

    public void escreverArquivo(Arquivo arquivo, String texto) {
        if (arquivo != null) {
            arquivo.setDados(texto); 
        }
    }

    public void guardar(List<String> historico) {
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("historico_terminal.txt"))) {
            
            bw.write("+_____HISTÓRICO DE COMANDOS_____+");
            bw.newLine(); 
            
            for (String linha : historico) {
                bw.write(linha);
                bw.newLine();
            }
                     
            System.out.println("Registro salvo com sucesso!");
            
        } catch (IOException excecao) {
            System.err.println("Opa! Algo deu errado no salvamento: " + excecao.getMessage());
        }
    }
}
