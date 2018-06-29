package domain;

import exepciones.CampoVacioException;
import exepciones.InvalidPasswordException;
import exepciones.InicioSesionException;
import exepciones.InvalidPasswordException;
import exepciones.InvalidUsernameAndPasswordException;
import exepciones.InvalidUsernameException;
import exepciones.LimiteExcepcion;
import files.JsonUtiles;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import Generecidad.MapaGenerico;
import swing.LoginGUI;

public class Hotel{

	private List<Habitacion> listaHabitaciones;
	Recepcionista conserje;
	MapaGenerico<String, Reserva> mapaHabitacionesReservada;
	public Hotel() {
		listaHabitaciones = new ArrayList<>();
		conserje=new Recepcionista();
		mapaHabitacionesReservada=new MapaGenerico<>();
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	/* Marcelo */
	public String leerDatosUsuario(String tipoUsuario) throws JSONException {
		JsonUtiles jsonUt = new JsonUtiles();
		return jsonUt.leer(tipoUsuario);
	}

	/**
	 * Devuelve un usuario logueado
	 * 
	 * @author Marcelo Fabian Ludovino
	 * @param user
	 * @param pass
	 * @return
	 * @throws InvalidUsernameAndPasswordException
	 * @throws InvalidUsernameException
	 * @throws CampoVacioException
	 * @throws InicioSesionException
	 * @throws JSONException
	 */
	public Usuario loguearse(String user, String pass) throws InvalidUsernameAndPasswordException, CampoVacioException,
			InicioSesionException, JSONException, InvalidUsernameException, InvalidPasswordException {

		LoginGUI loginGUI = new LoginGUI();
		Usuario usu = null;
		String objUsuarios = "";

		String urlUsuario = loginGUI.getTipoDeUsuario();

		objUsuarios = leerDatosUsuario(urlUsuario);
		JSONArray jsonArray = new JSONArray(objUsuarios);
		for (int i = 0; i < jsonArray.length(); i++) {
			if (user.equals("") || pass.equals("")) {
				throw new CampoVacioException("Uno de los campos se encuentra vacio ");
			}
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			if (jsonObject.getString("usernane").equals(user)) {
				if (jsonObject.getString("password").equals(pass)) {
					usu = new Usuario();
					usu.setPassword(pass);
					usu.setUsuario(user);
				} else {
					throw new InvalidPasswordException();
				}
			} else {
				throw new InvalidUsernameException("Nombre de usuario incorrecto");
			}
		}
		if (usu == null) {
			throw new InvalidUsernameAndPasswordException("El usuario o la contrasenia son incorreectos ");
		}
		return usu;
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/* Nacho Ignacio */
	/**
	 * Aca va los mentodos de Nacho
	 * 
	 * @author Nacho Ignacio
	 */

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/* Rodri */
	/**
	 * Aca va los mentodos de Rodri
	 * 
	 * @author Rodri
	 */

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/* El verga larga(Chiappe) */
	/**
	 * Aca va los mentodos de Chiappe
	 * 
	 * @author Chiappe
	 */

	//public void add_mapa_reserva(Reserva reserva)
	public void add(Habitacion habitacion){
		listaHabitaciones.add(habitacion);
	}

	public void listar() throws LimiteExcepcion {
		if (listaHabitaciones != null) {
			for (Habitacion e : listaHabitaciones) {
				e.toString();
			}
		} 
		else {
			throw new LimiteExcepcion("lista vacia");
		}

	}

	public void listar_Habitaciones_Disponibles() throws LimiteExcepcion,Exception{
		if (listaHabitaciones != null) {
			for (Habitacion e : listaHabitaciones){
				if (e.getOcupada() == false){
					e.toString();
				}
			}
		} else {
			throw new LimiteExcepcion("lista vacia");
		}
	}

	public void listar_Habitaciones_Ocupadas()throws LimiteExcepcion,Exception {
		if (listaHabitaciones != null) {
			for (Habitacion e : listaHabitaciones){
				if (e.getOcupada()){
					e.toString();
				}
			}
		} else {
			throw new LimiteExcepcion("lista vacia");
		}
	}

	public void listar_Habitaciones_Disponibles(int cantidadPersona) throws LimiteExcepcion,Exception{
		int i=0;
		if (listaHabitaciones != null){
			for (Habitacion e : listaHabitaciones){
				if ((e.getOcupada() == false) && (e.getCantidadPersona() >= cantidadPersona)) {
					e.toString();
					i=1;
				}
			}
		}
		else {
			throw new LimiteExcepcion("lista vacia");
		}
		if(i==0)
		{
			System.out.println("no hay habitacion disponible");
		}
	}
	public Habitacion buscar_Habitacion(int numero_de_habitacion)throws LimiteExcepcion,Exception{
		
		if (listaHabitaciones != null){
			for (Habitacion e : listaHabitaciones){
				if ((( e.getOcupada() == false ) && ( e.getNumero_habitacion() == numero_de_habitacion))){	
					return e;
				}
				else if(( e.getOcupada()) &&  (e.getNumero_habitacion() == numero_de_habitacion)){
					System.out.println("La habitacion esta ocupada");
					return null;
				}
			}
		}
		else{
			throw new LimiteExcepcion("lista vacia");
		}
		System.out.println("no se encontro la habitacion");
		return null;
	}

	public void reservar_Habitacion(Pasajero pasajero){
		
		
		ArrayList<Habitacion> aux=new ArrayList<>();
		int anio, mes , dia;
		Date checkIn;
		Date checkOut;
		
		try {
	
			while(condicion!=true)
			{
				Habitacion habitacion= buscar_Habitacion(23);// MArcer: aca necesito un scaner ente
				habitacion.setOcupada(true);
				aux.add(habitacion);
			}
			
			
			checkIn=new Date(anio,mes,dia);
			
			checkOut=new Date(anio,mes,dia);

			Reserva reserva=new Reserva(checkIn, checkOut, aux);//aca deberia crear la reserva
			
			mapaHabitacionesReservada.addReserva_A_pasajero(pasajero.getDni(),reserva,aux);//le pasamos el DNI
			
		} catch (LimiteExcepcion e) {
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	
	public void llegada_Pasajero_Al_hotel(Pasajero pasajero)// solo lo elimino de la lista de reserva pero no habilito las habitaciones ni completo la reserva del pasajero hasta que se vaya
	{
		try {
			mapaHabitacionesReservada.eliminarPorClave(pasajero.getDni());
		} catch (LimiteExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void cancelar_Reserva(String DNI)
	{
		try {
			mapaHabitacionesReservada.Cancelar_reserva(DNI);
		} catch (LimiteExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}