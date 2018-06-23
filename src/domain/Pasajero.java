package domain;

import java.util.List;

public class Pasajero 
{
	private String nombre;
	private String apellido;
	private String dni;
	private String numTarjetaCredito;
	private String telefono;
	private String Nacionalidad;
	private List historial;
	private int idPasajero;
	
	public Pasajero() 
	{
		super();
		nombre = null;
		apellido = null;
		dni = null;
		numTarjetaCredito = null;
		telefono = null;
		Nacionalidad = null;
		historial = null;
		idPasajero = 0;
	}
	
	public Pasajero(String nombreRecib, String apellidoRecib, String dniRecib, String numTarjetaCreditoRecib, String telefonoRecib,
			String nacionalidadRecib, List historialRecib, int idPasajeroRecib) 
	{
		super();
		nombre = nombreRecib;
		apellido = apellidoRecib;
		dni = dniRecib;
		numTarjetaCredito = numTarjetaCreditoRecib;
		telefono = telefonoRecib;
		Nacionalidad = nacionalidadRecib;
		historial = historialRecib;
		idPasajero = idPasajeroRecib;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNumTarjetaCredito() {
		return numTarjetaCredito;
	}

	public void setNumTarjetaCredito(String numTarjetaCredito) {
		this.numTarjetaCredito = numTarjetaCredito;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNacionalidad() {
		return Nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}

	public List getHistorial() {
		return historial;
	}

	public void setHistorial(List historial) {
		this.historial = historial;
	}

	public int getIdPasajero() {
		return idPasajero;
	}

	public void setIdPasajero(int idPasajero) {
		this.idPasajero = idPasajero;
	}

	@Override
	public String toString() 
	{
		return "Pasajero [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", numTarjetaCredito="
				+ numTarjetaCredito + ", telefono=" + telefono + ", Nacionalidad=" + Nacionalidad + ", historial="
				+ historial + ", idPasajero=" + idPasajero + "]";
	}
	
	public void llamarConserje() // ..... // implements Conserje ?, quiza ?
	{
		
	}
	
	
	
}
