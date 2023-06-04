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
	public boolean vendaBaixaEstoque(int quantidadeInformada) {
		
		return super.vendaBaixaEstoque(quantidadeInformada);
	}
	
	public boolean verificaTemReceita() {
		if (precisaReceita == true) {
			return true;
		}
		return false;
	}
	
	public boolean vendaMedicamento(String nomeMedico) {
		if (verificaTemReceita()) {
			return true;
		}
		return false;
	}
}
