package terceira_aula.exercicio_livro;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Livro {
	private String titulo;
	private double valor;
	private List<Autor> listaAutores = new ArrayList<Autor>();
	
	public void cadastroLivro() {
		setTitulo(JOptionPane.showInputDialog("Informe o título do livro: "));
		setValor(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do livro: ")));
		Utilities.escolheAutor(listaAutores);
		
	}
	
}