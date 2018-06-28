package domain;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Pasajero 
{
	private String nombre;
	private String apellido;
	private String dni;
	private String numTarjetaCredito;
	private String telefono;
	private String nacionalidad;
	private List historial;
	private int idPasajero;
	ArrayList<Habitacion> habitacion;
	
	
	// constructores
	
	
	public Pasajero() 
	{
		nombre = null;
		apellido = null;
		dni = null;
		numTarjetaCredito = null;
		telefono = null;
		nacionalidad = null;
		historial = null;
		idPasajero = 0;
		habitacion=new ArrayList<>();
	}
	
	public Pasajero(String nombreRecib, String apellidoRecib, String dniRecib, String numTarjetaCreditoRecib, String telefonoRecib,
			String nacionalidadRecib, List historialRecib, int idPasajeroRecib) 
	{
		nombre = nombreRecib;
		apellido = apellidoRecib;
		dni = dniRecib;
		numTarjetaCredito = numTarjetaCreditoRecib;
		telefono = telefonoRecib;
		nacionalidad = nacionalidadRecib;
		historial = historialRecib;
		idPasajero = idPasajeroRecib;
	}

	// setters y getters
	
	
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
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
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

	public void addHabitacion(Habitacion habitacionApasar)
	{
		habitacion.add(habitacionApasar);
	}
	// metodos
	
	
	public JSONObject getFormatoJSON() throws JSONException 
	{
			
			JSONObject jsonObject = new JSONObject();
			JSONArray jsonArray = new JSONArray();
			jsonObject.put("nombre", nombre);			
			jsonObject.put("apellido", apellido);
			jsonObject.put("dni", dni);
			jsonObject.put("numTarjetaCredito", numTarjetaCredito);
			jsonObject.put("telefono", telefono);			
			jsonObject.put("nacionalidad", nacionalidad);			
			jsonObject.put("historial", historial);			
			jsonObject.put("idPasajero", idPasajero);		
			jsonArray.put("consumo");

			return jsonObject;		
	}

	
	@Override
	public String toString() 
	{
		return "Pasajero [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", numTarjetaCredito="
				+ numTarjetaCredito + ", telefono=" + telefono + ", Nacionalidad=" + nacionalidad + ", historial="
				+ historial + ", idPasajero=" + idPasajero + "]";
	}
	
	/**
	 * MENU pasajero (esto se vera por pantalla)
	 * 
	 * @return opcion que elije el pasajero
	 * */
	
	public int pantallaMenuPasajero()
    {    	
    	Scanner scan = new Scanner(System.in);

    	int opcion = -1;

    	System.out.println("\n\nMenu pasajero:");
    	
    	// estos pedidos van al conserje
    	
    	System.out.println("\n\n1-Realizar reserva");
    	System.out.println("2-Cancelar reserva");
    	
    	
    	// estos pedidos van al empleado
    	
    	System.out.println("5-Pedir comida"); 
    	System.out.println("6-Pedir bebida");
    	System.out.println("7-Pedir postre");

    	System.out.println("0-Salir");

    	opcion = scan.nextInt();    	
    	
    	return opcion;
    }
	
	
	/**
	 * Este es el funcionamiento del menu por dentro
	 *
	 * TODO  agregar relaciones entre pasajero empleado y minibar y terminar metodo menuAtenderPasajero()
	 * 
	 * */
	
	public void menuAtenderPasajero() // ..... // implements Conserje ?, quiza ?
	{
		//Scanner scan = new Scanner(System.in);
		
		int opcion = -1;
		
		while(opcion != 0)
		{
			opcion = pantallaMenuPasajero();
			
			switch(opcion)
			{
			
			// estos pedidos van al conserje
			
			case 1: // realizar reserva
				
				
				
				break;
				
			case 2: // cancelar reserva
				
				
				
				break;
				
			case 3: // pedir check in
				
				
				
				break;
				
			case 4: // pedir check out
				
				
				
				break;

			//estos pedidos van al empleado
				
			case 5: // pedir comida

					

				break;
				
			case 6: // pedir bebida



				break;
				
			case 7: // pedir postre



				break;			
			}
			
		}	
		
	}
	
	
	
}
