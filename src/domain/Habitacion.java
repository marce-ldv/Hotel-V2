package domain;

import org.json.JSONException;
import org.json.JSONObject;

public class Habitacion {
		
	private int numero_habitacion;
	private boolean ocupada; //incluye si esta reservada como ocuapda
	private double costo;
	private int cantidadPersona;
	
	
	public Habitacion() {}
	
	public Habitacion(int numero_habitacion, boolean ocupada, double costo,int cantidadPersona) {//en tipo habitacion se tiene que usar variable 
		this.numero_habitacion = numero_habitacion;
		this.ocupada = ocupada;	
		this.cantidadPersona=cantidadPersona;
		this.costo=costo;
	}


	public int getNumero_habitacion() {
		return numero_habitacion;
	}


	public void setNumero_habitacion(int numero_habitacion) {
		this.numero_habitacion = numero_habitacion;
	}


	public boolean getOcupada() {
			ocupada = true;
		return ocupada;
	}


	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
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
			A.put("Costo: ", getCosto());
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return A;
	}

	public int getCantidadPersona() {
		return cantidadPersona;
	}

	public void setCantidadPersona(int nuevacantidadPersona) {
		cantidadPersona = nuevacantidadPersona;
	}
	@Override
	public String toString() 
	{
		return "Habitacion [numeero=" + numero_habitacion + ", ocupada=" + ocupada + ", costo=" + costo + ", Capacidad=" + cantidadPersona + ", Nacionalidad=" + costo + "]";
	}

}
