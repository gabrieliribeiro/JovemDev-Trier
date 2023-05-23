package segunda_aula.exercicio_carro;

import javax.swing.JOptionPane;

public class Carro {
	//Fazer alteração de váriaveis: Ano -> LocalDate e Cor -> ENUM
	
	private String marca;
	private int inicio, fim;
	private String cor;
	
	public String getMarca() {
		return marca;
	}

	public int getInicio() {
		return inicio;
	}

	public int getFim() {
		return fim;
	}

	public String getCor() {
		return cor;
	}

	public void setMarca(String marca) {
		marca.toUpperCase();
		this.marca = marca;
	}

	public void setInicio(int inicio) {
		this.inicio = inicio;
	}

	public void setFim(int fim) {
		this.fim = fim;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void cadastra() {
		setMarca(JOptionPane.showInputDialog("Informe a marca do carro: "));
		setInicio(Integer.parseInt(JOptionPane.showInputDialog("Informe o período inicial: ")));
		setFim(Integer.parseInt(JOptionPane.showInputDialog("Informe o período final: ")));
		setCor(JOptionPane.showInputDialog("Informe a cor:"));
		
	}
	
	public void periodoFabricacao() {
		int periodoFabricacao;
		periodoFabricacao = getFim()-getInicio();
		JOptionPane.showMessageDialog(null, "Perído de fabricação: " + periodoFabricacao);
		
	}
	
	public void listaPorMarca() {
		JOptionPane.showMessageDialog(null, "Marca: " + getMarca());
	}
	
	public void listaPorCor() {
		JOptionPane.showMessageDialog(null, "Cor: " + getCor());
	}
	
}
