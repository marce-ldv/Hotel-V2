package domain;

import org.json.JSONException;

import Generecidad.MapaGenerico;
import exepciones.LimiteExcepcion;

public class Reserva {

	// private Integer DNI;
	private static int limite;
	private int tope;
	MapaGenerico<Integer, Pasajero> reserva;

	public Reserva() {
		reserva = new MapaGenerico<>();
	}

	public static void setLimite(int limite) {
		Reserva.limite = limite;
	}

	public static int getLimite() {
		return limite;
	}

	public void setTope(int tope) {
		this.tope = tope;
	}

	public MapaGenerico<Integer, Pasajero> getReserva() {
		return reserva;
	}

	public void add(Pasajero pasajero, Integer DNI) throws LimiteExcepcion {
		if (limite < tope) {
			reserva.Add(DNI, pasajero);
			limite++;
		} else {
			throw new LimiteExcepcion("Aeropuerto lleno");
		}
	}

	public void listar() {
		System.out.println("Lista de Reserva");
		reserva.listar();
	}

	public Pasajero buscarPasajero(Integer DNI) throws LimiteExcepcion {
		try {
			return reserva.ObtenerClase(DNI);
		} catch (LimiteExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public void eliminar(Pasajero pasajero)
	{
		try {
			reserva.eliminarPorValor(pasajero);
		} catch (LimiteExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

public void Json_AvionComercial() {
	try {
		reserva.levantarJson("cambiar");
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}


