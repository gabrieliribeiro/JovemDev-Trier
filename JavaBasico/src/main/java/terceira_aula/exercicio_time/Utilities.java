package terceira_aula.exercicio_time;

import javax.swing.*;
import java.util.List;

public class Utilities {

    static int escolheOpMenu() {
        String menuPrincipal = "|---- Menu Principal ----|"
                + "\n1 - Cadastrar time"
                + "\n2 - Filtrar artilheiro"
                + "\n3 - Filtrar time com mais gols"
                + "\n4 - Sair";
        return Integer.parseInt(JOptionPane.showInputDialog(menuPrincipal));
    }

    static int menuCadastroJogadores(){
        String menuCadastroMaisJogadores = "Deseja realizar mais cadastros de jogadores: "
                + "\n1 - Sim"
                + "\n2 - Não";
        return Integer.parseInt(JOptionPane.showInputDialog(menuCadastroMaisJogadores));
    }
    
    public static void cadastraTime(List<Time> times) {
    	Time time = new Time();
        time.cadastroTime();
        times.add(time);
	}
    
	public static String verificarArtilheiro(List<Time> times) {
		Jogador artilheiro = new Jogador();
		String resposta = "";
		for (Time time : times) {
			artilheiro = time.getArtilheiro();
		}
		resposta = "O artilheiro do campeonato é: " + artilheiro.toString();
		return resposta;
	}

	public static String verificarTimeComMaisGols(List<Time> times) {
		String timeComMaisGols = " ";
		int maxGols = 0;

		for (Time time : times) {
			int totalGols = 0;
			for (Jogador jogador : time.getListaJogador()) {
				totalGols += jogador.getQuantidadeDeGols();
			}
			if (totalGols > maxGols) {
				maxGols = totalGols;
				timeComMaisGols = time.toString();
			}
		}

		return timeComMaisGols;
	}

}
