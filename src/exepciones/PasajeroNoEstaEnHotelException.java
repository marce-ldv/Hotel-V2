package exepciones;

/**
 * 
 * Esta excepcion se utiliza cuando el pasajero realiza una operacion la cual el sistema necesita que se encuentre en el hotel  
 * 
 * @author Ignacio Chiaradia
 * */


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
