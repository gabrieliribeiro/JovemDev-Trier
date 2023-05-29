package terceira_aula.prova_livro;

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

    static void cadastraAutor(List<Autor> autores) {
        Autor autor = new Autor();
        autor.cadastroAutor();
        autores.add(autor);
    }

	public static void pesquisaPorAutor(List<Autor> autores, List<Livro> livros) {
		List<Autor> autorpesquisado = new ArrayList<>();
		String pesquisa = "|-- Selecione um autor --|\n";
		int pos = 1;

		for (Autor autor : autores) {
			pesquisa += pos + " - " + autor.getNome() + "\n";
			pos++;
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(pesquisa));

		String autorLivros = "|-- Livros do autor selecionado --| \n";

		boolean autorEncontrado = false;
		for (Livro livro : livros) {
		    boolean autorLivroEncontrado = false;
		    for (Autor autorLivro : livro.getListaAutores()) {
		        if (autorLivro.equals(autores.get(op - 1))) {
		            autorLivroEncontrado = true;
		            autorEncontrado = true;
		            autorLivros += "\nTítulo: " + livro.getTitulo().toLowerCase() 
		            			+ "\nValor: R$" + livro.getValor()
		            			+"\n---------------";
		        }
		    }
		    if (!autorLivroEncontrado) {
		        autorEncontrado = true;
		    }
		}

		if (!autorEncontrado) {
		    autorLivros = "Nenhum livro encontrado para o autor selecionado!";
		}

		JOptionPane.showMessageDialog(null, autorLivros);
	}

    public static List<Autor> escolhaAutor(List<Autor> autores) {
        List<Autor> autoresSelecionados = new ArrayList<>();
        String autoresDisponiveis = "|-- Autores cadastrados --|\n";
        int pos = 1;

        for (Autor autor : autores) {
            autoresDisponiveis += pos + " - " + autor.toString() + "\n";
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
    	String menu = "|---- Listagem de Livros ----| \n\n";
    	if (livros.isEmpty()) {
    		menu += "Não há livro cadastrado!";
		}else {
			for (Livro livro : livros) {
				menu += livro.toString();
				for (Autor autor : livro.getListaAutores()) {
					menu += autor.toString()
						+"\n---------------";;
				}
			}
		}
    	JOptionPane.showMessageDialog(null, menu);
    }

	static void pesquisaFaixaPreco(List<Livro> livros) {
		double valorMinimo = Double.parseDouble(JOptionPane.showInputDialog(
				"|--- Pesquisa por faixa de preço ---|"
				+"\nInforme o valor mínimo: "));
		double valorMaximo = Double.parseDouble(JOptionPane.showInputDialog(
				"|--- Pesquisa por faixa de preço ---|"
				+"\nInforme o valor máximo: "));

		boolean encontrouLivro = false;
		String resultados = "Livros encontrados na faixa de valor especificada:\n";
		for (Livro livro : livros) {
			if (livro.getValor() >= valorMinimo && livro.getValor() <= valorMaximo) {
				encontrouLivro = true;
				resultados += "\n" + livro.toString();
				for (Autor autor : livro.getListaAutores()) {
					resultados += autor.toString()
								+"\n---------------";;
					
				}
			}
		}

		if (!encontrouLivro) {
			resultados = "Nenhum livro encontrado na faixa de valor especificada.";
		}

		JOptionPane.showMessageDialog(null, resultados);
	}

	static void listarAutorCrianca(List<Livro> livros, List<Autor> autores) {
		String menu = "---- Livros com Autores Crianças ----";
		boolean encontrouLivro = false;
		for (Livro livro : livros) {
			for (Autor autor : livro.getListaAutores()) {
				if (autor.getIdade() <= 12) {
					encontrouLivro = true;
					menu += "\n" +livro.toString();
					for (Autor livroAutor : livro.getListaAutores()) {
						menu += livroAutor.toString()
							+"\n---------------";;
					}
					break;
				}
			}
		}

		if (!encontrouLivro) {
			menu = "Nenhum livro encontrado com autores crianças.";
		}
		
		JOptionPane.showMessageDialog(null, menu);
	}

	static void listaLivrosPorGeneroAutor(List<Livro> livros, List<Autor> autores) {
		String menu = "|--- Lista por gênero ---\n|";
		EnumSexo generoSelecionado = escolheGenero();

		boolean encontrouLivro = false;
		for (Livro livro : livros) {
			boolean todosAutoresDoSexo = true;
			for (Autor autor : livro.getListaAutores()) {
				if (autor.getSexo() != generoSelecionado) {
					todosAutoresDoSexo = false;
					break;
				}
			}
			if (todosAutoresDoSexo) {
				encontrouLivro = true;
				menu += livro.toString();
				for (Autor autor : livro.getListaAutores()) {
					menu += autor.toString()
						+"\n---------------";
				}
			}
		}

		if (!encontrouLivro) {
			menu += "Nenhum livro encontrado com autores do sexo selecionado";
		}
		JOptionPane.showMessageDialog(null, menu);
	}
}
