package terceira_aula.prova_livro;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Autor> autores = new ArrayList<>();
        List<Livro> livros = new ArrayList<>();

        int opcao = 0;
        do{
            opcao = Utilities.escolheOpMenu();

            switch (opcao) {
                case 1:
                    Utilities.cadastraAutor(autores);
                    break;
                case 2:
                    Utilities.cadastraLivro(livros, autores);
                    break;
                case 3:
                    Utilities.listaLivros(livros, autores);
                    break;
                case 4:
                    Utilities.pesquisaPorAutor(autores, livros);
                    break;
                case 5:
                	Utilities.pesquisaFaixaPreco(livros);
                	break;
                case 6:
                	Utilities.listarAutorCrianca(livros, autores);
                	break;
                case 7:
                	Utilities.listaLivrosPorGeneroAutor(livros, autores);
                	break;
                case 8:
                    JOptionPane.showMessageDialog(null,"Saindo...");
                    break;
                default:
                    System.out.println("Inválido!!");
                    break;
            }
        } while(opcao !=8);
    }

}

