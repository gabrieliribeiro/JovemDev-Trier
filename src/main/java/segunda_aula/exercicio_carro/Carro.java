package segunda_aula.exercicio_carro;

import java.time.LocalDate;
import java.time.Year;
import javax.swing.JOptionPane;

public class Carro {
<<<<<<< HEAD
    
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
=======

	private String marca;
	private int ano;
	EnumCor cor;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public EnumCor getCor() {
		return cor;
	}

	public void setCor(EnumCor cor) {
		this.cor = cor;
	}

	public void cadastra() {
		setMarca(JOptionPane.showInputDialog("Informe a marca do carro: "));
		setAno(Integer.parseInt(JOptionPane.showInputDialog("Informe o : ")));
		
		if (!validar()) {
			cadastra();
>>>>>>> b745b925995fa0eb116bab497e3ba0ffed965b03
		}

	}

	public boolean validar() {
		if (marca.trim().equals("")) {
			JOptionPane.showMessageDialog(null, "A marca deve ser preenchida");
			return false;
		}
		if (ano < 0 || ano > 2023) {
			JOptionPane.showMessageDialog(null, "Ano inválido");
			return false;
		}
		if (cor == null) {
			JOptionPane.showMessageDialog(null, "A cor é inválida");
			return false;
		}
		return true;
	}

	public boolean isPeriodoFabricacao(int anoInicial, int anoFinal) {
		return this.ano >= anoInicial && this.ano <= anoFinal;
	}

	public boolean isMarca(String buscaMarca) {
		return buscaMarca.equalsIgnoreCase(this.marca);
	}

	public boolean isCor(EnumCor buscaCor) {
		return buscaCor == this.cor;
	}
}
