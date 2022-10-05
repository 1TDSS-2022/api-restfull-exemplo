package br.com.fiap.dao;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.to.ProdutoTO;

public class ProdutoDAO {

	public static List<ProdutoTO> listaProduto;

	public ProdutoDAO() {
		if (listaProduto == null) {
			listaProduto = new ArrayList<ProdutoTO>();
			ProdutoTO pto = new ProdutoTO();
			pto.setCodigo(1);
			pto.setPreco(27.99);
			pto.setQuantidade(10);
			pto.setTitulo("Grampeador");
			listaProduto.add(pto);

			pto.setCodigo(2);
			pto.setPreco(56.59);
			pto.setQuantidade(23);
			pto.setTitulo("Mouse");
			listaProduto.add(pto);

			pto.setCodigo(3);
			pto.setPreco(145.00);
			pto.setQuantidade(25);
			pto.setTitulo("Planner");
			listaProduto.add(pto);

			pto.setCodigo(4);
			pto.setPreco(75.00);
			pto.setQuantidade(500);
			pto.setTitulo("Teclado");
			listaProduto.add(pto);

			pto.setCodigo(5);
			pto.setPreco(15.00);
			pto.setQuantidade(1500);
			pto.setTitulo("Clips");
			listaProduto.add(pto);
		}
	}

	// GET-ALL
	public List<ProdutoTO> select() {
		return listaProduto;
	}

	// GET-ID
	public ProdutoTO select(int id) {
		for (int i = 0; i < listaProduto.size(); i++) {
			if(listaProduto.get(i).getCodigo() == id) {
				return listaProduto.get(i);
			}
		}
		return null;
	}
	
	public boolean insert(ProdutoTO pto) {
		
		//Gerando o codigo do produto
		pto.setCodigo(listaProduto.size() + 1);
		
		//Inserindo o rpduto na base e recebendo um true ou false
		return listaProduto.add(pto);
	}

}
