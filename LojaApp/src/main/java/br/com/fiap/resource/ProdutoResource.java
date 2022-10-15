package br.com.fiap.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.fiap.bo.ProdutoBO;
import br.com.fiap.to.ProdutoTO;

// O path da página será <endereço>/rest/produto
// Devido ao web.xml já colocar como padrão "/rest" e pode ser mudado
@Path("/produto")
public class ProdutoResource {
	
	//instanciar uma versão do produtoBO
	ProdutoBO pb = new ProdutoBO();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProdutoTO> listarProdutos() {
		return pb.listar();
	}
	
//	@GET //metodo get
//	@Produces(MediaType.TEXT_PLAIN) //texto simples retornado
//	public String buscar() {
//		return "Olá Mundo!";
//	}
}
