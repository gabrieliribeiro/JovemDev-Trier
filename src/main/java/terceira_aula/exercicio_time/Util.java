package terceira_aula.exercicio_time;

import java.util.List;

public class Util {
	
	
	static String listaDeJogadores(List<Jogador> jogadores) {
		String retorno = "Jogadores do time %s\n";
		int contador = 0;
		for (Jogador jogador : jogadores) {
			contador++;
		}
		return retorno;
	}
}
