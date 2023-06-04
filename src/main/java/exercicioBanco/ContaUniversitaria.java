package exercicioBanco;

public class ContaUniversitaria extends Conta{
	
	public ContaUniversitaria(int numeroConta, int agencia, String nomeCorrentista, double saldo) {
		super(numeroConta, agencia, nomeCorrentista, saldo);
		
	}
	
	@Override
	public boolean depositar(double valorDeposito) {
		if (getSaldo() + valorDeposito <= 2000.00) {
			return super.depositar(valorDeposito);
		}
		return false;
	}

}
