package segunda_aula.exercicio_carro;

import java.time.LocalDate;
import java.time.Year;
import javax.swing.JOptionPane;

public class Carro {
    
    public enum Cor {
        VERMELHO, BRANCO, PRATA, PRETO
    }

    private String marca;
    private int inicio, fim, ano;
 
    private Cor cor;

    public String getMarca() {
        marca.toUpperCase();
        return marca;
    }

    public int getInicio() {
        return inicio;
    }

    public int getFim() {
        return fim;
    }

    public Cor getCor() {
        return cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    public int getAno() {
        
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCor(Cor cor) {

        this.cor = cor;
    }

	public void cadastra() {
		setMarca(JOptionPane.showInputDialog("Informe a marca do carro: "));
		setAno(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do carro: ")));
		
	}
	
	public void periodoFabricacao() {
		int periodoFabricacao;
		JOptionPane.showMessageDialog(null, "Informe o período que deseja filtrar: ");
		
                                            setInicio(Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro ano: ")));
                                            setFim(Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo ano: ")));
                                            
		if (getAno() >= getInicio() && getAno()<= getFim()) {
			JOptionPane.showMessageDialog(null, "Período de fabricação: " + periodoFabricacao);
		}else {
			JOptionPane.showMessageDialog(null, "Não há carros com esse período de fabricação");
		}
		
	}
	
	public void listaPorMarca() {
		//fazer filtro
		JOptionPane.showMessageDialog(null, "Marca: " + getMarca());
	}
	
	public void listaPorCor() {
		
		// fazer ENUM com as opções e fazer filtro
		JOptionPane.showMessageDialog(null, "Cor: " + getCor());
	}
	
}
