package domain;

import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;

public class MiniBar <T>// recibira postres, comidas y bebidas
{

	private ArrayList<AlimentosParaConsumo> alimentos;

	
	// constructores	
	
	public MiniBar() 
	{	
		alimentos = new ArrayList<>();
		
	}
	
	public MiniBar(ArrayList<AlimentosParaConsumo> alimentosRecib) 
	{	
		alimentos = alimentosRecib;
	}
	
	//metodos
	
	
	public void agregarAlimentos (String nombre, int precio, int cantidad) 
	{
		AlimentosParaConsumo b = new AlimentosParaConsumo (nombre, precio, cantidad);
		alimentos.add(b);
	}
	
	public int pedirComida (String nombre, int cantidad) 
	{
		int a=0;
		
		for(AlimentosParaConsumo e: alimentos)  // se recorre el array por completo
		{
			if(nombre.equals(e.getNombre()))  
			{
				if(e.getCantidad() >= cantidad)
				{
					a = cantidad * e.getPrecio();
					e.setCantidad(e.getCantidad() - cantidad);
				}
				else
				{
					System.out.println("Solo hay "+e.getCantidad()+ " " +e.getNombre()); // esto deberia ser una excepcion
				}
				
			}
			else
			{
				System.out.println("Esa comida no esta en el menu"); // esto tambien deberia ser una excepcion
			}
		}
		return a;
	}
	
	public void listarElementos(ArrayList<AlimentosParaConsumo> arr) 
	{
		int i = 0;
		
		for(i = 0; arr.size() < i; i++)
		{
			System.out.print(" |"+arr.get(i)+"|");
		}		
	}	
	
	/*public float costoTotal(int idPasajero) // ir metiendo al arreglo los valores de los productos del minibar
	{										
		ArrayList<Integer> arrGastos = new ArrayList<Integer>();
			
		
		
		return 0;
	}*/
	
	public JSONObject getFormatoJSON() throws JSONException 
	{
			
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("alimentos", alimentos);			

			return jsonObject;
		
	}

	@Override
	public String toString() 
	{
		return "MiniBar [alimentos=" + alimentos + "]";
	}
	
	

}

