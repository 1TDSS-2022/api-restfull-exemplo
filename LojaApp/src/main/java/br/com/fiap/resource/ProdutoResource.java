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
	
	ProdutoBO pb = new ProdutoBO();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProdutoTO> listaProdutos(){
		return pb.listar();
	}
	
	//GET-ID
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public ProdutoTO listaProdutos(@PathParam("id")int id) {
		return pb.listar(id);
	}
	
	//Cadastrar produto
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(ProdutoTO produto, @Context UriInfo uriInfo) {
		
		//Gerando o codigo do produto
		pb.cadastrar(produto);
		
		//Construir a uri de retorno
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		
		//Parseando e concatenando o codigo do produto com a url
		builder.path(Integer.toString(produto.getCodigo()));
		
		//Retornando a url e testando a solicitação e realizando o post.
		return Response.created(builder.build()).build();
		
	}
	 

}
