package domain;

import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;

import exepciones.ComidaInexistenteException;
import exepciones.NoHaySuficienteComidaException;

public class MiniBar <T extends Servicio>
{

	private ArrayList<Servicio> servicios;
	
	// constructores	
	
	public MiniBar() 
	{	
		servicios = new ArrayList<Servicio>();		
	}
	
	public MiniBar(ArrayList<Servicio> serviciosRecib) 
	{	
		servicios = serviciosRecib;
	}
	
	//metodos
	
	
	public void agregarServicios (String nombre, int precio, int cantidad) 
	{
		Servicio b = new Servicio (nombre, precio, cantidad);
		servicios.add(b);
	}
	
	
	/**
	 * este metodo da la comida al pasajero y retorna el costo de lo que el mismo consumio
	 * 
	 * 
	 * @return costoTotalComida
	 * */
	
	public float darServicioToPasajeroYretornaCosto (String nombreComida, int cantidadComida) throws NoHaySuficienteComidaException,ComidaInexistenteException
	{
		float costoTotalComida = 0;
		
		for(Servicio e: servicios)  // se recorre el array por completo
		{
			if(nombreComida.equals(e.getNombre()))  
			{
				if(e.getCantidad() >= cantidadComida) // si la cantidad de alimentos es mayor o igual a la que piede el pasajero 
				{
					costoTotalComida = cantidadComida * e.getValor();	// el costo total sera la cantidad de productos que pidio por el precio del mismo	
					
					e.setCantidad(e.getCantidad() - cantidadComida);		// se modifica la cantidad de la comida que pidio 
				}
				else
				{
					System.out.println("Solo hay " + e.getCantidad() + " " + e.getNombre()); // esto deberia ser una excepcion
					throw new NoHaySuficienteComidaException("Excepcion");
				}
				
			}
			else
			{
				throw new ComidaInexistenteException("Excepcion");  // esto tambien deberia ser una excepcion
			}
		}
		return costoTotalComida;
	}
	
	public void listarElementos(ArrayList<Servicio> arr) 
	{
		int i = 0;
		
		for(i = 0; arr.size() < i; i++)
		{
			System.out.print(" |"+arr.get(i)+"|");
		}		
	}	
	

	public JSONObject getFormatoJSON() throws JSONException 
	{
			
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("alimentos", servicios);			

			return jsonObject;
		
	}

	@Override
	public String toString() 
	{
		return "MiniBar [alimentos=" + servicios + "]";
	}
	
	

}

