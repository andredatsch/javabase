package datsch.andre.endpoint;

import javax.ws.rs.core.Response;

import org.junit.Assert;
import org.junit.Test;

import datsch.andre.beans.Filtro;
import datsch.andre.utils.IDSRestClient;

public class EndpointTest {

	@Test
	public void test( ) {

		Filtro filtro = new Filtro( );
		filtro.setId( 1 );
		filtro.setFiltro( "Teste" );
		Response post = IDSRestClient.getInstance( ).post( IDSRestClient.URL_BASE.concat( "/endpoint/teste" ), filtro );

		Filtro filtroRetorno = post.readEntity( Filtro.class );

		Assert.assertEquals( 1, filtroRetorno.getId( ).intValue( ) );
	}

}
