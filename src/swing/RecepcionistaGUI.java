package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
				hotel.reservar_Habitacion(pasajero);
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
				} catch (LimiteExcepcion e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
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
				hotel.agregarHabitacionesManualmente();
			}
		});
		button_5.setBounds(22, 197, 406, 41);
		contentPane.add(button_5);
	}
}
