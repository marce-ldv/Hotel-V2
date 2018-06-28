package serviciosAlPasajero;

public class ComidasGeneral 
{
	private String nombre;
	private int valor;
	
	public ComidasGeneral(String nombreRecib, int valorRecib) 
	{	
		nombre = nombreRecib;
		valor = valorRecib;
	}
	
	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombreRecib) {
		nombre = nombreRecib;
	}



	public int getValor() {
		return valor;
	}



	public void setValor(int valorRecib) {
		valor = valorRecib;
	}



	@Override
	public String toString() 
	{
		return "ComidasGeneral [nombre=" + nombre + ", valor=" + valor + "]";
	}
	
	
	
	
	
	

}
