package Generecidad;

import java.util.ArrayList;

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
}
