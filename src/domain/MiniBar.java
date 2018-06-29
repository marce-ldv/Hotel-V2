package domain;

import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;

import exepciones.ComidaInexistenteException;
import exepciones.NoHaySuficienteComidaException;

public class MiniBar <T extends Servicio>// recibira alimentos
{

	private ArrayList<Servicio> alimentos;
	//private ArrayList<BebidasParaConsumo> bebidas;
	//private ArrayList<PostresParaConsumo> postres;
	
	// constructores	
	
	public MiniBar() 
	{	
		alimentos = new ArrayList<Servicio>();
		//bebidas = new ArrayList<BebidasParaConsumo>();
		//postres = new ArrayList<PostresParaConsumo>();		
	}
	
	public MiniBar(ArrayList<Servicio> alimentosRecib) 
	{	
		alimentos = alimentosRecib;
	}
	
	//metodos
	
	
	public void agregarAlimentos (String nombre, int precio, int cantidad) 
	{
		Servicio b = new Servicio (nombre, precio, cantidad);
		alimentos.add(b);
	}
	
/*	public void agregarBebidas (String nombre, int precio, int cantidad) 
	{
		BebidasParaConsumo b = new BebidasParaConsumo (nombre, precio, cantidad);
		bebidas.add(b);
	}
	
	public void agregarPostres (String nombre, int precio, int cantidad) 
	{
		PostresParaConsumo b = new PostresParaConsumo (nombre, precio, cantidad);
		postres.add(b);
	}
	*/
	
	/**
	 * este metodo da la comida al pasajero y retorna el costo de lo que el mismo consumio
	 * 
	 * 
	 * @return costoTotalComida
	 * */
	
	public float darComidaToPasajeroYretornaCosto (String nombreComida, int cantidadComida) throws NoHaySuficienteComidaException,ComidaInexistenteException
	{
		float costoTotalComida = 0;
		
		for(Servicio e: alimentos)  // se recorre el array por completo
		{
			if(nombreComida.equals(e.getNombre()))  
			{
				if(e.getCantidad() >= cantidadComida) // si la cantidad de alimentos es mayor o igual a la que piede el pasajero 
				{
					costoTotalComida = cantidadComida * e.getValor();	// el costo total sera la cantidad de productos que pidio por el precio del mismo	
					
					e.setCantidad(e.getCantidad() - cantidadComida);		// se modifica la cantidad de la comida que pidio 
				}
				else
				{
					System.out.println("Solo hay " + e.getCantidad() + " " + e.getNombre()); // esto deberia ser una excepcion
					throw new NoHaySuficienteComidaException("Excepcion");
				}
				
			}
			else
			{
				throw new ComidaInexistenteException("Excepcion");  // esto tambien deberia ser una excepcion
			}
		}
		return costoTotalComida;
	}
	
	public void listarElementos(ArrayList<Servicio> arr) 
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

