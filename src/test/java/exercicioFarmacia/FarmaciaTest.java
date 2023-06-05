package exercicioFarmacia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FarmaciaTest {
	
	Farmacia farmacia = new Farmacia();
	
	@BeforeEach
	void init() {
		farmacia.clearData();
		
		farmacia.addCliente(new Cliente("Cliente 1", 120.56));
		farmacia.addCliente(new Cliente("Cliente 2", 45.89));
		farmacia.addCliente(new Cliente("Cliente 3", 78.56));
		farmacia.addCliente(new Cliente("Cliente 4", 12.46));
		
		farmacia.addProduto(new Medicamentos("Paracetamol", 5, 12.50, false));
		farmacia.addProduto(new Medicamentos("Rivotril", 9, 47.85, true));
		farmacia.addProduto(new Medicamentos("Insulina", 7, 87.89, true));
		farmacia.addProduto(new Medicamentos("Histamim", 10, 45.00, false));
		
		farmacia.addProduto(new Perfumaria("Fantasy - Perfume", 5, 299.90));
		farmacia.addProduto(new Perfumaria("Shakira - Perfume", 2, 199.90));
		farmacia.addProduto(new Perfumaria("Jequity - Perfume", 6, 99.90));
		
		farmacia.addProduto(new EquipamentoMedico("Estetoscópio", 4, 259.90));
		farmacia.addProduto(new EquipamentoMedico("Termometro", 8, 39.90));
		farmacia.addProduto(new EquipamentoMedico("Esparadrapo", 6, 29.99));
		
	}
	
	@Test
	@DisplayName("Testando venda com receita")
	void testeVendaComReceita() {
		Cliente cliente = farmacia.clientes.get(0);
		Medicamentos med = (Medicamentos) farmacia.produtos.get(1);
		farmacia.venda(med, 2, cliente, "Médico");
		Assertions.assertEquals(216.26, cliente.getSaldoDevedor());
	}

	@Test
	@DisplayName("Testando venda sem receita")
	void testeVendaSemReceita(){
		Cliente cliente = this.farmacia.clientes.get(1);
		Produto produto = this.farmacia.produtos.get(0);
		farmacia.venda(produto, 1, cliente, null);
		Assertions.assertEquals(58.39,cliente.getSaldoDevedor());
	}
	
	@Test
	@DisplayName("Testando pagamento")
	void testePagamento() {
		Cliente cliente = farmacia.clientes.get(0);
		farmacia.clienteRealizaPagamento(cliente, 100.00);
		Assertions.assertEquals(20.56,  cliente.getSaldoDevedor(), 0.01);
	}

}
