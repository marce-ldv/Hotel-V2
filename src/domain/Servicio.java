package domain;

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


	@Override
	public String toString() {
		return "Servicio [nombre=" + nombre + ", valor=" + valor + ", cantidad=" + cantidad + "]";
	}

	

	

	
}
