package datsch.andre.utils;

import java.net.URL;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

public class IDSRestClient {
	
	public static String URL_BASE = "http://localhost:8080/arquitetura/rest";
	
	public static IDSRestClient getInstance( ) {

		return new IDSRestClient( );
	}

	public Response post( final String url, final Object object ) {
		
		System.out.print( "Url: " );
		System.out.println( url );
		System.out.print( "Json:" );
		if ( object != null ) {
			JSONObject jsonObject = new JSONObject( object );
			System.out.println( jsonObject.toString( ) );
		}
		Response response = null;
		try {
			WebTarget target = ClientBuilder.newClient( ).target( new URL( url ).toURI( ) );
			
			response = target.request( MediaType.APPLICATION_JSON_TYPE )
					.post( Entity.entity( object, "application/json" ) );
					
		} catch ( Exception ex ) {
			throw new RuntimeException( ex );
		}
		//
		return response;
		
	}
	
	public Response put( final String url, final Object object ) {
		
		Response response = null;
		try {
			WebTarget target = ClientBuilder.newClient( ).target( new URL( url ).toURI( ) );
			
			response = target.request( MediaType.APPLICATION_JSON_TYPE )
					.put( Entity.entity( object, "application/json" ) );
					
		} catch ( Exception ex ) {
			throw new RuntimeException( ex );
		}
		
		return response;
		
	}
	
}
