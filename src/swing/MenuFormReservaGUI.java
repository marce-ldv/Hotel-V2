package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class MenuFormReservaGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JTextField textField_1;
	private JLabel lblDni;
	private JTextField textField_2;
	private JLabel lblNumTarjCredito;
	private JTextField textField_3;
	private JLabel lblTelefono;
	private JTextField textField_4;
	private JLabel lblNacionalidad;
	private JTextField textField_5;
	private JLabel lbl_idPasajero;
	private JTextField textField_6;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuFormReservaGUI frame = new MenuFormReservaGUI();
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
	public MenuFormReservaGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setTitle("Menu formulario de reserva de pasajero ");
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(162, 15, 438, 37);
		panel.add(textField);
		textField.setColumns(10);
		
		lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(10, 15, 142, 37);
		panel.add(lblNombre);
		
		lblApellido = new JLabel("Apellido: ");
		lblApellido.setBounds(10, 63, 142, 37);
		panel.add(lblApellido);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(162, 63, 438, 37);
		panel.add(textField_1);
		
		lblDni = new JLabel("Dni: ");
		lblDni.setBounds(10, 111, 142, 37);
		panel.add(lblDni);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(162, 111, 438, 37);
		panel.add(textField_2);
		
		lblNumTarjCredito = new JLabel("Num tarjeta credito: ");
		lblNumTarjCredito.setBounds(10, 159, 142, 37);
		panel.add(lblNumTarjCredito);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(162, 159, 438, 37);
		panel.add(textField_3);
		
		lblTelefono = new JLabel("Telefono: ");
		lblTelefono.setBounds(10, 207, 142, 37);
		panel.add(lblTelefono);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(162, 207, 438, 37);
		panel.add(textField_4);
		
		lblNacionalidad = new JLabel("Nacionalidad: ");
		lblNacionalidad.setBounds(10, 255, 142, 37);
		panel.add(lblNacionalidad);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(162, 255, 438, 37);
		panel.add(textField_5);
		
		lbl_idPasajero = new JLabel("id Pasajero: ");
		lbl_idPasajero.setBounds(10, 303, 142, 37);
		panel.add(lbl_idPasajero);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(162, 303, 438, 37);
		panel.add(textField_6);
		
		btnAceptar = new JButton("Aceptar ");
		btnAceptar.setBounds(10, 446, 267, 58);
		panel.add(btnAceptar);
	}


}
