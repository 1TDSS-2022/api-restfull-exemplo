package br.com.fiap.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fiap.bo.ProdutoBO;
import br.com.fiap.to.ProdutoTO;

@Path("/produto")
public class ProdutoResource {
	private ProdutoBO pd = new ProdutoBO();

	
	//GET-ALL
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	
	public List<ProdutoTO> select() {
		return pd.select();
	}


	//GET-ID
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public ProdutoTO select(@PathParam("id") int id) {
		return pd.select(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(ProdutoTO produto, @Context UriInfo uriInfo) {
		
		//GERANDO CODIGO DO PRODUTO
		pd.cadastrar(produto);
		
		
		// CONSTRUIR A URI DE RETORNO
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		
		
		//PARSE E CONCATENANDO O CODIGO DO PRODUTO COM A URL
		builder.path(Integer.toString(produto.getCodigo()));
		
		//Retornando o url e testando a solicitação e realizando o post
		return Response.created(builder.build()).build();
		
	}
	
	
	
}