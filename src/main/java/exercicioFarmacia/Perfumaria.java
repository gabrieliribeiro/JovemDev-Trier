package exercicioFarmacia;

public class Perfumaria extends Produto{

	public Perfumaria(String nome, int estoque, double valor) {
		super(nome, estoque, valor);
	}

	@Override
	public boolean vendaBaixaEstoque(Venda venda) {
		if (getEstoque() >= venda.getQuantidade() && venda.getCliente().getSaldoDevedor() < 300){
			return super.vendaBaixaEstoque(venda);
		}
		return false;
	}
}
