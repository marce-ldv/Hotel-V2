package domain;

import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;

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
	
	public JSONObject getFormatoJSON() throws JSONException 
	{
			
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("bebidas", bebidas);			
			jsonObject.put("comidas", comidas);
			jsonObject.put("postres", postres);

			return jsonObject;
		
	}

<<<<<<< HEAD
=======
	public JSONObject getFormatoJSON() throws JSONException 
	{
			
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("bebidas", bebidas);			
			jsonObject.put("comidas", comidas);
			jsonObject.put("postres", postres);

			return jsonObject;
		
	}
>>>>>>> cbe0c2bf1e4f36c894190ad6efc7f7bd1cfd6f30
	
	@Override
	public String toString() {
		return "MiniBar [bebidas=" + bebidas + ", comidas=" + comidas + ", postres=" + postres + "]";
	}
<<<<<<< HEAD
	
=======
>>>>>>> cbe0c2bf1e4f36c894190ad6efc7f7bd1cfd6f30

}
