package terceira_aula.prova_livro;

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
    
    boolean validaDados(){
        if(getValor() <= 0) {
        	JOptionPane.showMessageDialog(null, "O valor do livro não pode ser menor ou igual a ZERO!");
            return true;
        }
        return false;
    }
    
    public String toString() {
		return "--------------- \n"
				+ "Título do livro: " + getTitulo().toLowerCase() + "\n" 
				+ "Valor: R$" + getValor()+ "\n"
				+ "Autor(es): \n" ;
	}   
}

