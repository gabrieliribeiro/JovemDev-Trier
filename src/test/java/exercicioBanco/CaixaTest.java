package exercicioBanco;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CaixaTest {
	
	private Caixa caixa = new Caixa();
	
	@BeforeEach
	public void init() {
		caixa.getContas().clear();
		caixa.addConta(new Conta(54516, 12, "Correntista 1", 55.20));
		caixa.addConta(new Conta(45742, 12, "Correntista 2", 48.78));
		caixa.addConta(new ContaEspecial(45871, 16, "Correntista Especial 1", 99.12, 500.00));
		caixa.addConta(new ContaUniversitaria(878456, 18, "Correntista Universitário 1", 121.46));
		
	}
	
	@Test
	@DisplayName("Teste deposito")
	void testeDeposita(){
		Conta conta = this.caixa.getContas().get(0);
		caixa.deposita(50.00, conta);
		Assertions.assertEquals(105.20, conta.getSaldo());
	}

	@Test
	@DisplayName("Teste deposito inválido")
	void testeDepositoInvalido(){
		Conta conta = caixa.getContas().get(1);
		double saldoInicial = conta.getSaldo();
		boolean  statusDeposito = caixa.deposita(-1, conta);
		Assertions.assertEquals(saldoInicial, conta.getSaldo());
		Assertions.assertFalse(statusDeposito);
	}

	@Test
	@DisplayName("Teste trasferencia com valor acima do saldo")
	void testeTransferenciaInvalida(){
		Conta contaOrigem = this.caixa.getContas().get(2);
		Conta contaDestino = this.caixa.getContas().get(3);

		boolean statusTrasferencia = caixa.transfere(contaOrigem.getSaldo() + 500.01, contaOrigem, contaDestino);

		Assertions.assertFalse(statusTrasferencia);
	}

	@Test
	@DisplayName("Teste transferencia com valor permitido")
	void testeTransferenciaValida(){
		Conta contaOrigem = this.caixa.getContas().get(0);
		Conta contaDestino = this.caixa.getContas().get(3);

		boolean statusTransferencia = caixa.transfere(contaOrigem.getSaldo(), contaOrigem, contaDestino);
		Assertions.assertTrue(statusTransferencia);
	}

	@Test
	@DisplayName("Teste saca valor não permitido")
	void testeSaqueInvalido(){
		Conta conta = caixa.getContas().get(1);

		boolean statusSaque = caixa.saque(conta.getSaldo()+10.00, conta);
		Assertions.assertFalse(statusSaque);
	}

	@Test
	@DisplayName("Teste saca valor permitido")
	void testeSacaValorPermitido(){
		Conta conta = caixa.getContas().get(3);
		boolean statusSaque = caixa.saque(conta.getSaldo(), conta);
		Assertions.assertTrue(statusSaque);
	}

}
