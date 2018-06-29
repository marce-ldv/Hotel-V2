package domain;

public class Servicio {
	
	private String nombre;
	private float valor;
	
	
	public Servicio(String nombre, float valor) {
		this.nombre = nombre;
		this.valor = valor;
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


	@Override
	public String toString() {
		return "nombre=" + nombre + ", valor=" + valor + " ";
	}
	
	

	
}
