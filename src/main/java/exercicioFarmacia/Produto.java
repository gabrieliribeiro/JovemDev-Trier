package exercicioFarmacia;

import lombok.Getter;

import java.text.DecimalFormat;

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
	
	public boolean vendaBaixaEstoque(Venda venda) {
		this.estoque = getEstoque() - venda.getQuantidade();
		venda.getCliente().crediarioCliente(venda.getQuantidade()*getValor());
		return true;
	}
	
}
