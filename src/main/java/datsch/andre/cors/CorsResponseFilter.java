package datsch.andre.cors;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.ext.Provider;

@Provider
@PreMatching
public class CorsResponseFilter implements ContainerResponseFilter {
	
	@Override
	public void filter( ContainerRequestContext requestContext, ContainerResponseContext responseContext )
			throws IOException {
			
		responseContext.getHeaders( ).add( "Access-Control-Allow-Origin", "*" );
		responseContext.getHeaders( ).add( "Access-Control-Allow-Methods", "POST, GET, OPTIONS, PUT, DELETE" );
		responseContext.getHeaders( ).add( "Access-Control-Allow-Headers",
				"Origin, X-Requested-With, Content-Type, Authorization, Accept" );
	}
	
}
