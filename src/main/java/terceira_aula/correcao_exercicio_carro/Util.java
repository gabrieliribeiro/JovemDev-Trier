package terceira_aula.correcao_exercicio_carro;

import javax.swing.JOptionPane;

public class Util {
	EnumCor escolheCor() {
		String menu = "Cores disponíveis: \n\n";
		for (EnumCor cor : EnumCor.values()) {
			menu += cor.codigo + " - " + cor.descricao + "\n";
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
		return EnumCor.findById(op);
	}
	
}
