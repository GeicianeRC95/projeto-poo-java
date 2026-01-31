package projetoPoo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
		try (FileWriter fw = new FileWriter("historico_terminal.txt"); PrintWriter pw = new PrintWriter(fw)) {
			pw.println("+_____HISTÓRICO DE COMANDOS_____+");
			for (String linha : historico) {
				pw.println(linha);
			}
			System.out.println("Tudo certo! Registro salvo com sucesso.");
		} catch (IOException excecao) {
			System.err.println("Opa! Algo deu errado: " + excecao.getMessage());
		}
	}
}
