package exercicioFarmacia;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Cliente {
	
	private String nome;
	protected double saldoDevedor;
	
	
	public boolean crediarioCliente(double valorCompra) {
		if (valorCompra > 0) {
			this.saldoDevedor += valorCompra;
			return true;
		}
		return false;
	}
	
	public boolean realizaPagamento(double valorPagamento) {
		if (valorPagamento > 0) {
			this.saldoDevedor -= valorPagamento;
			return true;
		}
		return false;
	}

}
