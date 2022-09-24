package br.com.fiap.dao;

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
			
			pto = new ProdutoTO();
			pto.setCodigo(2);
			pto.setPreco(56.89);
			pto.setQuantidade(23);
			pto.setTitulo("Planer");
			listaProduto.add(pto);
			
			pto = new ProdutoTO();
			pto.setCodigo(3);
			pto.setPreco(145.90);
			pto.setQuantidade(50);
			pto.setTitulo("Mouse");
			listaProduto.add(pto);
			
			pto = new ProdutoTO();
			pto.setCodigo(4);
			pto.setPreco(75.99);
			pto.setQuantidade(500);
			pto.setTitulo("Teclado");
			listaProduto.add(pto);
			
			pto = new ProdutoTO();
			pto.setCodigo(5);
			pto.setPreco(15.85);
			pto.setQuantidade(1500);
			pto.setTitulo("Clips");
			listaProduto.add(pto);

		}
	}
	
	public List<ProdutoTO> select(){
		return listaProduto;
	}
	
}