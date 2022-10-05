package br.com.fiap.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/dados")
public class PessoaResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String [][] listar() {
		
		String[][] nomes = new String[5][3];
		
		nomes[0][0] = "Ale";
		nomes[0][1] = "123456789";
		nomes[0][2] = "profale@fiap.com.br";
		
		nomes[1][0] = "Matheus";
		nomes[1][1] = "33344455566";
		nomes[1][2] = "rm94642@fiap.com.br";
		
		nomes[2][0] = "Rodrigo";
		nomes[2][1] = "121212121212";
		nomes[2][2] = "rodrigo@fiap.com.br";
		
		nomes[3][0] = "lilicarabina";
		nomes[3][1] = "1234567889";
		nomes[3][2] = "lilicarabina@fiap.com.br";
		
		nomes[4][0] = "Giovanna";
		nomes[4][1] = "22233344455";
		nomes[4][2] = "giovanna@fiap.com.br";
		return nomes;
	}
	
	
}
