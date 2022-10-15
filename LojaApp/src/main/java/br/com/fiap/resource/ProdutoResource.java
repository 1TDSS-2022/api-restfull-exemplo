package br.com.fiap.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// O path da página será <endereço>/rest/produto
// Devido ao web.xml já colocar como padrão "/rest" e pode ser mudado
@Path("/produto")
public class ProdutoResource {
	@GET //metodo get
	@Produces(MediaType.TEXT_PLAIN) //texto retornado
	public String buscar() {
		return "Ola Mundo!";
	}
}
