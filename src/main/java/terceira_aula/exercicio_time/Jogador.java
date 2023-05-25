package terceira_aula.exercicio_time;

import javax.swing.JOptionPane;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Jogador {
	private String nome;
	private int numeroCamisa;
	private int quantidadeDeGols;

	public void cadastraJogador() {
		setNome(JOptionPane.showInputDialog("Informe o nome do jogador: "));
		setNumeroCamisa((Integer.parseInt(JOptionPane.showInputDialog("Informe o número da camisa: "))));
		setQuantidadeDeGols((Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de gols marcado por esse jogador: "))));
	}

	public String toString() {
		return "\n|- Nome: " + getNome()
				+"\n|- Camisa: " + getNumeroCamisa()
				+"\n|- Cor: " + getQuantidadeDeGols()
				+"\n|__________|\n";
	}
}
