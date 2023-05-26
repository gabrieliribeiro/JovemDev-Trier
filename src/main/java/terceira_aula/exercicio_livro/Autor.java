package terceira_aula.exercicio_livro;

import javax.swing.JOptionPane;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Autor {
	private String nome;
	private EnumSexo sexo;
	private int idade;

	public void cadastraAutor() {
		setNome(JOptionPane.showInputDialog("Informe o nome do autor: "));
		setSexo(Utilities.escolheGenero());
		int op = 0;
		do {
			Utilities.menuCadastroAutores();
		}while(op != 2);
	}


	
	//aqui talves criar uma lista de cadastro, acho que resolve problema de listagem.


//	public String listaDeAutores() {
//	String ret = "Autores: ";
//	for (Autor autor : listaAutores) {
//		ret += autor;
//	}
//	return ret;
//	}
	
	boolean validar() {
		if (getNome().trim().equals("")) {
				JOptionPane.showMessageDialog(null, "O nome deve ser preenchido");
				return false;
			}
			return true;
		}

		public String toString() {
			return "Nome : " + getNome()
					+ "Idade: " + getIdade()
					+ "Genêro: " + getSexo();
		}
}
