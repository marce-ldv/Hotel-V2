package domain;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Conserje extends Usuario{
	Pasajero pasajero;
	ArrayList<Pasajero> listaPasajero;
	Pasajero[] misPasajero =new Pasajero[6];
	Habitacion habitacion;
	HashMap<Integer, Habitacion>ListaHabitaciones;
	public Conserje() {
		listaPasajero= new ArrayList<>();
	}
	public void Agregar(Pasajero pajero)
	{
		listaPasajero.add(pajero);	
	}
	/*public void ordenar(Pasajero pajero) {   //*no se como mierda hacer el sort para ordenar
	Arrays.sort(pajero);
	}*/
}
