package domain;

import org.json.JSONException;
import org.json.JSONObject;

public class Servicio {
	
	private String nombre;
	private float valor;
	private int cantidad;
	
	
	public Servicio(String nombre, float valor, int cantidad) {
		this.nombre = nombre;
		this.valor = valor;
		this.cantidad=cantidad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public JSONObject pasarA_JSON () {
		JSONObject a = new JSONObject();
		try {
			a.put("nombre", getNombre());
			a.put("valor", getValor());
			a.put("cantidad", getCantidad());
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return a;
	}


	@Override
	public String toString() {
		return "Servicio [nombre=" + nombre + ", valor=" + valor + ", cantidad=" + cantidad + "]";
	}

	

	

	
}
