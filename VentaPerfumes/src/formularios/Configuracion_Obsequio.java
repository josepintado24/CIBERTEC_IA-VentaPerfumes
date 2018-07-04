package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import datosProyecto.BDPerfumes;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Configuracion_Obsequio extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtCantidad;
	private JTextField txtObsequio;
	private JButton btnGuardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Configuracion_Obsequio frame = new Configuracion_Obsequio();
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
	public Configuracion_Obsequio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(117, 29, 86, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		txtObsequio = new JTextField();
		txtObsequio.setBounds(117, 86, 86, 20);
		contentPane.add(txtObsequio);
		txtObsequio.setColumns(10);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(this);
		btnGuardar.setBounds(117, 154, 89, 23);
		contentPane.add(btnGuardar);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnGuardar) {
			actionPerformedBtnGuardar(arg0);
		}
	}
	protected void actionPerformedBtnGuardar(ActionEvent arg0) {
		
		
		try {
			int importeObsequio=Integer.parseInt(txtCantidad.getText());
			String obsequio=txtObsequio.getText();
			BDPerfumes.importeMinimoObsequiable=importeObsequio;
			BDPerfumes.obsequio=obsequio;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Mensaje dentro de la ventana", "Mensaje en la barra de titulo", JOptionPane.WARNING_MESSAGE);
		}
		
	}
}
