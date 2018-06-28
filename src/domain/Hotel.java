package domain;

import exepciones.CampoVacioException;
import exepciones.InicioSesionException;
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

import swing.LoginGUI;

public class Hotel{

	private List<Habitacion> listaHabitaciones;
	Recepcionista conserje;
	public Hotel() {
		listaHabitaciones = new ArrayList<>();
		conserje=new Recepcionista();
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
	 * @author Marcelo
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
			InicioSesionException, JSONException, InvalidUsernameException {

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
					// invalid pasword exception
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
		if (listaHabitaciones != null){
			for (Habitacion e : listaHabitaciones){
				if ((e.getOcupada() == false) && (e.getCantidadPersona() == cantidadPersona)) {
					e.toString();
				}
			}
		}
		else {
			throw new LimiteExcepcion("lista vacia");
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
		else 
		{
			throw new LimiteExcepcion("lista vacia");
		}
		System.out.println("no se encontro la habitacion");
		return null;
	}
	public void reservar_Habitacion(Pasajero pasajero, Date fecha){
		
		try {
			//agrego la fecha
			Habitacion reserva= buscar_Habitacion(23);// MArcer: aca necesito un scaner ente
			conserje.AgregarALaReserva(pasajero, pasajero.getDni());
		} catch (LimiteExcepcion e) {
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}
