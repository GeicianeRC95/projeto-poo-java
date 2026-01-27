package projetoPoo;
import java.util.ArrayList;
import java.util.List;

public class Diretorio extends Componente {
	private List <Componente> itens;
	
	public Diretorio (String nome, Diretorio diretorioPai) {
		super (nome, diretorioPai);
		this.itens = new ArrayList<>();
	}
}
