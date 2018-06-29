package exepciones;

import java.io.IOException;

/**
 * 
 * Esta excepcion se utiliza cuando hay menos comida de la pide el pasajero
 * 
 * @author Ignacio Chiaradia
 * */

public class NoHaySuficienteComidaException extends Exception 
{
	public NoHaySuficienteComidaException(String msg)
	{
		super(msg);		
	}
	
	@Override
	public String getMessage()
	{
		return super.getMessage()+" la cantidad de alimentos pedidos es mayor a la actual";
	}

}
