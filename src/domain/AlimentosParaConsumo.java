package domain;

import org.json.JSONException;
import org.json.JSONObject;

public class AlimentosParaConsumo 
{
	private String nombre;
	private int precio;
	private int cantidad;
	
	//contructores
	
	public AlimentosParaConsumo(String nombre, int precio, int cantidad)
	{
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad=cantidad;
	}

	// getters y setters

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}

	

	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	// metodos
	
	public JSONObject getFormatoJSON() throws JSONException 
	{
			
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("nombre", nombre);			
			jsonObject.put("precio", precio);
			jsonObject.put("cantidad", cantidad);

			return jsonObject;
	}
	
	

	@Override
	public String toString() 
	{
		return "Comida [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
}
	

