package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import Generecidad.MapaGenerico;
import exepciones.CampoVacioException;
import exepciones.ComidaInexistenteException;
import exepciones.InicioSesionException;
import exepciones.InvalidPasswordException;
import exepciones.InvalidUsernameAndPasswordException;
import exepciones.InvalidUsernameException;
import exepciones.LimiteExcepcion;
import exepciones.NoHaySuficienteComidaException;
import exepciones.PasajeroNoEstaEnHotelException;
import files.JsonUtiles;
import swing.LoginGUI;

public class Hotel{

	private List<Habitacion> listaHabitaciones;
	Recepcionista conserje;
	MapaGenerico<String, Reserva> mapaHabitacionesReservada;
	ArrayList<Pasajero> pasajero;
	public Hotel() {
		listaHabitaciones = new ArrayList<>();
		conserje=new Recepcionista();
		mapaHabitacionesReservada=new MapaGenerico<>();
		pasajero=new ArrayList<>();
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
			if (jsonObject.getString("username").equals(user)) {
				if (jsonObject.getString("password").equals(pass)) {
					usu = new Usuario();
					usu.setPassword(pass);
					usu.setUsuario(user);
					System.out.println(jsonObject.getString("username")+" user "+user);
					System.out.println(jsonObject.getString("password")+" pass "+pass);
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
	
	public void agregarHabitacionesManualmente() {
		Hotel hotel = new Hotel();
		
		hotel.add(new Habitacion(1,false,2000,2));
		hotel.add(new Habitacion(2,false,3000,2));
		hotel.add(new Habitacion(3,false,1500,1));
		hotel.add(new Habitacion(4,false,2000,2));
		hotel.add(new Habitacion(5,false,4500,1));
		hotel.add(new Habitacion(6,false,2000,2));
		hotel.add(new Habitacion(7,false,2000,2));
		hotel.add(new Habitacion(8,false,5400,3));
		hotel.add(new Habitacion(9,false,2000,2));
		hotel.add(new Habitacion(10,false,3400,2));
		hotel.add(new Habitacion(12,false,2000,4));
		hotel.add(new Habitacion(13,false,2000,2));
		hotel.add(new Habitacion(14,false,2300,2));
		hotel.add(new Habitacion(15,false,2000,2));
		hotel.add(new Habitacion(16,false,5900,6));
		hotel.add(new Habitacion(17,false,2000,2));
		hotel.add(new Habitacion(18,false,2000,2));
		hotel.add(new Habitacion(19,false,2300,2));
		hotel.add(new Habitacion(20,false,2000,2));
		hotel.add(new Habitacion(21,false,2100,2));
		hotel.add(new Habitacion(22,false,2000,2));
		hotel.add(new Habitacion(23,false,4300,2));
		hotel.add(new Habitacion(24,false,1100,5));
		hotel.add(new Habitacion(25,false,5400,2));
		hotel.add(new Habitacion(26,false,3100,3));
		hotel.add(new Habitacion(27,false,1980,2));
		hotel.add(new Habitacion(28,false,1300,2));
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/* Ignacio Chiaradia */
	/**
	 * Aca va los metodos de Nacho
	 * 
	 * @author Ignacio Chiaradia
	 */
	
	public float pedirComida(Pasajero p, MiniBar minibar, String nombreComidaAPedir, int cantidadComidAPedir) throws PasajeroNoEstaEnHotelException, ComidaInexistenteException, NoHaySuficienteComidaException
	{
		float costoPedidodelPasajero = 0;
		
		if(p.getEstadoPasajero() == 2)
		{
			costoPedidodelPasajero = minibar.darComidaToPasajeroYretornaCosto(nombreComidaAPedir, cantidadComidAPedir);
			
			return costoPedidodelPasajero;
			
		}
		else
		{
			throw new PasajeroNoEstaEnHotelException("Exception");  
		}		
	}

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

	public void listarHabitaciones() throws LimiteExcepcion {
		if (listaHabitaciones != null) {
			for (Habitacion e : listaHabitaciones) {
				System.out.println("asdasdsasda");
				System.out.println(e.toString());
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
					System.out.println(e.toString());
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
					System.out.println(e.toString());
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
					System.out.println(e.toString());
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
		int anio=0, mes=0, dia=0;
		Date checkIn=null;
		Date checkOut=null;
		boolean op = true;
		//agregar metodo de type input

		try {
			while(op){
				listar_Habitaciones_Disponibles(1);
				Habitacion habitacion= buscar_Habitacion(23);// MArcer: aca necesito un scaner ente
				habitacion.setOcupada(true);
				aux.add(habitacion);
				op = false;
			}

			checkIn = new Date(anio,mes,dia);
			checkOut = new Date(anio,mes,dia);
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
	public double fin_Estadia(Pasajero pasajero)
	{
		JSONObject jsonObject=new JSONObject();
		double costo;
		Reserva reserva=pasajero.ultima_Posicion_Valida_Reserva();
		reserva.setCompletado(true);
		costo=reserva.costo_total_habitaciones();
		reserva.habilitar_habitaciones();
		Date checkIn=reserva.getCheck_In();
		Date checkOut=reserva.getCheck_Out();
		costo= ( costo * ( checkIn.getTime() - checkOut.getTime() ) );
		
		try {
			jsonObject.put("costo habitacion", costo);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pasajero.arreglo_Consumo(jsonObject);
		return costo;
	}
	
}