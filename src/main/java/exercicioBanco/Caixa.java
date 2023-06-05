package exercicioBanco;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Caixa {
	
	List<Conta> contas = new ArrayList<Conta>();

	public void addConta(Conta conta) {
		contas.add(conta);
	}
	
	public boolean saque(double valor, Conta conta){
		return conta.sacar(valor);
	}

	public boolean transfere(double valor, Conta contaOrigem, Conta contaDestino){
		return contaOrigem.transferir(valor, contaDestino);
	}

	public boolean deposita(double valor, Conta conta){
		return conta.depositar(valor);
	}

	
}
