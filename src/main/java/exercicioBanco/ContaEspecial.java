package exercicioBanco;

import lombok.Getter;

@Getter
public class ContaEspecial extends Conta{

	private double limiteContratado;
	
	public ContaEspecial(int numeroConta, int agencia, String nomeCorrentista, double saldo, double limiteContratado) {
		super(numeroConta, agencia, nomeCorrentista, saldo);
		this.limiteContratado = limiteContratado;
	}
	
	@Override
	public boolean sacar(double valorSaque) {
		if (getSaldo() + getLimiteContratado() >= valorSaque) {
			saldo = getSaldo() - valorSaque;
			return true;
		}
		return false;
	}

}
