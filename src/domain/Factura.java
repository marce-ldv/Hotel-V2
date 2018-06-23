package domain;

import java.util.Date;

public class Factura {

	//Datos del vendedor (hotel)
	private final String Nombre_empresa= "Trivago";
	private final String Razon_social= "Trivago S.A";
	private final String Numero_cuit= "30690009964";
	private final String ingresos_brutos= "30-69000996-4";
	private final String direccion ="Colon 1234";
	private final String condicion_frente_al_iva= "responsable inscripto";
	private final String Fecha_de_inicio_de_actividades="06/06/2018";
	private final int punto_de_venta=001;
	//Datos del comprador
	private String nombre_comprador;
	private String cuit_comprador;
	private String domicilio_comprador;
	private String condicion_de_venta;
	private String comprador_condicion_frente_al_iva;
	//	
	private static int Index=0;
	private int nro_de_compra;
	private Date fecha_de_emision;
	private double monto_minibar;
	private double monto_habitacion;
	private double otros_conceptos;
	private int descuento;
	private double monto_total;
	private char tipo;

	
	public Factura(String nombre_comprador, String cuit_comprador, String domicilio_comprador,
			String condicion_de_venta, String comprador_condicion_frente_al_iva, int nro_de_compra,
			Date fecha_de_emision, double monto_minibar, double monto_habitacion, double otros_conceptos, int descuento,
			char tipo) {
		this.nombre_comprador = nombre_comprador;
		this.cuit_comprador = cuit_comprador;
		this.domicilio_comprador = domicilio_comprador;
		this.condicion_de_venta = condicion_de_venta;
		this.comprador_condicion_frente_al_iva = comprador_condicion_frente_al_iva;
		this.nro_de_compra = nro_de_compra;
		fecha_de_emision= new Date ();
		this.monto_minibar = monto_minibar;
		this.monto_habitacion = monto_habitacion;
		this.otros_conceptos = otros_conceptos;
		this.descuento = descuento;
		this.tipo = tipo;
		monto_total=(monto_minibar+(monto_habitacion*(1-descuento/100))+otros_conceptos)*121/100;
	}
	
}
