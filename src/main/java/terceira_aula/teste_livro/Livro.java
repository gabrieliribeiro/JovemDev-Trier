package terceira_aula.teste_livro;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Livro {
    private String titulo;
    private double valor;
    private List<Autor> listaAutores = new ArrayList<Autor>();

    public void cadastraLivro(List<Autor> autores) {
        setTitulo(JOptionPane.showInputDialog("Informe o título do livro: "));
        setValor(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do livro: ")));
        listaAutores.addAll(Utilities.escolhaAutor(autores));
    }
    
    public String toString() {
		return "Título do livro: " + getTitulo() + "\n" 
				+ "Valor: R$" + getValor()+ "\n"
				+ "Autor(es): \n" ;
	}   
}

