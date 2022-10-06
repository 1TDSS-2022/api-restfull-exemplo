package br.com.fiap.bo;

import java.util.List;

import br.com.fiap.dao.ProdutoDAO;
import br.com.fiap.to.ProdutoTO;

public class ProdutoBO {
	private ProdutoDAO pd;

	public List<ProdutoTO> select() {
		pd = new ProdutoDAO();
		return pd.select();
	}
	
	public ProdutoTO select(int id) {
		pd = new ProdutoDAO();
		return pd.select(id);
	}
	
	public boolean cadastrar(ProdutoTO pto) {
		pd = new ProdutoDAO();
		return pd.insert(pto);
	}	
}