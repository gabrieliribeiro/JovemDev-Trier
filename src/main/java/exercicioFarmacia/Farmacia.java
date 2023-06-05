package exercicioFarmacia;

import java.util.ArrayList;
import java.util.List;

public class Farmacia {
	
	List<Produto> produtos = new ArrayList<Produto>();
	List<Cliente> clientes = new ArrayList<Cliente>();
	List<Venda> vendas = new ArrayList<Venda>();
	
	public void addProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void venda(Produto produto, int quantidade, Cliente cliente, String medico) {
		Venda vender = new Venda(cliente, produto, quantidade, medico);
		if (produto.vendaBaixaEstoque(vender)){
			vendas.add(vender);
		}
	}


	public List<Venda> vendasPorCliente(Cliente cliente){
		List<Venda> vendasEncontradas = new ArrayList<>();
		for (Venda venda : vendas) {
			if (venda.isCliente(cliente)){
				vendasEncontradas.add(venda);
			}
		}
		return vendasEncontradas;
	}

	
	public void clienteRealizaPagamento(Cliente cliente, double valorPagamento) {
		cliente.realizaPagamento(valorPagamento);
	}
	
	
	public void clearData() {
		clientes.clear();
		produtos.clear();
	}
}
