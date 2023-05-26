package terceira_aula.teste_livro;

import javax.swing.*;
import java.util.ArrayList;
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

    //Cadastra autor no menu
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

        int novoAutor, contador = 0;

        while (true) {
            if (contador < 3) {
                novoAutor = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar mais um autor?\n1 - Sim\n2 - Não"));
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


    //    static List<Autor> escolheAutor(List<Autor> autores){
//
//        String menu = "Autores cadastrados: \n";
//        for (int i = 0; i < autores.size(); i++) {
//            Autor autor = autores.get(i);
//            menu += (i + 1) + autor.tosString();
//        }
//        boolean adicionandoAutores = true;
//
//        while (adicionandoAutores) {
//            String opcaoStr = JOptionPane.showInputDialog(null,
//                    menu + "Digite o número do autor desejado (ou 0 para finalizar):");
//
//            try {
//                int opcao = Integer.parseInt(opcaoStr);
//
//                if (opcao == 0) {
//                    adicionandoAutores = false;
//                } else if (opcao > 0 && opcao <= autores.size()) {
//                    autores.add(autores.get(opcao - 1));
//                    JOptionPane.showMessageDialog(null, "Autor adicionado com sucesso!");
//                } else {
//                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
//                }
//            } catch (NumberFormatException e) {
//                JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
//            }
//        }
//
//        return autoresLivro;
//    }

    static void cadastraLivro(List<Livro> livros, List<Autor> autores) {
        Livro livro = new Livro();
        livro.cadastraLivro(autores);
        livros.add(livro);
        JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
    }

}
