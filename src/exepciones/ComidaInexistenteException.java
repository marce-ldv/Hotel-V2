package exepciones;

public class ComidaInexistenteException extends Exception 
{
	public ComidaInexistenteException(String msg)
	{
		super(msg);
	}
	
	@Override
	public String getMessage()
	{
		return super.getMessage()+" la cantidad de alimentos pedidos es mayor a la actual";
	}
	

}
