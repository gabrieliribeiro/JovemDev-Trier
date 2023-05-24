package terceira_aula.exercicio_time;

import javax.swing.JOptionPane;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Time {
	private String nomeTime;
	private Jogador jogador;
	
	public Time() {
		setNomeTime(JOptionPane.showInputDialog("Informe o nome do time: "));
	}
	
	public void cadastroTime() {
		getNomeTime();
		Util.listaDeJogadores(null);
	}
	
}
