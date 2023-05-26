package terceira_aula.teste_livro;

import javax.swing.*;
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

    public static String listagemAutores(List<Autor> autores) {
        Autor autor =  escolhaAutor(autores);
        return autor.listaDeAutores();
     }


    public static Autor escolhaAutor(List<Autor> autores) {
        String menu = "|-- Autores cadastrados --|\n";
        int pos = 1;

        for (Autor autor : autores) {
            menu += pos + " - " + autor.tosString() + "\n";
            pos ++;
        }

        int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
        return autores.get(op-1);

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

    static void cadastraLivro(List<Livro> livros){
        Livro livro = new Livro();
        livro.cadastraLivro();
        livros.add(livro);
        JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
    }

}
