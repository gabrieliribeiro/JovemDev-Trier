package terceira_aula.exercicio_time;

import javax.swing.JOptionPane;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Iterator;
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
	
	public Jogador getArtilheiro() {
		Jogador artilheiro = listaJogador.get(0);
		for (Jogador jogador : listaJogador) {
			if (jogador.getQuantidadeDeGols() > artilheiro.getQuantidadeDeGols()) {
				artilheiro = jogador;
			}
		}
		return artilheiro;
	}
	
	public String listagemDeJogador() {
		String listagem = "Jogadores do time: ";
		for (Jogador jogador : listaJogador) {
			listagem += jogador;
		}
		return listagem;
	}
	
	public String toString() {
		return "\n|- Time: " + getNomeTime()
				+"\n|- Jogadores:" + listagemDeJogador() +"\n";
	}
}
