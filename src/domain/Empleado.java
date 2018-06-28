package domain;

public class Empleado extends Usuario 
{
	//constructores
	
	
	public Empleado() 
	{
		super();
	
	}

	public Empleado(Integer idUsuarioRecib, String usuarioRecib, String passwordRecib) 
	{
		super(idUsuarioRecib, usuarioRecib, passwordRecib);	
	}

	// metodos
	
	
	public boolean pedirComida(String comida, int idPasajero)
	{
		boolean comidaEntregada = true;
		
		return comidaEntregada;
	}
	
	public boolean pedirBebida(String bebida)
	{
		boolean bebidaEntregada = true;
		
		return bebidaEntregada;		
	}
	
	public boolean pedirPostres(String postre)
	{
		boolean postreEntregado = true;
		
		return postreEntregado;
	}
	
	
	// listar todo

}
