package br.com.fiap.resource;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/dados")
public class PessoaResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String[][] listar(){
		
		String[][] nomes = new String[5][3];
		
		nomes[0][0] = "Luan";
		nomes[0][1] = "405.544.555-00";
		nomes[0][2] = "luan@portoseguro.com.br";
		
		nomes[1][0] = "teste";
		nomes[1][1] = "405.544.555-00";
		nomes[1][2] = "luan@portoseguro.com.br";
		
		nomes[2][0] = "ggggggggg";
		nomes[2][1] = "405.544.555-00";
		nomes[2][2] = "luan@portoseguro.com.br";
		
		nomes[3][0] = "dsadad";
		nomes[3][1] = "405.544.555-00";
		nomes[3][2] = "luan@portoseguro.com.br";
		
		nomes[4][0] = "dsadad";
		nomes[4][1] = "405.544.555-00";
		nomes[4][2] = "luan@portoseguro.com.br";
		
		
		return nomes;
		
		
	}
	

}
