package domain;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.JSONException;
import org.json.JSONObject;


//hola chicos

public class Factura {

	// Datos del vendedor (hotel)
	private final String Nombre_empresa = "Hotel Gran Lago";
	private final String Razon_social = "Trivago S.A";
	private final String Numero_cuit = "30690009964";
	private final String ingresos_brutos = "30-69000996-4";
	private final String direccion = "Colon 1234";
	private final String condicion_frente_al_iva = "responsable inscripto";
	private final String Fecha_de_inicio_de_actividades = "06/06/2018";
	private final int punto_de_venta = 001;
	// Datos del comprador
	private String nombre_comprador;
	private String cuit_comprador;
	private String domicilio_comprador;
	private String condicion_de_venta;// contado, tarjeta, etc
	private String comprador_condicion_frente_al_iva;// responsable inscripto, consumidor final
	//
	private static int Index = 0;// indice que numera las factuas
	private int nro_de_compra;// depende de index
	private Date fecha_de_emision;
	private double monto_minibar;
	private int cantidad_dias;
	private double monto_habitacion;
	private double otros_conceptos;
	private double descuento;
	private double monto_total;
	private char tipo;
	private DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	
	
	
	
	

	// Constructores

	public Factura(String nombre_comprador, String cuit_comprador, String domicilio_comprador,
			String condicion_de_venta, String comprador_condicion_frente_al_iva, int nro_de_compra,
			double monto_minibar, double monto_habitacion, int cantidad_dias, double otros_conceptos,
			double descuento) {
		this.nombre_comprador = nombre_comprador;
		this.cuit_comprador = cuit_comprador;
		this.domicilio_comprador = domicilio_comprador;
		this.condicion_de_venta = condicion_de_venta;
		this.cantidad_dias = cantidad_dias;
		this.comprador_condicion_frente_al_iva = comprador_condicion_frente_al_iva;
		Index++;
		this.nro_de_compra = Index;
		fecha_de_emision = new Date();
		this.monto_minibar = monto_minibar;
		this.monto_habitacion = monto_habitacion;
		this.otros_conceptos = otros_conceptos;
		this.descuento = descuento;
		if (comprador_condicion_frente_al_iva.equals("responsable inscripto")) {
			tipo = 'A';
		} else {
			tipo = 'B';
		}
		monto_total = (monto_minibar + (cantidad_dias * monto_habitacion * (1 - descuento / 100)) + otros_conceptos)
				* 121 / 100;
	}

	public Factura(String nombre_comprador, String condicion_de_venta, int cantidad_dias, double monto_minibar,
			double monto_habitacion, double otros_conceptos, double descuento) {
		this.nombre_comprador = nombre_comprador;
		cuit_comprador = "0";
		domicilio_comprador = " ";
		this.condicion_de_venta = condicion_de_venta;
		this.cantidad_dias = cantidad_dias;
		comprador_condicion_frente_al_iva = "consumidor final";
		fecha_de_emision = new Date();
		this.monto_minibar = monto_minibar;
		this.monto_habitacion = monto_habitacion;
		this.otros_conceptos = otros_conceptos;
		this.descuento = descuento;
		if (comprador_condicion_frente_al_iva.equals("responsable inscripto")) {
			tipo = 'A';
		} else {
			tipo = 'B';
		}
		monto_total = ((monto_minibar + (cantidad_dias * monto_habitacion * (1 - (descuento / 100))) + otros_conceptos)
				* 1.21);

	}

	// Metodos
	public String getNombre_comprador() {
		return nombre_comprador;
	}

	public void setNombre_comprador(String nombre_comprador) {
		this.nombre_comprador = nombre_comprador;
	}

	public String getCuit_comprador() {
		return cuit_comprador;
	}

	public void setCuit_comprador(String cuit_comprador) {
		this.cuit_comprador = cuit_comprador;
	}

	public String getDomicilio_comprador() {
		return domicilio_comprador;
	}

	public void setDomicilio_comprador(String domicilio_comprador) {
		this.domicilio_comprador = domicilio_comprador;
	}

	public String getCondicion_de_venta() {
		return condicion_de_venta;
	}

	public void setCondicion_de_venta(String condicion_de_venta) {
		this.condicion_de_venta = condicion_de_venta;
	}

	public String getComprador_condicion_frente_al_iva() {
		return comprador_condicion_frente_al_iva;
	}

	public void setComprador_condicion_frente_al_iva(String comprador_condicion_frente_al_iva) {
		this.comprador_condicion_frente_al_iva = comprador_condicion_frente_al_iva;
	}

	public int getNro_de_compra() {
		return nro_de_compra;
	}

	public void setNro_de_compra(int nro_de_compra) {
		this.nro_de_compra = nro_de_compra;
	}

	public Date getFecha_de_emision() {
		return fecha_de_emision;
	}

	public void setFecha_de_emision(Date fecha_de_emision) {
		this.fecha_de_emision = fecha_de_emision;
	}

	public double getMonto_minibar() {
		return monto_minibar;
	}

	public void setMonto_minibar(double monto_minibar) {
		this.monto_minibar = monto_minibar;
	}

	public double getMonto_habitacion() {
		return monto_habitacion;
	}

	public void setMonto_habitacion(double monto_habitacion) {
		this.monto_habitacion = monto_habitacion;
	}

	public double getOtros_conceptos() {
		return otros_conceptos;
	}

	public void setOtros_conceptos(double otros_conceptos) {
		this.otros_conceptos = otros_conceptos;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public double getMonto_total() {
		return monto_total;
	}

	public void setMonto_total(double monto_total) {
		this.monto_total = monto_total;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public int getCantidad_dias() {
		return cantidad_dias;
	}

	public void setCantidad_dias(int cantidad_dias) {
		this.cantidad_dias = cantidad_dias;
	}
	
	//datos fijos
	
	

	public void imprimirFactura() {
		System.out.println(" Datos de la empresa\n\n Nombre empresa:" + Nombre_empresa + "\n Razon social:"
				+ Razon_social + "\n Numero de cuit:" + Numero_cuit + "\n Ingresos brutos:" + ingresos_brutos
				+ "\n Direccion:" + direccion + "\n Condicion frente al iva:" + condicion_frente_al_iva
				+ "\n Fecha de inicio de actividades:" + Fecha_de_inicio_de_actividades + "\n Punto de venta:"
				+ punto_de_venta + "\n\nDatos comprador\n\n Nombre comprador:" + nombre_comprador + "\n Cuit comprador:"
				+ cuit_comprador + "\n Domicilio comprador:" + domicilio_comprador + "\n Condicion de venta:"
				+ condicion_de_venta + "\n Condicion comprador frente al IVA: " + comprador_condicion_frente_al_iva
				+ "\n" + "\n Datos de la compra\n\n Numero de compra:" + nro_de_compra + "\n Dia:"
				+ formato.format(fecha_de_emision) + "\n Monto minibar:" + monto_minibar + "\n Cantidad de dias: "
				+ cantidad_dias + "\n Monton habitacion: " + monto_habitacion + "\n Otros conceptos: " + otros_conceptos
				+ "\n Descuento: " + descuento + "\n Tipo:" + tipo + "\n Monto total:" + monto_total);
	}
	
	public String getNombre_empresa() {
		return Nombre_empresa;
	}

	public String getRazon_social() {
		return Razon_social;
	}

	public String getNumero_cuit() {
		return Numero_cuit;
	}

	public String getIngresos_brutos() {
		return ingresos_brutos;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getCondicion_frente_al_iva() {
		return condicion_frente_al_iva;
	}

	public String getFecha_de_inicio_de_actividades() {
		return Fecha_de_inicio_de_actividades;
	}

	public int getPunto_de_venta() {
		return punto_de_venta;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	
	public JSONObject pasarA_Json () {
		JSONObject A= new JSONObject ();
		String datando=formato.format(getFecha_de_emision());
		try {
			A.put("Nombre de la empresa: ", getNombre_empresa());
			A.put("Razon social: ", getRazon_social());
			A.put("Numero de cuit", getNumero_cuit());
			A.put("Ingresos brutos:", getIngresos_brutos());
			A.put("Direccion: ", getDireccion());
			A.put("Condicion frente al IVA: ", getCondicion_frente_al_iva());
			A.put("Fecha de inicio de actividades", getFecha_de_inicio_de_actividades());
			A.put("Punto de venta", getPunto_de_venta());
			A.put("Nombre del comprador", getNombre_comprador());
			A.put("Cuit comprador: ", getCuit_comprador());
			A.put("Domicilio comprador: ", getDomicilio_comprador());
			A.put("Condicion de venta: ", getCondicion_de_venta());
			A.put("Comprador condicion frente al IVA: ", getComprador_condicion_frente_al_iva());
			A.put("Numero de compra: ", getNro_de_compra());
			A.put("Fecha de emision",datando);
			A.put("Monto minibar: ", getMonto_minibar());
			A.put("Cantidad de dias: ", getCantidad_dias());
			A.put("Monto de la habitacion: ", getMonto_habitacion());
			A.put("Otros conceptos: ", getOtros_conceptos());
			A.put("Descuento: ", getMonto_total());
			A.put("Tipo de factura: ", getTipo());
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return A;	
		
	}
	
}