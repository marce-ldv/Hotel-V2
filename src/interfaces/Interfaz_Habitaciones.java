package interfaces;

import exepciones.LimiteExcepcion;

public interface Interfaz_Habitaciones {
	void listarHabitaciones()throws LimiteExcepcion;
	
	void listar_Habitaciones_Disponibles() throws LimiteExcepcion, Exception;
	
	
}
