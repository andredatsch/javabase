package datsch.andre.beans;

import java.io.Serializable;

/**
 * Classe de exemplo para demonstrar os parametros
 * Obrigatorio implementar o Serializable
 * 
 * @author Andre Datsch
 */
public class Filtro implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 6217762939066331941L;
	
	private Integer id;

	private String filtro;
	
	public Integer getId( ) {
		
		return id;
	}
	
	public void setId( Integer id ) {
		
		this.id = id;
	}
	
	public String getFiltro( ) {
		
		return filtro;
	}
	
	public void setFiltro( String filtro ) {
		
		this.filtro = filtro;
	}
	
}
