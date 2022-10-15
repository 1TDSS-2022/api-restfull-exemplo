package br.com.fiap.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// O path da p�gina ser� <endere�o>/rest/produto
// Devido ao web.xml j� colocar como padr�o "/rest" e pode ser mudado
@Path("/produto")
public class ProdutoResource {
	@GET //metodo get
	@Produces(MediaType.TEXT_PLAIN) //texto retornado
	public String buscar() {
		return "Ola Mundo!";
	}
}
