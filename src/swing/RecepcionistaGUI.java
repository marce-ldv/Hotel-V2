package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.xml.ws.Holder;

import domain.Habitacion;
import domain.Hotel;
import domain.Pasajero;
import domain.Recepcionista;
import exepciones.LimiteExcepcion;

public class RecepcionistaGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecepcionistaGUI frame = new RecepcionistaGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RecepcionistaGUI() {

		Recepcionista recepcionista = new Recepcionista();
		Pasajero pasajero = new Pasajero();
		Hotel hotel = new Hotel();
		Habitacion habitacion = new Habitacion();
		MenuFormReservaGUI formReservaGUI = new MenuFormReservaGUI();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Recepcionista");
		setBounds(0, 0, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Agregar reserva");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"Este boton agrega una reserva");


		
				//form pasajero
			Pasajero pasajero=new Pasajero("pepe", "benitez", "2323234", "32432422", "6756754456","Venezuela", 1);
				//formReservaGUI.setVisible(true);
				hotel.reservar_Habitacion(pasajero);
				//Pasajero pasajeroCargado = formReservaGUI.devuelvePasajeroCargado();

				//hotel.reservar_Habitacion(cargarPasajeroScanner());
				JOptionPane.showMessageDialog(null,"El pasajero se agrego exitosamente");
				//hotel.reservar_Habitacion(new Pasajero("peasdpe", "benisadtez", "234567", "32432422", "6756754456","Peru", 2));
				try{
					hotel.listar_Habitaciones_Ocupadas();
				} catch(Exception e){
					e.printStackTrace();
				}
				System.out.println("lista la reserva?");
				//hotel.listarReservaPasajero(pasajero);
				hotel.listarMapReservas();
				hotel.llegada_Pasajero_Al_hotel(pasajero);
				hotel.fin_Estadia(pasajero);
				/*hotel.cancelarReserva(pasajero);
				System.out.println("sera eliminada?");
				hotel.listarReservaPasajero(pasajero);*/
			}
		});
		btnNewButton.setBounds(22, 41, 406, 41);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("Listar Reserva");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Este boton lista una reserva");
			}
		});
		button.setBounds(22, 93, 406, 41);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Cancelar reserva");
		button_1.setBounds(22, 145, 406, 41);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Ver habitaciones disponibles");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,"Este boton comprueba habitaciones disponibles");
				try {
					hotel.listar_Habitaciones_Disponibles();
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_2.setBounds(22, 249, 406, 41);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Finalizar estadia");
		button_3.setBounds(22, 353, 406, 41);
		contentPane.add(button_3);
		
		
		JButton button_4 = new JButton("Calcular costo total");
		button_4.setBounds(22, 301, 406, 41);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("Agregar habitacion");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//hotel.add(habitacion);
				JOptionPane.showMessageDialog(null,"Este boton agrega una habitacion");
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
				try {
		
					//hotel.agregarHabitacionesManualmente();
					hotel.add(habitacion);
					hotel.listarHabitaciones();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_5.setBounds(22, 197, 406, 41);
		contentPane.add(button_5);
	}

	public Pasajero cargarPasajeroScanner(){
		Scanner sc = new Scanner(System.in);
		Pasajero pasajero = new Pasajero();

		System.out.println("Nombre: ");
		pasajero.setNombre(sc.next());
		System.out.println("Apellido: ");
		pasajero.setApellido(sc.next());
		System.out.println("Dni: ");
		pasajero.setDni(sc.next());
		System.out.println("Num tarjeta de credito: ");
		pasajero.setNumTarjetaCredito(sc.next());
		System.out.println("Telefono: ");
		pasajero.setTelefono(sc.next());
		System.out.println("Nacionalidad: ");
		pasajero.setNacionalidad(sc.next());
		System.out.println("ID pasajero: ");
		pasajero.setIdPasajero(sc.nextInt());

		return pasajero;
	}
}
