package domain;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import Generecidad.ListaGenerica;
import exepciones.LimiteExcepcion;

import java.util.Iterator;

public class Conserje extends Usuario {
	Pasajero pasajero;
	Reserva reserva;
	ListaGenerica<Pasajero> listaPasajero;
	public Conserje() {
		super();
		listaPasajero= new ListaGenerica<>();
	}

	public void Agregar(Pasajero pajero) {
		listaPasajero.add(pajero);
	}
	public void pasarDeReservaAHistorial(Integer DNI)
	{
		try {
			pasajero=reserva.buscarPasajero(DNI);
		} catch (LimiteExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		reserva.eliminar(pasajero);
	}
	//aca los paso al Historial de pasajero
	//comentario
	
}
