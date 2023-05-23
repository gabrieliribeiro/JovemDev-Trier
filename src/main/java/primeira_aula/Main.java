package primeira_aula;

public class Main {
    
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Gabrieli", 'F', 52.3, 1.59);

        pessoa1.setImc();
        pessoa1.situacaoImc();
        pessoa1.exibeDados();
        
         Pessoa pessoa2 = new Pessoa("Raul", 'M', 85.50, 1.79);

        pessoa2.setImc();
        pessoa2.situacaoImc();
        pessoa2.exibeDados();
        
         Pessoa pessoa3 = new Pessoa("Andreza", 'F', 73.5, 1.61);

        pessoa3.setImc();
        pessoa3.situacaoImc();
        pessoa3.exibeDados();
        
         Pessoa pessoa4 = new Pessoa("Davi", 'M', 112, 1.85);

        pessoa4.setImc();
        pessoa4.situacaoImc();
        pessoa4.exibeDados();

    }
}
