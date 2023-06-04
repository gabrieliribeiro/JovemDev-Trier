package exercicioFarmacia;

import lombok.Getter;

@Getter
public class Produto {
	private String nome;
	protected int estoque;
	protected double valor;
	
	public Produto(String nome, int estoque, double valor) {
		this.nome = nome;
		this.estoque = estoque;
		this.valor = valor;
	}
	
	public boolean vendaBaixaEstoque(int quantidadeInformada) {
		if (getEstoque() >= quantidadeInformada) {
			this.estoque -= quantidadeInformada;
			return true;
		}else {
			return false;
		}
	}
	
}
