package domain;

import java.util.ArrayList;
import java.util.Date;

import org.json.JSONException;

import Generecidad.MapaGenerico;
import exepciones.LimiteExcepcion;

public class Reserva {

	// private Integer DNI;
	private Date check_In;
	private Date check_Out;
	ArrayList<Habitacion> listaHabitaciones;
	private boolean completado;

	public Reserva(Date check_In,Date check_Out,ArrayList<Habitacion>listaHabitaciones)
	{
		this.check_In=check_In;
		this.check_Out=check_Out;
		this.listaHabitaciones = listaHabitaciones;
		this.completado=false;
	}
	public Reserva() {
		listaHabitaciones = new ArrayList<>();
	}

	public Date getCheck_In() {
		return check_In;
	}

	public void setCheck_In(Date check_In) {
		this.check_In = check_In;
	}

	public Date getCheck_Out() {
		return check_Out;
	}

	public void setCheck_Out(Date check_Out) {
		this.check_Out = check_Out;
	}
	public void listarHabitacion()
	{
		if(listaHabitaciones!=null)
		{
			for(Habitacion e: listaHabitaciones )
			{
				e.toString();
			}
		
		}
	}
	
	public ArrayList<Habitacion> retornar_lista_Habitaciones()
	{
		return listaHabitaciones;
	}
	
	public void add(ArrayList<Habitacion> habitaciomnes)
	{
		listaHabitaciones.addAll(habitaciomnes);
	}
	
	public void add(Habitacion habitacion)
	{
		listaHabitaciones.add(habitacion);
	}
	
	public String toString()
	{
		return "Pasajero [check_In: " + check_In + ", check_Out:" + check_Out + ", Habitaciones:" + listaHabitaciones +"]";
	}
	public boolean isCompletado() {
		return completado;
	}
	public void setCompletado(boolean completado) {
		this.completado = completado;
	}

	
}


