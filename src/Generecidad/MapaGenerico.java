package Generecidad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;

import domain.Habitacion;
import domain.Pasajero;
import domain.Reserva;
import exepciones.LimiteExcepcion;
import files.JsonUtiles;
import files.JsonUtiles;

public class MapaGenerico<K, T> {
	HashMap<K, T> mapaGenerico;
	T t;

	public MapaGenerico() {

		mapaGenerico = new HashMap<>();
	}

	public void Add(K k, T t) {
		mapaGenerico.put(k, t);
	}

	public void listar() {
		Iterator it = mapaGenerico.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry<K, T>) it.next();
			K d = (K) me.getKey();
			T t = (T) me.getValue();
			System.out.println("DNI:"+d);
			System.out.println(t.toString());
		}
	}

	public void eliminarPorClave(K k) throws LimiteExcepcion {
		if (mapaGenerico.containsKey(k)) {
			mapaGenerico.remove(k);
			System.out.println("Fue borrado");
		} else {
			throw new LimiteExcepcion("No se encontro");
		}
	}

	public void eliminarPorValor(T t) throws LimiteExcepcion {
		if (mapaGenerico.containsKey(t)) {
			mapaGenerico.remove(t);
			System.out.println("Fue borrado");
		} else {
			throw new LimiteExcepcion("No se encontro");
		}
	}

	public T ObtenerClase(K k) throws LimiteExcepcion {
		int i = 0;
		Iterator it = mapaGenerico.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry<K, T>) it.next();
			K d = (K) me.getKey();
			T t = (T) me.getValue();
			if (k == d) {
				return t;
			}
		}
		if (i == 0) {
			throw new LimiteExcepcion("No se encuentra en esta lista");
		}
		return null;
	}

	public void addReserva_A_pasajero(String k, Reserva reserva, ArrayList<Habitacion> listaHabitaciones,Pasajero pasajero) throws LimiteExcepcion {
		int i = 0;
		Reserva a;
		Iterator it = mapaGenerico.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry<K, T>) it.next();
			K d = (K) me.getKey();
			T t = (T) me.getValue();
			if (k == d){ //si el dni coindcide con el string.. then
				a = pasajero.ultima_Posicion_Valida_Reserva();

				if(a.isCompletado()==false && a!=null){
					a.add(listaHabitaciones);
					i=1;
				}
				else{
					pasajero.add_Reserva(reserva);
					i = 1;
				}
			}
		}
		if (i == 0) {
			pasajero.add_Reserva(reserva);
		}

	}

	public void Cancelar_reserva(Pasajero pasajero) throws LimiteExcepcion {
		Iterator it = mapaGenerico.entrySet().iterator();
		int i=0;
		System.out.println(mapaGenerico.size());
		
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry<K, T>) it.next();
			K d = (K) me.getKey();
			T t = (T) me.getValue();
			if (pasajero.getDni() == d) {
				pasajero.eliminar_ultimaReserva();
			System.out.println("La reserva fue cancelada");
			mapaGenerico.remove(pasajero.getDni());
			i=1;
			}
			if(i==0) {
				System.out.println("no se encontro la reserva");
			}
		}
		

		
	}

	public JSONArray exportarJson(String a) throws JSONException {
		JSONArray listArray = new JSONArray();
		JsonUtiles utiles = new JsonUtiles();// hago esto para poder grabarlo en un archivo JSON
		Iterator it = mapaGenerico.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry me = (Map.Entry<K, T>) it.next();
			K d = (K) me.getKey();
			T t = (T) me.getValue();
			// listArray.put(t.getFormatoJSON());
		}

		String respuesta = listArray.toString();
		JSONArray arregloJson = new JSONArray(respuesta);
		utiles.grabar(arregloJson, a);// lo grabo (ya se que solo pedia el string pero es algo extra)
		// System.out.println(arregloJson);
		return arregloJson;

	}
}

