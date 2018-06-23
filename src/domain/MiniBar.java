package domain;

import java.util.ArrayList;

public class MiniBar <T>
{
	private ArrayList<String> bebidas;
	private ArrayList<String> comidas;
	private ArrayList<String> postres;

	public void listarElementos(ArrayList<T> arr) 
	{
		int i = 0;

		for(i = 0; arr.size() < i; i++)
		{
			System.out.print(" |"+arr.get(i)+"|");
		}		
	}

	public void pausarConsumicion() // ni idea 
	{

	}

	public float costoTotal() // deberia recibir todos los costos por parametro
	{


		return 0;
	}



}



