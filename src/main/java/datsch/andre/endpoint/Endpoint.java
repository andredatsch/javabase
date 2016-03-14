package datsch.andre.endpoint;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import datsch.andre.beans.Filtro;
import datsch.andre.service.Service;

/**
 * Implementa��o do Endpoint base
 *
 * @author Andre
 */
@Path( "/endpoint" )
@Produces( "application/json" )
@Consumes( "application/json" )
public class Endpoint {
	
	/**
	 * Inje��o de dependencia do service
	 */
	@EJB
	private Service service;
	
	@POST
	@Path( "/teste" )
	@Consumes( "application/json; charset=UTF-8" )
	@Produces( "application/json; charset=UTF-8" )
	public Response teste( Filtro filtro ) {
		
		System.out.println( filtro.getFiltro( ) );

		return Response.ok( filtro ).build( );
		
	}
	
}