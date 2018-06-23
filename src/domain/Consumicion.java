package domain;

public class Consumicion 
{
	private double costo;
	private int idReserva;
	
	public Consumicion() 
	{
		super();
		costo = 0;
		idReserva = 0;
	}
	
	public Consumicion(double costoRecib, int idReservaRecib) 
	{
		super();
		costo = costoRecib;
		idReserva = idReservaRecib;
	}
	
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
	
	@Override
	public String toString() 
	{
		return "Consumicion [costo=" + costo + ", idReserva=" + idReserva + "]";
	}
	
	public double getCostoConsumicion() 
	{
		
		
		return 0;
	}
	
}


























