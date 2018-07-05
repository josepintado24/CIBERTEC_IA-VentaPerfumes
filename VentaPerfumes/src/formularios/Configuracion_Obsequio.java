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
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class Configuracion_Obsequio extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtCantidad;
	private JTextField txtObsequio;
	private JButton btnGuardar;
	private JLabel lblNumeroDeCliente;
	private JButton button;
	private JLabel lblPremioSorpresa;
	private JLabel lblMensaje;
	private JLabel lblConfigurarObsequio;
	private JLabel label;
	private JLabel label_1;

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
		setBounds(100, 100, 684, 322);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlightText);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCantidad = new JTextField();
		txtCantidad.setText(""+BDPerfumes.importeMinimoObsequiable);
		txtCantidad.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		txtCantidad.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtCantidad.setBounds(222, 83, 184, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		txtObsequio = new JTextField();
		txtObsequio.setText(""+BDPerfumes.obsequio);
		txtObsequio.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		txtObsequio.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtObsequio.setBounds(222, 140, 184, 20);
		contentPane.add(txtObsequio);
		txtObsequio.setColumns(10);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setForeground(SystemColor.text);
		btnGuardar.setBackground(SystemColor.activeCaption);
		btnGuardar.addActionListener(this);
		btnGuardar.setBounds(222, 206, 184, 23);
		contentPane.add(btnGuardar);
		
		lblNumeroDeCliente = new JLabel("Importe a pagar m\u00ECnimo");
		lblNumeroDeCliente.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblNumeroDeCliente.setBounds(22, 83, 170, 14);
		contentPane.add(lblNumeroDeCliente);
		
		button = new JButton("Cerrar");
		button.addActionListener(this);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Yu Gothic UI", Font.ITALIC, 14));
		button.setBackground(new Color(0, 128, 0));
		button.setBounds(511, 36, 147, 26);
		contentPane.add(button);
		
		lblPremioSorpresa = new JLabel("obsequio");
		lblPremioSorpresa.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblPremioSorpresa.setBounds(22, 143, 139, 14);
		contentPane.add(lblPremioSorpresa);
		
		lblMensaje = new JLabel("");
		lblMensaje.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblMensaje.setBounds(425, 204, 185, 25);
		contentPane.add(lblMensaje);
		
		lblConfigurarObsequio = new JLabel("Configurar Obsequio");
		lblConfigurarObsequio.setForeground(SystemColor.textInactiveText);
		lblConfigurarObsequio.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblConfigurarObsequio.setBounds(22, 11, 456, 26);
		contentPane.add(lblConfigurarObsequio);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(Configuracion_Obsequio.class.getResource("/icons/precio_30px.png")));
		label.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		label.setBounds(416, 68, 43, 34);
		contentPane.add(label);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Configuracion_Obsequio.class.getResource("/icons/obsequio_30px.png")));
		label_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		label_1.setBounds(416, 126, 43, 34);
		contentPane.add(label_1);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == button) {
			actionPerformedButton(arg0);
		}
		if (arg0.getSource() == btnGuardar) {
			actionPerformedBtnGuardar(arg0);
		}
	}
	protected void actionPerformedBtnGuardar(ActionEvent arg0) {
		
		
		try {
			//int importeObsequio=Integer.parseInt(txtCantidad.getText());
			//String obsequio=txtObsequio.getText();
			BDPerfumes.importeMinimoObsequiable=Integer.parseInt(txtCantidad.getText());
			BDPerfumes.obsequio=txtObsequio.getText();
			lblMensaje.setText("Datos guardados");
		} catch (Exception e) {
			lblMensaje.setText("Ingrese datos correctos");
		}
		
	}
	protected void actionPerformedButton(ActionEvent arg0) {
		this.setVisible(false);
	}
}
