package segunda_aula.exercicio_carro;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {
	
	static List<Carro> carros =  new ArrayList<Carro>();
	
	public static void main(String[] args) {
		String menu = 
				"1 - Cadastrar Carro"
				+ "\n2 - Listar os carros por período de fabricação"
				+ "\n3 - Listar carros por marca"
				+ "\n4 - Listar carros por cor"
				+ "\n5 - Sair";
		
		int op = 0;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if (op == 1) {
				Carro c = new Carro();
				c.cadastra();
				carros.add(c);
			}else if (op == 2) {
				Carro periodo = new Carro();
				periodo.periodoFabricacao();
				carros.add(periodo);
				
			}else if (op == 3) {
				for (Carro marca : carros) {
					marca.listaPorMarca();
				}
				
			}else if (op == 4) {
				for (Carro cor : carros) {
					cor.listaPorCor();
				}
			}
			
		}while(op !=5);
	}
}
