package domain;

import org.json.JSONException;
import org.json.JSONObject;

public class AlimentosParaConsumo extends Servicio {
	
	private int cantidad;
	
	public AlimentosParaConsumo(String nombre, float valor, int cantidad) {
		super(nombre, valor);
		this.cantidad=cantidad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}	
	

	@Override
	public String toString() {
		return "AlimentosParaConsumo ["+ super.toString() +"cantidad=" + cantidad + "]";
	}

	@Override
	public void pasarA_Json() {
		
	}
	
}
