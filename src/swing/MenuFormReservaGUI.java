package swing;

import domain.Pasajero;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuFormReservaGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JTextField txtApellido;
	private JLabel lblDni;
	private JTextField txtDni;
	private JLabel lblNumTarjCredito;
	private JTextField txtNumTarjCredito;
	private JLabel lblTelefono;
	private JTextField txtTelefono;
	private JLabel lblNacionalidad;
	private JTextField txtNacionalidad;
	private JLabel lbl_idPasajero;
	private JTextField txtIdPasajero;
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
		
		txtNombre = new JTextField();
		txtNombre.setBounds(162, 15, 438, 37);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(10, 15, 142, 37);
		panel.add(lblNombre);
		
		lblApellido = new JLabel("Apellido: ");
		lblApellido.setBounds(10, 63, 142, 37);
		panel.add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(162, 63, 438, 37);
		panel.add(txtApellido);
		
		lblDni = new JLabel("Dni: ");
		lblDni.setBounds(10, 111, 142, 37);
		panel.add(lblDni);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(162, 111, 438, 37);
		panel.add(txtDni);
		
		lblNumTarjCredito = new JLabel("Num tarjeta credito: ");
		lblNumTarjCredito.setBounds(10, 159, 142, 37);
		panel.add(lblNumTarjCredito);
		
		txtNumTarjCredito = new JTextField();
		txtNumTarjCredito.setColumns(10);
		txtNumTarjCredito.setBounds(162, 159, 438, 37);
		panel.add(txtNumTarjCredito);
		
		lblTelefono = new JLabel("Telefono: ");
		lblTelefono.setBounds(10, 207, 142, 37);
		panel.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(162, 207, 438, 37);
		panel.add(txtTelefono);
		
		lblNacionalidad = new JLabel("Nacionalidad: ");
		lblNacionalidad.setBounds(10, 255, 142, 37);
		panel.add(lblNacionalidad);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setColumns(10);
		txtNacionalidad.setBounds(162, 255, 438, 37);
		panel.add(txtNacionalidad);
		
		lbl_idPasajero = new JLabel("id Pasajero: ");
		lbl_idPasajero.setBounds(10, 303, 142, 37);
		panel.add(lbl_idPasajero);
		
		txtIdPasajero = new JTextField();
		txtIdPasajero.setColumns(10);
		txtIdPasajero.setBounds(162, 303, 438, 37);
		panel.add(txtIdPasajero);
		
		btnAceptar = new JButton("Aceptar ");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pasajero p = devuelvePasajeroCargado();
				dispose();
			}
		});
		btnAceptar.setBounds(10, 446, 267, 58);
		panel.add(btnAceptar);
	}

	public Pasajero devuelvePasajeroCargado(){
		Pasajero pasajero = new Pasajero();
		String nombre = txtNombre.getText();
		String apellido = txtNombre.getText();
		String dni = txtNombre.getText();
		String numTarjCredito = txtNombre.getText();
		String telefono = txtNombre.getText();
		String nacionalidad = txtNacionalidad.getText();
		int idPasajero = 22;

		pasajero.setNombre(nombre);
		pasajero.setApellido(apellido);
		pasajero.setDni(dni);
		pasajero.setNumTarjetaCredito(numTarjCredito);
		pasajero.setTelefono(telefono);
		pasajero.setNacionalidad(nacionalidad);
		pasajero.setIdPasajero(idPasajero);

		return pasajero;
	}

}
