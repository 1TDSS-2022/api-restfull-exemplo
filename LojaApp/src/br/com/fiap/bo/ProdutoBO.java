package br.com.fiap.bo;

import java.util.List;

import br.com.fiap.dao.ProdutoDAO;
import br.com.fiap.to.ProdutoTO;

public class ProdutoBO {
	
	private ProdutoDAO pd;
	
	public List<ProdutoTO> listar(){
		pd = new ProdutoDAO();
		return pd.select();
	}

	public ProdutoTO listar(int id){
		pd = new ProdutoDAO();
		//REGRAS DE NEG�CIO
		return pd.select(id);
	}

	public boolean cadastrar(ProdutoTO pto) {
		pd = new ProdutoDAO();
		//REGRAS DE NEG�CIO
		return pd.insert(pto);
	}
	
	public void atualizar(ProdutoTO pto) {
		pd = new ProdutoDAO();
		//REGRAS DE NEGOCIO
		pd.update(pto);
	}
	
	public void remover(ProdutoTO pto) {
		pd = new ProdutoDAO();
		//REGRAS DE NEGOCIO
		pd.delete(pto);
	}
	
}
