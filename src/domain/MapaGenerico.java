package domain;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapaGenerico<K,V>
{
	HashMap<K,V> ListaMap;
	public MapaGenerico() 
	{
		ListaMap=new HashMap<K,V>();
	}
	
	
	public void listar(K id, V objeto)   /// K= numero a buscar    V= Es el Objeto que utilizamos
	{
	    Iterator it = ListaMap.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry me = (Map.Entry<Integer, Habitacion>) it.next();
	        Habitacion habitacion = (Habitacion) me.getValue();     
	        
	   } 
}

	
}
