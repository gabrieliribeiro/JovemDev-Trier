package terceira_aula.exercicio_livro;

import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

public class Utilities {
	
	static int escolheOpMenu() {
        String menuPrincipal = "|--------- Menu Principal ---------|"
                + "\n1 - Cadastrar Autor"
                + "\n2 - Cadastrar Livros"
                + "\n3 - Filtrar todos livros cadastrados"
                + "\n4 - Filtrar por faixa de preço"
                + "\n5 - Lista de livros com autores crianças"
                + "\n6 - Filtrar livros por genêro do autor"
                + "\n7 - Sair";
        return Integer.parseInt(JOptionPane.showInputDialog(menuPrincipal));
    }
    
	public static Autor escolheAutor(List<Autor> autores) {
		String menu = "Escolha um autor! \n";
		int posicao = 1;
		for (Autor autor : autores) {
			menu += posicao + " - " + autor.getNome() + "\n";
			posicao ++;
		}
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
		return autores.get(opcao-1);
	}
	
	//tem algo de errado!
	public static String listaAutoresLivro(List<Autor> listaAutorLivro) {
		Autor autor = escolheAutor(listaAutorLivro);
		return autor.getNome();
	}
	
	
    public void cadastrarAutor(List<Autor> autores) {
		Autor autor = new Autor();
		autor.cadastraAutor();
		autores.add(autor);
		
	}
    static int menuCadastroAutores(){
        String menuCadastroMaisJogadores = "Deseja incluir mais um autor: "
                + "\n1 - Sim"
                + "\n2 - Não";
        return Integer.parseInt(JOptionPane.showInputDialog(menuCadastroMaisJogadores));
    }
}
