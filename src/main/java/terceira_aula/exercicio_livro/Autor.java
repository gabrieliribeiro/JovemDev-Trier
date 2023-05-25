package terceira_aula.exercicio_livro;

import javax.swing.JOptionPane;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Autor {
	private String nome;
	private char sexo;
	private int idade;
	
	public void cadastraAutor() {
		setNome(JOptionPane.showInputDialog("Informe o nome do autor: "));
		setSexo((JOptionPane.showInputDialog("Informe o genêro do autor: (F/M)").charAt(0)));
	}
	
	//aqui talves criar uma lista de cadastro, acho que resolve problema de listagem.
	
//	public String listaDeAutores() {
//	String ret = "Autores: ";
//	for (Autor autor : listaAutores) {
//		ret += autor;
//	}
//	return ret;
//}
	
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
