package exercicioFarmacia;

import java.util.ArrayList;
import java.util.List;

public class Farmacia {
	
	List<Produto> produtos = new ArrayList<Produto>();
	List<Cliente> clientes = new ArrayList<Cliente>();
	
	public void addProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void venda(Produto produto, int quantidade, Cliente cliente) {
		produto.vendaBaixaEstoque(quantidade);
		double valorCompra = produto.getValor() * quantidade;
		cliente.crediarioCliente(valorCompra);
	}
	
	public void clienteRealizaPagamento(Cliente cliente, double valorPagamento) {
		cliente.realizaPagamento(valorPagamento);
	}
	
	
	public void clearData() {
		clientes.clear();
		produtos.clear();
	}
}
