package primeira_aula;

public class Main {
	
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Gabrieli", 'F', 52.3, 1.59); 
		
		pessoa1.setImc();
		pessoa1.exibeDados();
		
	}
}
