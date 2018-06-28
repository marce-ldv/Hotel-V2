package domain;

import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;

import serviciosAlPasajero.BebidasGeneral;
import serviciosAlPasajero.ComidasGeneral;
import serviciosAlPasajero.PostresGeneral;
import serviciosAlPasajero.ServiciosGeneral;

public class MiniBar <T>// recibira postres, comidas y bebidas
{

	private ArrayList<BebidasGeneral> bebidas;
	private ArrayList<ComidasGeneral> comidas;
	private ArrayList<PostresGeneral> postres;
	private ArrayList<ServiciosGeneral> serviciosEnGeneral;
	
	// constructores
	
	
	public MiniBar() 
	{	
		bebidas = null;
		comidas = null;
		postres = null;
	}
	
	public MiniBar(ArrayList<BebidasGeneral> bebidasRecib, ArrayList<ComidasGeneral> comidasRecib, ArrayList<PostresGeneral> postresRecib, ArrayList<ServiciosGeneral> servisRecib) 
	{	
		bebidas = bebidasRecib;
		comidas = comidasRecib;
		postres = postresRecib;
	}
	
	//metodos
	
	public void agregarComidaToListas()
	{
		BebidasGeneral cocaCola = new BebidasGeneral("CocaCola",35);
		BebidasGeneral limaLimon = new BebidasGeneral("limaLimon",35);
		bebidas.add(cocaCola);
		bebidas.add(limaLimon);
		
		ComidasGeneral pizza = new ComidasGeneral("pizza", 80);
		ComidasGeneral hamburguesa = new ComidasGeneral("hamburguesa", 50);
		comidas.add(pizza);
		comidas.add(hamburguesa);
		
		PostresGeneral flan = new PostresGeneral("flan", 30);
		PostresGeneral cassata = new PostresGeneral("cassata", 30);
		postres.add(flan);
		postres.add(cassata);
		
		ServiciosGeneral limpieza = new ServiciosGeneral("limpieza", 150);
		serviciosEnGeneral.add(limpieza);
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
	 * FIXME no se si estos metodos van asi (28/06 hasta ahora no) 
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

	public void pausarConsumicionMiniBar() // ni idea 
	{
		
	}
	
	
	public float costoTotal(int idPasajero) // deberia recibir todos los costos por parametro de los consumos del pasajero
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

