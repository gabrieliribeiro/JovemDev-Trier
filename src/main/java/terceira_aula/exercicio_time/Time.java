package terceira_aula.exercicio_time;

import javax.swing.JOptionPane;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Time {
	private String nomeTime;
	List<Jogador> listaJogador = new ArrayList<Jogador>();
	
	public void cadastroTime() {
		setNomeTime(JOptionPane.showInputDialog("Informe o nome do time: "));
		cadastrarJogador();
	}
	public void cadastrarJogador() {
		Jogador jogador = new Jogador();
		jogador.cadastraJogador();
		listaJogador.add(jogador);
	}



}
