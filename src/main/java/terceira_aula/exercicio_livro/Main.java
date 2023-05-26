package terceira_aula.exercicio_livro;

import javax.swing.*;
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
			case 8:
				System.out.println("Saindo");
			default:
				System.out.println("Erou");
				break;
			}
		} while (opcao != 8);
	}
}
