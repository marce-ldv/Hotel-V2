package exepciones;

import java.io.IOException;

public class NoHaySuficienteComidaException extends IOException 
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
