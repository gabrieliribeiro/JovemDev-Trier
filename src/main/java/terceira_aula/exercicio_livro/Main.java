package terceira_aula.exercicio_livro;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Autor> autor = new ArrayList<Autor>();
		List<Livro> livro= new ArrayList<Livro>();
		
		int opcao = 0;
		do {
			opcao = Utilities.escolheOpMenu();
			switch (opcao) {
			case 1: 
				System.out.println("hum");
			
			case 7:
				System.out.println("Saindo");
			default:
				System.out.println("Erou");
				break;
			}
		} while (opcao != 7);
	}
}
