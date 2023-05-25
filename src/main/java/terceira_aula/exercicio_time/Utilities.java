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

	public static String verificarArtilheiro(List<Time> times) {
		String artilheiro = "";
		String resposta = "";
		int maxGols = 0;
		for (Time time : times) {
			for (Jogador jogador : time.getListaJogador()) {
				if (jogador.getQuantidadeDeGols() > maxGols) {
					maxGols = jogador.getQuantidadeDeGols();
					artilheiro = jogador.getNome();
				}
			}
		}
		resposta = "O artilheiro do campeonato é: " + artilheiro;
		return resposta;
	}
//
//	public static Time verificarTimeComMaisGols(List<Time> times) {
//		Time timeComMaisGols = null;
//		int maxGols = 0;
//
//		for (Time time : times) {
//			int totalGols = 0;
//			for (Jogador jogador : time.getJogadores()) {
//				totalGols += jogador.getQuantidadeDeGols();
//			}
//			if (totalGols > maxGols) {
//				maxGols = totalGols;
//				timeComMaisGols = time;
//			}
//		}
//
//		return timeComMaisGols;
//	}
//
}
