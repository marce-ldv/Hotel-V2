package domain;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import exepciones.ComidaInexistenteException;
import exepciones.NoHaySuficienteComidaException;

public class Pasajero {
	private String nombre;
	private String apellido;
	private String dni;
	private String numTarjetaCredito;
	private String telefono;
	private String nacionalidad;
	private int idPasajero;
	ArrayList<Reserva> listaReserva;
	ArrayList<Servicio> servicios;
	private Integer CantidadPersona;
	private Integer estadoPasajero; // 0 = ya se fue / 1 = todavia no llego / 2 = esta en el hotel

	// constructores

	public Pasajero() {
		nombre = null;
		apellido = null;
		dni = null;
		numTarjetaCredito = null;
		telefono = null;
		nacionalidad = null;
		idPasajero = 0;
		listaReserva = new ArrayList<>();
		servicios = new ArrayList<>();
	}

	public Pasajero(String nombreRecib, String apellidoRecib, String dniRecib, String numTarjetaCreditoRecib,
			String telefonoRecib, String nacionalidadRecib, int idPasajeroRecib) {
		nombre = nombreRecib;
		apellido = apellidoRecib;
		dni = dniRecib;
		numTarjetaCredito = numTarjetaCreditoRecib;
		telefono = telefonoRecib;
		nacionalidad = nacionalidadRecib;
		idPasajero = idPasajeroRecib;
		listaReserva = new ArrayList<>();
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

	public int getIdPasajero() {
		return idPasajero;
	}

	public void setIdPasajero(int idPasajero) {
		this.idPasajero = idPasajero;
	}

	public void add_Reserva(Reserva reserva) {
		listaReserva.add(reserva);
	}

	public Integer getEstadoPasajero() {
		return estadoPasajero;
	}

	// metodos
	public void listar_Reserva() {
		if (listaReserva != null) {
			for (Reserva e : listaReserva) {
				System.out.println(e.toString());
			}
		}
	}

	public void eliminar_ultimaReserva() {
		if (listaReserva != null) {
			for (Reserva e : listaReserva) {
				if (e.isCompletado() == false) {
					listaReserva.remove(e);
					System.out.println("La reserva:" + e.toString() + "fue eliminada");
				}
			}
		}
	}
	
	public void pedirComida (String nombre, int cantidadComida) {
		MiniBar a = new MiniBar<>();
		float precio;
		try {
			precio = a.darComidaToPasajeroYretornaCosto(nombre, cantidadComida);
			if(precio!=0) {
				Servicio e =new Servicio(nombre, precio, cantidadComida);
				servicios.add(e);
			}
			else {
				System.out.println("No se pudo realizar el pedido.");
			}
		} catch (NoHaySuficienteComidaException e1) {
			e1.printStackTrace();
		} catch (ComidaInexistenteException e1) {
			e1.printStackTrace();
		}		
	}

	public Reserva ultima_Posicion_Valida_Reserva() {
		if (listaReserva != null) {
			for (Reserva e : listaReserva) {
				if (e.isCompletado() == false) {
					return e;
				}
			}
		} else {
			System.out.println("no hay una reserva pendiente");
		}
		return null;
	}

	public JSONArray arreglo_Consumo(JSONObject consumo) {
		JSONArray jsonArray = new JSONArray();
		jsonArray.put(consumo);
		return jsonArray;
	}

	public JSONObject getFormatoJSON() throws JSONException {

		JSONObject jsonObject = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		JSONArray jsonArrayb = new JSONArray();
		jsonObject.put("nombre", nombre);
		jsonObject.put("apellido", apellido);
		jsonObject.put("dni", dni);
		jsonObject.put("numTarjetaCredito", numTarjetaCredito);
		jsonObject.put("telefono", telefono);
		jsonObject.put("nacionalidad", nacionalidad);
		jsonObject.put("idPasajero", idPasajero);
		for (Reserva e : listaReserva) {
			jsonArray.put(e);
		}
		for (Servicio f: servicios) {
			jsonArrayb.put(f);
		}
		jsonObject.put("reserva", jsonArray);
		jsonObject.put("consumido", jsonArrayb);		
		jsonObject.put("cantidad de personas", CantidadPersona);
		jsonObject.put("estado de pasajeros", estadoPasajero);

		return jsonObject;
	}
	
	public void mostrarServicios () {
		for(Servicio e: servicios)
		{
			System.out.println(e);
		}
	}

	@Override
	public String toString() {
		return "Pasajero [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", numTarjetaCredito="
				+ numTarjetaCredito + ", telefono=" + telefono + ", Nacionalidad=" + nacionalidad + ", idPasajero="
				+ idPasajero +", servicios"+ servicios.toString() +"]";
	}

}
