package domain;

import org.json.JSONException;
import org.json.JSONObject;

public class Habitacion {
		
	private int numero_habitacion;
	private boolean ocupada; //incluye si esta reservada como ocuapda
	private int valor_habitacion; //Simple, Doble, Deluxe
	private int cantidad_de_dias;
	private double costo;
	

	
		public Habitacion() {
			
		}
	
	public Habitacion(int numero_habitacion, boolean ocupada, int valor_habitacion) {//en tipo habitacion se tiene que usar variable 
		this.numero_habitacion = numero_habitacion;
		this.ocupada = ocupada;	
		costo=(cantidad_de_dias*valor_habitacion);
	}


	public int getNumero_habitacion() {
		return numero_habitacion;
	}


	public void setNumero_habitacion(int numero_habitacion) {
		this.numero_habitacion = numero_habitacion;
	}


	public boolean getOcupada() {
		return ocupada;
	}


	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}


	public int getValor_habitacion() {
		return valor_habitacion;
	}


	public void setValor_habitacion(int valor_habitacion) {
		this.valor_habitacion = valor_habitacion;
	}


	public int getCantidad_de_dias() {
		return cantidad_de_dias;
	}


	public void setCantidad_de_dias(int cantidad_de_dias) {
		this.cantidad_de_dias = cantidad_de_dias;
	}


	public double getCosto() {
		return costo;
	}


	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	public JSONObject pasarA_Json () {
		JSONObject A= new JSONObject ();
		try {
			A.put("Numero de habitacion. ", getNumero_habitacion());
			String real;
			if(ocupada) {
			real="ocupada";}
			else {
				real="desocupada";
			}
			A.put("Ocupada: ", real);
			A.put("Valor habitacion: ", getValor_habitacion());
			A.put("Cantidad de dias: ", getCantidad_de_dias());
			A.put("Costo: ", getCosto());
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return A;
	}
	

}
