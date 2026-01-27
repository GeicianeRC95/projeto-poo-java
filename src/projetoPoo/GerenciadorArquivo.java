package projetoPoo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class GerenciadorArquivo {
	public void leituraArquivo(Arquivo arquivo) {
		arquivo.exibir();
	}
	public void guardar(List<String>historico) {
		try(FileWriter fw = new FileWriter("historico_terminal.txt");
		    PrintWriter pw = new PrintWriter(fw)){
			pw
		}
	}
}
