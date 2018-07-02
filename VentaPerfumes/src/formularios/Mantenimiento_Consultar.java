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
import javax.swing.border.LineBorder;
import java.awt.SystemColor;

public class Mantenimiento_Consultar extends JFrame implements ActionListener {

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
	private JLabel lblMantenimientoconsultar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mantenimiento_Consultar frame = new Mantenimiento_Consultar();
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
	public Mantenimiento_Consultar() {
		setTitle("Consultar Perfume");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Mantenimiento_Consultar.class.getResource("/icons/Buscar30px_1.png")));
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
		txtCasa.setEditable(false);
		txtCasa.setColumns(10);
		txtCasa.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtCasa.setBackground(Color.WHITE);
		txtCasa.setBounds(142, 428, 155, 26);
		contentPane.add(txtCasa);
		
		lblS = new JLabel("S/.");
		lblS.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		lblS.setBounds(118, 178, 18, 20);
		contentPane.add(lblS);
		
		txtPrecio = new JTextField();
		txtPrecio.setText(BDPerfumes.precio0+"");
		txtPrecio.setBackground(new Color(255, 255, 255));
		txtPrecio.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtPrecio.setHorizontalAlignment(SwingConstants.LEFT);
		txtPrecio.setEditable(false);
		txtPrecio.setForeground(new Color(0, 0, 128));
		txtPrecio.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		txtPrecio.setBounds(142, 177, 155, 26);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		cboNombre = new JComboBox();
		cboNombre.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		cboNombre.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 14));
		cboNombre.setBackground(new Color(255, 255, 255));
		cboNombre.setForeground(new Color(0, 0, 153));
		cboNombre.addActionListener(this);
		cboNombre.setModel(new DefaultComboBoxModel(new String[] {"ALCAZAR", "ALLURE", "AQUA RUSH", "ENVY", "ALAIA"}));
		cboNombre.setBounds(142, 89, 124, 20);
		contentPane.add(cboNombre);
		
		label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(Mantenimiento_Consultar.class.getResource("/icons/Perfume30px.png")));
		label.setBounds(107, 74, 39, 50);
		contentPane.add(label);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblNombre.setBounds(120, 64, 76, 14);
		contentPane.add(lblNombre);
		
		lblPrecio = new JLabel("Precio ");
		lblPrecio.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblPrecio.setBounds(118, 149, 76, 14);
		contentPane.add(lblPrecio);
		
		lblContenido = new JLabel("Contenido");
		lblContenido.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblContenido.setBounds(118, 238, 76, 14);
		contentPane.add(lblContenido);
		
		txtContenido = new JTextField();
		txtContenido.setText(BDPerfumes.contenido0+"");
		txtContenido.setHorizontalAlignment(SwingConstants.LEFT);
		txtContenido.setForeground(new Color(0, 0, 128));
		txtContenido.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		txtContenido.setEditable(false);
		txtContenido.setColumns(10);
		txtContenido.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtContenido.setBackground(Color.WHITE);
		txtContenido.setBounds(142, 263, 155, 26);
		contentPane.add(txtContenido);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Mantenimiento_Consultar.class.getResource("/icons/Contenido30px.png")));
		label_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		label_1.setBounds(114, 260, 32, 30);
		contentPane.add(label_1);
		
		txtLanzamiento = new JTextField();
		txtLanzamiento.setText(BDPerfumes.año0+"");
		txtLanzamiento.setHorizontalAlignment(SwingConstants.LEFT);
		txtLanzamiento.setForeground(new Color(0, 0, 128));
		txtLanzamiento.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		txtLanzamiento.setEditable(false);
		txtLanzamiento.setColumns(10);
		txtLanzamiento.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtLanzamiento.setBackground(Color.WHITE);
		txtLanzamiento.setBounds(142, 349, 155, 26);
		contentPane.add(txtLanzamiento);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Mantenimiento_Consultar.class.getResource("/icons/calendario.png")));
		label_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		label_2.setBounds(107, 340, 39, 35);
		contentPane.add(label_2);
		
		lblAoDeLanzamiento = new JLabel("A\u00F1o de lanzamiento");
		lblAoDeLanzamiento.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblAoDeLanzamiento.setBounds(118, 324, 124, 14);
		contentPane.add(lblAoDeLanzamiento);
		
		lblCasa = new JLabel("Casa");
		lblCasa.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblCasa.setBounds(120, 407, 76, 14);
		contentPane.add(lblCasa);
		
		label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Mantenimiento_Consultar.class.getResource("/icons/casa30px_1.png")));
		label_3.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		label_3.setBounds(107, 429, 29, 25);
		contentPane.add(label_3);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setForeground(new Color(255, 255, 255));
		btnCerrar.setFont(new Font("Yu Gothic UI", Font.ITALIC, 14));
		btnCerrar.setBackground(new Color(0, 128, 0));
		btnCerrar.setBounds(390, 58, 147, 26);
		contentPane.add(btnCerrar);
		
		lblMantenimientoconsultar = new JLabel("Mantenimiento/Consultar");
		lblMantenimientoconsultar.setForeground(SystemColor.textInactiveText);
		lblMantenimientoconsultar.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblMantenimientoconsultar.setBounds(29, 11, 456, 26);
		contentPane.add(lblMantenimientoconsultar);
	}
	public void actionPerformed(ActionEvent arg0) {
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
			break;
		case 1:
			txtPrecio.setText(BDPerfumes.precio1+"");
			txtLanzamiento.setText(BDPerfumes.año1+"");
			txtContenido.setText(BDPerfumes.contenido1+"");
			txtCasa.setText(BDPerfumes.casa1+"");
			break;
		case 2:
			txtPrecio.setText(BDPerfumes.precio2+"");
			txtLanzamiento.setText(BDPerfumes.año2+"");
			txtContenido.setText(BDPerfumes.contenido2+"");
			txtCasa.setText(BDPerfumes.casa2+"");
			break;
		case 3:
			txtPrecio.setText(BDPerfumes.precio3+"");
			txtLanzamiento.setText(BDPerfumes.año3+"");
			txtContenido.setText(BDPerfumes.contenido3+"");
			txtCasa.setText(BDPerfumes.casa4+"");
			break;
		case 4:
			txtPrecio.setText(BDPerfumes.precio4+"");
			txtLanzamiento.setText(BDPerfumes.año4+"");
			txtContenido.setText(BDPerfumes.contenido4+"");
			txtCasa.setText(BDPerfumes.casa4+"");
			break;
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		this.setVisible(false);
	}
}
