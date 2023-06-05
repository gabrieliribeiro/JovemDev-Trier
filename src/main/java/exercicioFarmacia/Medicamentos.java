package exercicioFarmacia;

import lombok.Getter;

@Getter
public class Medicamentos extends Produto{
	private boolean precisaReceita;
	
	public Medicamentos(String nome, int estoque, double valor, boolean precisaReceita) {
		super(nome, estoque, valor);
		this.precisaReceita = precisaReceita;
	}

	@Override
	public boolean vendaBaixaEstoque(Venda venda) {
		if (precisaReceita && venda.getMedico()==null){
			return false;
		}else {
			if (getEstoque() >= venda.getQuantidade()) {
				return super.vendaBaixaEstoque(venda);
			}
			return false;
		}
	}
}
