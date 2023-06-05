package exercicioBanco;

import lombok.Getter;

@Getter
public class Conta {
	private int numeroConta;
	private int agencia;
	private String nomeCorrentista;
	protected double saldo;
	
	public Conta(int numeroConta, int agencia, String nomeCorrentista, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = saldo;
	}
	
	
	public boolean depositar(double valorDeposito) {
		if (valorDeposito > 0) {
			this.saldo += valorDeposito;
			return true;
		}
		
		return false;
	}
	
	public boolean sacar(double valorSaque) {

		if (getSaldo() >= valorSaque) {
			this.saldo -= valorSaque;
			return true;
		}else {
			return false;
		}
	}

	public boolean transferir(double valor, Conta destino){
		if (sacar(valor)){
			if (destino.depositar(valor)) {
				return true;
			}else {
				depositar(valor);
				return false;
			}
		}
		return false;
	}

}
