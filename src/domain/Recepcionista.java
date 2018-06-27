package domain;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import Generecidad.ListaGenerica;
import exepciones.LimiteExcepcion;

import java.util.Iterator;

public class Recepcionista extends Usuario {
	Pasajero pasajero;
	Reserva reserva;
	ListaGenerica<Pasajero> listaPasajero;//este es el historial
	public Recepcionista() {
		super();
		listaPasajero= new ListaGenerica<>();
	}

	public void AgregarAlHistoial(Pasajero pajero,Integer dNI) {//el hotel pide 
		listaPasajero.add(pajero);
	}
	public void AgregarALaReserva(Pasajero pasajero, Integer DNI)
	{
		try {
			reserva.add(pasajero, DNI);
		} catch (LimiteExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void listarReserva()
	{
		reserva.listar();
	}
	public void pasarDeReservaAHistorial(Integer DNI)
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
	}
	//aca los paso al Historial de pasajero

}
