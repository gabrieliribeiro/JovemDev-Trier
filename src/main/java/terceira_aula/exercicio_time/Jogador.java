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

	public Jogador() {
		setNome(JOptionPane.showInputDialog("Informe o nome do jogador: "));
		this.numeroCamisa = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da camisa: "));
		this.quantidadeDeGols = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de gols marcado por esse jogador: "));
	}

	public void cadastroJogadores() {
		getNome();
		getNumeroCamisa();
		getQuantidadeDeGols();
	}

}
