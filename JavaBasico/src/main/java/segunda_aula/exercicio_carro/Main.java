package segunda_aula.exercicio_carro;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {
	static List<Carro> listaDeCarros =  new ArrayList<Carro>();
	public static void main(String[] args) {
		int opcao = 0;

		do {
			opcao = Utilities.escolheOpMenu();
			switch (opcao){
				case 1:
					Carro carro = new Carro();
					carro.cadastra();
					listaDeCarros.add(carro);
					break;
				case 2:
					JOptionPane.showMessageDialog(null, Utilities.listagemFabricacao(listaDeCarros));
					break;
				case 3:
					JOptionPane.showMessageDialog(null, Utilities.listaDeMarca(listaDeCarros));
					break;
				case 4:
					JOptionPane.showMessageDialog(null, Utilities.listagemPorCor(listaDeCarros));
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "Saindo...");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
		}while (opcao!=5);
	}
}
