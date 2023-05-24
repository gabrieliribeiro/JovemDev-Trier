package segunda_aula.exercicio_carro;

import javax.swing.JOptionPane;
import java.util.List;

public class Utilities {

	static int escolheOpMenu() {
		String menuPrincipal = "|---- Menu Principal ----|"
				+ "\n1 - Cadastrar carro"
				+ "\n2 - Listar carros por fabricação"
				+ "\n3 - Listar carros por marca"
				+ "\n4 - Listar carros por cor"
				+ "\n5 - Sair";
		return Integer.parseInt(JOptionPane.showInputDialog(menuPrincipal));
	}

	static EnumCor escolheCor() {
		String menu = "|---- Cores disponíveis ----|\n";
		for (EnumCor cor : EnumCor.values()) {
			menu += "|- " + cor.getCodigo() + " - " + cor.getDescricao() + "\n";
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
		return EnumCor.findById(op);
	}

	static double percentualDeCarros(List<Carro> carros, int quantidade){
		return (double)quantidade / (double)(carros.size()) * 100;
	}

	static String listagemFabricacao(List<Carro> carros){
		JOptionPane.showMessageDialog(null, "Informe o período que deseja filtrar! ");
		int inicio = (Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro ano: ")));
		int fim = (Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo ano: ")));

		String resposta = "Listagem de carros fabricados entre: "+ inicio +" e "+ fim +"\n";
		int contador = 0;
		for (Carro carro : carros) {
			if (carro.isPeriodoFabricacao(inicio, fim)) {
				resposta += carro.toString();
				contador++;
			}
		}
		resposta += "Representa "+ percentualDeCarros(carros, contador)+"% dos carros";
		return resposta;
	}

	static String listaDeMarca(List<Carro> carros){
		String marca = JOptionPane.showInputDialog("Informe a marca a ser pesquisada: ");
		String resposta = "Listagem de carros da marca: " + marca.toUpperCase();

		int contador = 0;

		for (Carro carro: carros) {
			if (carro.isMarca(marca)) {
				resposta += carro.toString();
				contador++;
			}
		}
		resposta += "Representa "+ percentualDeCarros(carros, contador)+"% dos carros";
		return resposta;
	}

	static String listagemPorCor(List<Carro> carros){
		JOptionPane.showMessageDialog(null, "Informe a cor a ser pesquisada!");
		EnumCor cor = escolheCor();
		String resposta = "Listagem de carros pela cor: " + cor.getDescricao();

		int contador = 0;

		for (Carro carro: carros) {
			if (carro.isCor(cor)) {
				resposta += carro.toString();
				contador++;
			}
		}
		resposta += "Representa "+ percentualDeCarros(carros, contador)+"% dos carros";
		return resposta;
	}

}
