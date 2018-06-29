package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuAddReservaGUI extends JFrame {

	private JPanel contentPane;
	private JComboBox jcomboboxNumHabitacion;
	private JComboBox jcomboboxCantPersonas;
	private JButton btnNewButton;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAddReservaGUI frame = new MenuAddReservaGUI();
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
	public MenuAddReservaGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setTitle("Menu selector de Habitaciones y cantidad de Pasajeros");
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		//Tambien se puede hacer que el selector(jcombobox) muestre solo las habitaciones disponibles
		jcomboboxNumHabitacion = new JComboBox();
		jcomboboxNumHabitacion.setBounds(10, 48, 173, 20);
		jcomboboxNumHabitacion.addItem("1");
		jcomboboxNumHabitacion.addItem("2");
		jcomboboxNumHabitacion.addItem("3");
		jcomboboxNumHabitacion.addItem("4");
		jcomboboxNumHabitacion.addItem("5");
		jcomboboxNumHabitacion.addItem("6");
		jcomboboxNumHabitacion.addItem("7");
		jcomboboxNumHabitacion.addItem("8");
		jcomboboxNumHabitacion.addItem("9");
		jcomboboxNumHabitacion.addItem("10");
		jcomboboxNumHabitacion.addItem("11");
		jcomboboxNumHabitacion.addItem("12");
		jcomboboxNumHabitacion.addItem("13");
		jcomboboxNumHabitacion.addItem("14");
		jcomboboxNumHabitacion.addItem("15");
		jcomboboxNumHabitacion.addItem("16");
		jcomboboxNumHabitacion.addItem("17");
		jcomboboxNumHabitacion.addItem("18");
		jcomboboxNumHabitacion.addItem("19");
		jcomboboxNumHabitacion.addItem("20");
		jcomboboxNumHabitacion.addItem("21");
		jcomboboxNumHabitacion.addItem("22");
		jcomboboxNumHabitacion.addItem("23");
		jcomboboxNumHabitacion.addItem("24");
		jcomboboxNumHabitacion.addItem("25");
		jcomboboxNumHabitacion.addItem("26");
		jcomboboxNumHabitacion.addItem("27");
		jcomboboxNumHabitacion.addItem("28");
		jcomboboxNumHabitacion.addItem("29");
		jcomboboxNumHabitacion.addItem("30");
		panel.add(jcomboboxNumHabitacion);
		
		jcomboboxCantPersonas = new JComboBox();
		jcomboboxCantPersonas.setBounds(10, 115, 173, 20);
		jcomboboxCantPersonas.addItem("1");
		jcomboboxCantPersonas.addItem("2");
		jcomboboxCantPersonas.addItem("3");
		jcomboboxCantPersonas.addItem("4");
		jcomboboxCantPersonas.addItem("5");
		jcomboboxCantPersonas.addItem("6");
		jcomboboxCantPersonas.addItem("7");
		jcomboboxCantPersonas.addItem("8");
		jcomboboxCantPersonas.addItem("9");
		jcomboboxCantPersonas.addItem("10");
		jcomboboxCantPersonas.addItem("11");
		jcomboboxCantPersonas.addItem("12");
		panel.add(jcomboboxCantPersonas);
		
		JLabel lblNewLabel = new JLabel("Numero habitacion");
		lblNewLabel.setBounds(10, 11, 173, 25);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("Cantidad de personas");
		label.setBounds(10, 79, 173, 25);
		panel.add(label);
		
		btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numHab = getJcomboBoxNumHabitacion();
				int cantPers = getJcomboBoxCantPersonas();
				JOptionPane.showMessageDialog(null,"num hab "+numHab);
				JOptionPane.showMessageDialog(null,"cant pers "+cantPers);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 177, 160, 40);
		panel.add(btnNewButton);
	}
	
	public int getJcomboBoxNumHabitacion() {
		return this.jcomboboxNumHabitacion.getSelectedIndex();
	}
	
	public int getJcomboBoxCantPersonas() {
		return this.jcomboboxCantPersonas.getSelectedIndex();
	}
	
	
}
