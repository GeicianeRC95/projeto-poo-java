package projetoPoo;
import java.util.ArrayList;
import java.util.List;

public class Diretorio extends Componente {
	private List <Componente> itens;
	
	public Diretorio(String nome, Diretorio diretorioPai) {
		super(nome, diretorioPai);
		this.itens = new ArrayList<>();
	}
	@Override
	public void exibir() {
		for(Componente item : itens) {
			System.out.println(item.getNome());
		}
	}
	public void adicionar(Componente componente) {
		this.itens.add(componente);
	}
	public void remover(Componente componente) {
		this.itens.remove(componente);
	}
	public List<Componente> getItens(){
		return itens;
	}
}
