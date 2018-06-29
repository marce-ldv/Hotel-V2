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
		return super.getMessage()+" la comida que usted ha pedido no esta en el menu";
	}
	

}
