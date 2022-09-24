package br.com.fiap.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.to.ProdutoTO;

public class ProdutoDAO {

	public static List<ProdutoTO> produto;

	public ProdutoDAO() {
		if (produto == null) {
			produto = new ArrayList<ProdutoTO>();
			ProdutoTO pto = new ProdutoTO();
			pto.setCodigo(1);
			pto.setPreco(27.99);
			pto.setQuantidade(10);
			pto.setTitulo("Grampeador");
			produto.add(pto);
			
			pto = new ProdutoTO();
			pto.setCodigo(2);
			pto.setPreco(51.99);
			pto.setQuantidade(2);
			pto.setTitulo("Mouse");
			produto.add(pto);

			pto = new ProdutoTO();
			pto.setCodigo(3);
			pto.setPreco(22.99);
			pto.setQuantidade(7);
			pto.setTitulo("Roteador");
			produto.add(pto);

			pto = new ProdutoTO();
			pto.setCodigo(4);
			pto.setPreco(22.22);
			pto.setQuantidade(17);
			pto.setTitulo("Lapis");
			produto.add(pto);

			pto = new ProdutoTO();
			pto.setCodigo(5);
			pto.setPreco(77.22);
			pto.setQuantidade(11);
			pto.setTitulo("Caneta");
			produto.add(pto);

		}
	}

	public List<ProdutoTO> select() {
		return produto;
	}

}
