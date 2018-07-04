package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import datosProyecto.*;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;

public class Mantenimiento_Modificar extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtPrecio;
	private JComboBox cboNombre;
	private JLabel label;
	private JLabel lblNombre;
	private JLabel lblPrecio;
	private JLabel lblContenido;
	private JLabel lblS;
	private JTextField txtContenido;
	private JLabel label_1;
	private JTextField txtLanzamiento;
	private JLabel label_2;
	private JLabel lblAoDeLanzamiento;
	private JLabel lblCasa;
	private JLabel label_3;
	private JTextField txtCasa;
	private JButton btnCerrar;
	private JButton btnGuardar;
	private JLabel lblNewLabel;
	private JLabel lblMensaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mantenimiento_Modificar frame = new Mantenimiento_Modificar();
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
	public Mantenimiento_Modificar() {
		setTitle("Consultar Perfume");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Mantenimiento_Modificar.class.getResource("/icons/Buscar30px_1.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 509);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCasa = new JTextField();
		txtCasa.setText(BDPerfumes.casa0);
		txtCasa.setHorizontalAlignment(SwingConstants.LEFT);
		txtCasa.setForeground(new Color(0, 0, 128));
		txtCasa.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		txtCasa.setColumns(10);
		txtCasa.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtCasa.setBackground(Color.WHITE);
		txtCasa.setBounds(144, 387, 155, 26);
		contentPane.add(txtCasa);
		
		lblS = new JLabel("S/.");
		lblS.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		lblS.setBounds(122, 148, 18, 20);
		contentPane.add(lblS);
		
		txtPrecio = new JTextField();
		txtPrecio.setText(BDPerfumes.precio0+"");
		txtPrecio.setBackground(new Color(255, 255, 255));
		txtPrecio.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtPrecio.setHorizontalAlignment(SwingConstants.LEFT);
		txtPrecio.setForeground(new Color(0, 0, 128));
		txtPrecio.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		txtPrecio.setBounds(146, 147, 155, 26);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		cboNombre = new JComboBox();
		cboNombre.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		cboNombre.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 14));
		cboNombre.setBackground(new Color(255, 255, 255));
		cboNombre.setForeground(new Color(0, 0, 153));
		cboNombre.addActionListener(this);
		cboNombre.setModel(new DefaultComboBoxModel(new String[] {"ALCAZAR", "ALLURE", "AQUA RUSH", "ENVY", "ALAIA"}));
		cboNombre.setBounds(144, 72, 124, 20);
		contentPane.add(cboNombre);
		
		label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(Mantenimiento_Modificar.class.getResource("/icons/Perfume30px.png")));
		label.setBounds(109, 57, 39, 50);
		contentPane.add(label);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblNombre.setBounds(122, 47, 76, 14);
		contentPane.add(lblNombre);
		
		lblPrecio = new JLabel("Precio ");
		lblPrecio.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblPrecio.setBounds(120, 108, 76, 14);
		contentPane.add(lblPrecio);
		
		lblContenido = new JLabel("Contenido");
		lblContenido.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblContenido.setBounds(120, 197, 76, 14);
		contentPane.add(lblContenido);
		
		txtContenido = new JTextField();
		txtContenido.setText(BDPerfumes.contenido0+"");
		txtContenido.setHorizontalAlignment(SwingConstants.LEFT);
		txtContenido.setForeground(new Color(0, 0, 128));
		txtContenido.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		txtContenido.setColumns(10);
		txtContenido.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtContenido.setBackground(Color.WHITE);
		txtContenido.setBounds(144, 222, 155, 26);
		contentPane.add(txtContenido);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Mantenimiento_Modificar.class.getResource("/icons/Contenido30px.png")));
		label_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		label_1.setBounds(116, 219, 32, 30);
		contentPane.add(label_1);
		
		txtLanzamiento = new JTextField();
		txtLanzamiento.setText(BDPerfumes.año0+"");
		txtLanzamiento.setHorizontalAlignment(SwingConstants.LEFT);
		txtLanzamiento.setForeground(new Color(0, 0, 128));
		txtLanzamiento.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		txtLanzamiento.setColumns(10);
		txtLanzamiento.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtLanzamiento.setBackground(Color.WHITE);
		txtLanzamiento.setBounds(144, 308, 155, 26);
		contentPane.add(txtLanzamiento);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Mantenimiento_Modificar.class.getResource("/icons/calendario.png")));
		label_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		label_2.setBounds(109, 299, 39, 35);
		contentPane.add(label_2);
		
		lblAoDeLanzamiento = new JLabel("A\u00F1o de lanzamiento");
		lblAoDeLanzamiento.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblAoDeLanzamiento.setBounds(120, 283, 124, 14);
		contentPane.add(lblAoDeLanzamiento);
		
		lblCasa = new JLabel("Casa");
		lblCasa.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblCasa.setBounds(122, 366, 76, 14);
		contentPane.add(lblCasa);
		
		label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Mantenimiento_Modificar.class.getResource("/icons/casa30px_1.png")));
		label_3.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		label_3.setBounds(109, 388, 29, 25);
		contentPane.add(label_3);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setForeground(new Color(255, 255, 255));
		btnCerrar.setFont(new Font("Yu Gothic UI", Font.ITALIC, 14));
		btnCerrar.setBackground(new Color(0, 128, 0));
		btnCerrar.setBounds(382, 68, 147, 26);
		contentPane.add(btnCerrar);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(this);
		btnGuardar.setForeground(Color.WHITE);
		btnGuardar.setFont(new Font("Yu Gothic UI", Font.ITALIC, 14));
		btnGuardar.setBackground(SystemColor.activeCaption);
		btnGuardar.setBounds(109, 442, 203, 26);
		contentPane.add(btnGuardar);
		
		lblNewLabel = new JLabel("Mantenimiento/Modificar");
		lblNewLabel.setForeground(SystemColor.textInactiveText);
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblNewLabel.setBounds(38, 11, 456, 26);
		contentPane.add(lblNewLabel);
		
		lblMensaje = new JLabel("");
		lblMensaje.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		lblMensaje.setBounds(109, 479, 397, 19);
		contentPane.add(lblMensaje);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnGuardar) {
			actionPerformedBtnGuardar(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
		if (arg0.getSource() == cboNombre) {
			actionPerformedCboNombre(arg0);
		}
	}
	int indiceCombo(){
		return cboNombre.getSelectedIndex();
	}
	protected void actionPerformedCboNombre(ActionEvent arg0) {
		switch (indiceCombo()) {
		case 0:
			txtPrecio.setText(BDPerfumes.precio0+"");
			txtLanzamiento.setText(BDPerfumes.año0+"");
			txtContenido.setText(BDPerfumes.contenido0+"");
			txtCasa.setText(BDPerfumes.casa0+"");
			limpiarMensaje();
			break;
		case 1:
			txtPrecio.setText(BDPerfumes.precio1+"");
			txtLanzamiento.setText(BDPerfumes.año1+"");
			txtContenido.setText(BDPerfumes.contenido1+"");
			txtCasa.setText(BDPerfumes.casa1+"");
			limpiarMensaje();
			break;
		case 2:
			txtPrecio.setText(BDPerfumes.precio2+"");
			txtLanzamiento.setText(BDPerfumes.año2+"");
			txtContenido.setText(BDPerfumes.contenido2+"");
			txtCasa.setText(BDPerfumes.casa2+"");
			limpiarMensaje();
			break;
		case 3:
			txtPrecio.setText(BDPerfumes.precio3+"");
			txtLanzamiento.setText(BDPerfumes.año3+"");
			txtContenido.setText(BDPerfumes.contenido3+"");
			txtCasa.setText(BDPerfumes.casa4+"");
			limpiarMensaje();
			break;
		case 4:
			txtPrecio.setText(BDPerfumes.precio4+"");
			txtLanzamiento.setText(BDPerfumes.año4+"");
			txtContenido.setText(BDPerfumes.contenido4+"");
			txtCasa.setText(BDPerfumes.casa4+"");
			limpiarMensaje();
			break;
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		this.setVisible(false);
	}
	void limpiarMensaje(){
		lblMensaje.setText("");
	}
	protected void actionPerformedBtnGuardar(ActionEvent arg0) {
		try {
			switch (indiceCombo()) {
			case 0:
				BDPerfumes.precio0=Double.parseDouble(txtPrecio.getText());
				BDPerfumes.contenido0=Double.parseDouble(txtContenido.getText());
				BDPerfumes.año0=Integer.parseInt(txtLanzamiento.getText());
				BDPerfumes.casa0=txtCasa.getText();
				
				break;
			case 1:
				BDPerfumes.precio1=Double.parseDouble(txtPrecio.getText());
				BDPerfumes.contenido1=Double.parseDouble(txtContenido.getText());
				BDPerfumes.año1=Integer.parseInt(txtLanzamiento.getText());
				BDPerfumes.casa1=txtCasa.getText();
				
				break;
			case 2:
				BDPerfumes.precio2=Double.parseDouble(txtPrecio.getText());
				BDPerfumes.contenido2=Double.parseDouble(txtContenido.getText());
				BDPerfumes.año2=Integer.parseInt(txtLanzamiento.getText());
				BDPerfumes.casa2=txtCasa.getText();
				
				break;
			case 3:
				BDPerfumes.precio3=Double.parseDouble(txtPrecio.getText());
				BDPerfumes.contenido3=Double.parseDouble(txtContenido.getText());
				BDPerfumes.año3=Integer.parseInt(txtLanzamiento.getText());
				BDPerfumes.casa3=txtCasa.getText();
				
				break;
			case 4:
				BDPerfumes.precio4=Double.parseDouble(txtPrecio.getText());
				BDPerfumes.contenido4=Double.parseDouble(txtContenido.getText());
				BDPerfumes.año4=Integer.parseInt(txtLanzamiento.getText());
				BDPerfumes.casa4=txtCasa.getText();
				
				break;
			}
			lblMensaje.setText("Datos guardados con exito");
		} catch (Exception e) {
			lblMensaje.setText("Ingrese información correcta");
		}
		
		
		
		
	}
}
