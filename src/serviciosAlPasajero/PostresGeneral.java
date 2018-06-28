package serviciosAlPasajero;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PostresGeneral 
{
	private String nombre;
	private int valor;
	
	public PostresGeneral(String nombreRecib, int valorRecib) 
	{	
		nombre = nombreRecib;
		valor = valorRecib;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombreRecib) {
		nombre = nombreRecib;
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int valorRecib) {
		valor = valorRecib;
	}
	
	public JSONObject getFormatoJSON() throws JSONException 
	{
			
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("nombre", nombre);			
			jsonObject.put("valor", valor);

			return jsonObject;		
	}




	@Override
	public String toString() 
	{
		return "ComidasGeneral [nombre=" + nombre + ", valor=" + valor + "]";
	}

}
