package domain;

import exepciones.LimiteExcepcion;

import java.util.ArrayList;
import java.util.List;

public class Recepcionista extends Usuario {
	Pasajero pasajero;
	Reserva reserva;
	List<Pasajero> listaPasajero;//este es el historial
	public Recepcionista() {
		super();
		listaPasajero= new ArrayList<>();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public void AgregarAlHistoial(Pasajero pajero,String dNI) {//el hotel pide 
		listaPasajero.add(pajero);
	}
	public void AgregarALaReserva(Pasajero pasajero, String string)
	{
		try {
			reserva.add(pasajero, string);
		} catch (LimiteExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void listarReserva()
	{
		reserva.listar();
	}
	public void pasarDeReservaAHistorial(String DNI)//ver como pasar el costo de la habitacion al pasajero
	{
		try {
			pasajero=reserva.buscarPasajero(DNI);
			AgregarAlHistoial(pasajero, DNI);
			reserva.eliminar(pasajero);
		} catch (LimiteExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// debo implementar de alguna forma las habitaciones(tengo que fijarme el codigo de rodri cuando lo suba)
		//Agregar pasajero al historial
	}*/
	//aca los paso al Historial de pasajero

}
