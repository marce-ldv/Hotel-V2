package domain;



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;

import exepciones.LimiteExcepcion;
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
			T t = (T) me.getValue();
			System.out.println(t.toString());
		}
	}

	public void eliminar(K k) throws LimiteExcepcion {
		int i = 0;
		Iterator it = mapaGenerico.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry<K, T>) it.next();
			K d = (K) me.getKey();
			T t = (T) me.getValue();
			if (k == d) {
				mapaGenerico.remove(d, t);
				System.out.println("el avion fue borrado");
				i = 1;
			}
		}
		if (i == 0) {
			throw new LimiteExcepcion("No se encontro la patente");
		}
	}

	public String Obtener(K k) throws LimiteExcepcion {
		int i = 0;
		Iterator it = mapaGenerico.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry<K, T>) it.next();
			K d = (K) me.getKey();
			T t = (T) me.getValue();
			if (k == d) {
				//return t.getMarca();
			}
		}
		if (i == 0) {
			throw new LimiteExcepcion("No se encontro la patente");
		}
		return "";
	}

	public JSONArray levantarJson(String nombreAGuardar) throws JSONException {
		JSONArray listArray = new JSONArray();
		JsonUtiles utiles = new JsonUtiles();// hago esto para poder grabarlo en un archivo JSON
		Iterator it = mapaGenerico.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry me = (Map.Entry<K, T>) it.next();
			K d = (K) me.getKey();
			T t = (T) me.getValue();
			//listArray.put(t.getFormatoJSON());
		}

		String respuesta = listArray.toString();
		JSONArray arregloJson = new JSONArray(respuesta);
		utiles.grabar(arregloJson,nombreAGuardar);// lo grabo (ya se que solo pedia el string pero es algo extra)
		// System.out.println(arregloJson);
		return arregloJson;
	}

}