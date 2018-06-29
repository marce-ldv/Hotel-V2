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

	private ArrayList<Habitacion> listaHabitaciones;
	Recepcionista conserje;
	MapaGenerico<String, Reserva> mapaHabitacionesReservada;
	ArrayList<Pasajero> listaPasajero;
	public Hotel() {
		listaHabitaciones = new ArrayList<>();
		conserje=new Recepcionista();
		mapaHabitacionesReservada=new MapaGenerico<>();
		listaPasajero=new ArrayList<>();
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

	public void agregarPasajero(String nombreRecib, String apellidoRecib, String dniRecib, String numTarjetaCreditoRecib, String telefonoRecib,
								String nacionalidadRecib, int idPasajeroRecib){
		listaPasajero.add(new Pasajero(nombreRecib,apellidoRecib,dniRecib,numTarjetaCreditoRecib,telefonoRecib,nacionalidadRecib,idPasajeroRecib));
	}
	

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/* Ignacio Chiaradia */
	/**
	 * Aca va los metodos de Nacho
	 * 
	 * @author Ignacio Chiaradia
	 */
	
	

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/* Rodri */
	/**
	 * Aca va los mentodos de Rodri
	 * 
	 * @author Rodri
	 */
	

	public void pedirComida (Pasajero p, String nombre, int cantidad)
	{
		p.pedirComidass(nombre, cantidad);
	}
	
	public float costoFinal (Pasajero p) {
		float costoServicios=0;
		for(Servicio e: p.getServicios())
		{
			costoServicios+=e.getValor();
		}
		costoServicios+=fin_Estadia(p);
		return costoServicios;
	}
	
	
	public void facturar (Pasajero p) {
		float resultado= costoFinal(p);
		p.crearFactura(p.getNombre(), resultado);
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	
	
	/* El verga corta (Chiappe) */
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
		System.out.println("entra aca?");
		int i=0;
		if (listaHabitaciones != null){
			System.out.println("entra aca IF?");
			for (Habitacion e : listaHabitaciones){
				System.out.println("entra aca? FOR");
				if ((e.getOcupada() == false) && (e.getCantidadPersona() >= cantidadPersona)) {
					System.out.println("entra aca? ultimo IF");
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
					System.out.println("entra al primer if ??");
					return e;
				}
				else if(( e.getOcupada() == true) &&  (e.getNumero_habitacion() == numero_de_habitacion)){
					System.out.println("entra al segundo if ??");
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
				//listar_Habitaciones_Disponibles(1);
				Habitacion habitacion= buscar_Habitacion(2);// MArcer: aca necesito un scaner ente
				System.out.println("prueba toString");
				System.out.println(habitacion.toString());
				habitacion.setOcupada(true);
				aux.add(habitacion);
				op = false;
			}

			checkIn = new Date(anio,mes,dia);
			checkOut = new Date(anio,mes,dia);
			//Hacer una validacion si esta el pasajero o no esta
			//en caso que no este, agregarlo a la lista
			/*if(validarPasajeroEnLista(pasajero)==false){ //si no esta, se agrega
				System.out.println("Se agrego el pasajero a la lista");
			}*/
			Reserva reserva=new Reserva(checkIn, checkOut, aux);//aca deberia crear la reserva
			mapaHabitacionesReservada.addReserva_A_pasajero(pasajero.getDni(),reserva,aux,pasajero);//le pasamos el DNI
			mapaHabitacionesReservada.Add(pasajero.getDni(), reserva);
			//System.out.println("la lista de la resrva:");
			//System.out.println(reserva.listaHabitaciones);
			
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
			System.out.println("el pasajero llego al hotel");
		} catch (LimiteExcepcion e) {
			System.out.println("Se rompe en llegada_Pasajero_Al_hotel");
			e.printStackTrace();
		}
	}
	public void cancelarReserva(Pasajero pasajero)
	{
		try {
			mapaHabitacionesReservada.Cancelar_reserva(pasajero);
		} catch (LimiteExcepcion e) {
			System.out.println("error en cancelar_Reserva");
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
		System.out.println("costo:" + costo);
		costo= ( costo * ( checkIn.getTime() - checkOut.getTime() ) );
		System.out.println("costo:" + costo);
		try {
			jsonObject.put("costo habitacion", costo);
		} catch (JSONException e) {
			System.out.println("se rompe en el put");
			e.printStackTrace();
		}
		
		pasajero.arreglo_Consumo(jsonObject);
		return costo;
	}
	
	public void listarMapReservas()
	{
		mapaHabitacionesReservada.listar();
	}
	public void listarReservaPasajero(Pasajero pasajero)
	{
		pasajero.listar_Reserva();
	}

	/**
	 * Agrega un pasajero a la lista
	 * @param pasajero
	 */
	public void agregarPasajeroToLista(Pasajero pasajero){
		listaPasajero.add(pasajero);
	}

	/**
	 * Realiza una validacion por criterio de dni si el pasajero esta en la lista
	 * @param pasajero
	 * @return
	 */
	public boolean validarPasajeroEnLista(Pasajero pasajero){
		int i=0;
		while(listaPasajero.get(i).getDni() != pasajero.getDni()){
			i++;
		}
		if(listaPasajero.get(i).getDni() == pasajero.getDni()){
			return true;
		}
		return false;
	}
}