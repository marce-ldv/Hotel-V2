package exepciones;

public class PasajeroNoEstaEnHotelException extends Exception 
{
	public PasajeroNoEstaEnHotelException(String msg)
	{
		super(msg);
	}
	

	@Override
	public String getMessage()
	{
		return super.getMessage()+" el pasajero que desea pedir comida no esta en el hotel";
	}
	
	

}
