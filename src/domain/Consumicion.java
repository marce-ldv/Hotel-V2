package domain;

import org.json.JSONException;
import org.json.JSONObject;

public class Consumicion 
{
	private double costo;
	private int idReserva;
	
	// constructores
	
	public Consumicion() 
	{
		costo = 0;
		idReserva = 0;
	}
	
	public Consumicion(double costoRecib, int idReservaRecib) 
	{
		costo = costoRecib;
		idReserva = idReservaRecib;
	}
	
	// getters y setters
	
	public double getCosto()
	{
		return costo;
	}
	
	public void setCosto(double nuevoCosto)
	{
		costo = nuevoCosto;
	}


	public int getIdReserva() 
	{
		return idReserva;
	}

	public void setIdReserva(int idReserva) 
	{
		this.idReserva = idReserva;
	}
	
	
	public double getCostoConsumicion() 
	{
		
		
		return 0;
	}
	
	// metodos
	
	public JSONObject getFormatoJSON() throws JSONException 
	{
			
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("costo", costo);			
			jsonObject.put("idReserva", idReserva);			

			return jsonObject;
		
	}
	
	@Override
	public String toString() 
	{
		return "Consumicion [costo=" + costo + ", idReserva=" + idReserva + "]";
	}
}


























