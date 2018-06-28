package domain;

import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;

public class MiniBar <T extends Comparable> // recibira postres, comidas y bebidas
{

	private ArrayList<T> bebidas;
	private ArrayList<T> comidas;
	private ArrayList<T> postres;	
	
	// constructores
	
	
	public MiniBar() 
	{	
		bebidas = null;
		comidas = null;
		postres = null;
	}
	
	public MiniBar(ArrayList<T> bebidasRecib, ArrayList<T> comidasRecib, ArrayList<T> postresRecib) 
	{	
		bebidas = bebidasRecib;
		comidas = comidasRecib;
		postres = postresRecib;
	}
	
	/*
	public MiniBar()
	{
		
	}
*/
	//metodos
	
	public void agregarComidaToListas()
	{
		//bebidas.add(ComidaGenerica);
	}
	
	//menu listar alimentos
	
	public void listarElementos(ArrayList<T> arr) 
	{
		int i = 0;
		
		for(i = 0; arr.size() < i; i++)
		{
			System.out.print(" |"+arr.get(i)+"|");
		}		
	}
	
	
	/**
	 * FIXME no se si estos metodos van asi 
	 * */
	
	public void listarComidas()
	{
		listarElementos((ArrayList<T>) comidas);		
	}
	
	public void listarBebidas()
	{
		listarElementos((ArrayList<T>) bebidas);		
	}

	public void listarPostres()
	{
		listarElementos((ArrayList<T>) postres);		
	}

	public void pausarConsumicion() // ni idea 
	{
		
	}
	
	
	public float costoTotal() // deberia recibir todos los costos por parametro
	{
		
		
		
		return 0;
	}
	
	public JSONObject getFormatoJSON() throws JSONException 
	{
			
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("bebidas", bebidas);			
			jsonObject.put("comidas", comidas);
			jsonObject.put("postres", postres);

			return jsonObject;
		
	}
	
	@Override
	public String toString() {
		return "MiniBar [bebidas=" + bebidas + ", comidas=" + comidas + ", postres=" + postres + "]";
	}

}
