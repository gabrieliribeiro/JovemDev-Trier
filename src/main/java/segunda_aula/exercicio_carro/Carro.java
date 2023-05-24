package segunda_aula.exercicio_carro;

import java.text.DateFormat;
import java.time.LocalDate;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.swing.JOptionPane;

public class Carro {

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
