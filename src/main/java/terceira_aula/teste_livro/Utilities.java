package terceira_aula.teste_livro;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Utilities {
    static int escolheOpMenu() {
        String menuPrincipal = "|--------- Menu Principal ---------|"
                + "\n1 - Cadastrar Autor"
                + "\n2 - Cadastrar Livros"
                + "\n3 - Filtrar todos livros cadastrados"
                + "\n4 - Pesquisar por autor"
                + "\n5 - Pesquisar por faixa de valor do livro"
                + "\n6 - Listar todos os livros cujos autores tenham crianças"
                + "\n7 - Listar todos os livros escritos apenas por homens ou mulheres"
                + "\n8 - Sair";

        return Integer.parseInt(JOptionPane.showInputDialog(menuPrincipal));
    }

    static EnumSexo escolheGenero() {
        String menu = "Escolha o gênero do autor: \n";
        for (EnumSexo sexo : EnumSexo.values()) {
            menu += "|- " + sexo.getCodigo() + " - " + sexo.getDescricao() + "\n";
        }
        int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
        return EnumSexo.findById(op);
    }

    static void cadastraAutor(List<Autor> autores) {
        Autor autor = new Autor();
        autor.cadastroAutor();
        autores.add(autor);
    }

    public static StringBuilder listagemAutores(List<Autor> autores) {

        StringBuilder ret = new StringBuilder("Autores: ");

        for (Autor autor : autores) {
            ret.append("\n").append(autor.getNome());
        }

        System.out.println(ret);

        return ret;
    }

    public static List<Autor> escolhaAutor(List<Autor> autores) {
        List<Autor> autoresSelecionados = new ArrayList<>();
        String autoresDisponiveis = "|-- Autores cadastrados --|\n";
        int pos = 1;

        for (Autor autor : autores) {
            autoresDisponiveis += pos + " - " + autor.tosString() + "\n";
            pos++;
        }

        int op = Integer.parseInt(JOptionPane.showInputDialog(autoresDisponiveis));
        
        
        autoresSelecionados.add(autores.get(op - 1));
        JOptionPane.showMessageDialog(null, "Autor adicionado com sucesso!");
       
        
        int novoAutor, contador = 0;

        while (true) {
            if (contador < 3) {
                novoAutor = Integer.parseInt(JOptionPane.showInputDialog(
                		"Deseja cadastrar mais um autor?"
                		+ "\n1 - Sim"
                		+ "\n2 - Não"
                		));
            } else {
                break;
            }

            if (novoAutor != 1) {
                break;
            }

            contador++;

            autoresSelecionados.add(autores.get(Integer.parseInt(JOptionPane.showInputDialog(autoresDisponiveis)) - 1));
        }

        return autoresSelecionados;
    }

    static void cadastraLivro(List<Livro> livros, List<Autor> autores) {
        Livro livro = new Livro();
        livro.cadastraLivro(autores);
        livros.add(livro);
        JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
    }
    
    static void listaLivros(List<Livro> livros, List<Autor> autores) {
    	String menu = "|---- Listagem de Livros ----| \n";
    	if (livros.isEmpty()) {
    		menu += "Não há livro cadastrado!";
		}else {
			for (Livro livro : livros) {
				menu += livro.toString();
				for (Autor autor : livro.getListaAutores()) {
					menu += autor.tosString();
				}
			}
		}
    	JOptionPane.showMessageDialog(null, menu);
    }
}
