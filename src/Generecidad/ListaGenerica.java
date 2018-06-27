package Generecidad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;

import files.JsonUtiles;

public class ListaGenerica<T> {

	ArrayList<T> lista = new ArrayList<>();

	public ListaGenerica() {
		T t;
	}

	public void add(T t) {
		
			lista.add(t);
	}

	public void agregar_A_lista(T t) {
		lista.add(t);
	}

	public void Listar() {
		for (T e : lista) {
			System.out.println(e.toString());
		}
	}
	
	public JSONArray exportarJson(String a) throws JSONException {
		JSONArray listArray = new JSONArray();
		JsonUtiles utiles = new JsonUtiles();// hago esto para poder grabarlo en un archivo JSON
		String respuesta = lista.toString();
		JSONArray arregloJson = new JSONArray(respuesta);
		utiles.grabar(arregloJson, a);// lo grabo (ya se que solo pedia el string pero es algo extra)
		// System.out.println(arregloJson);
		return arregloJson;

	}
}
