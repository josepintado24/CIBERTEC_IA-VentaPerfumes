package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AcercaTienda extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblBienvenidosATienda;
	private JSeparator separator;
	private JLabel lblFloresGonzalesCesar;
	private JLabel lblTorresHuamanzanaDayely;
	private JLabel lblZrateCamposCristian;
	private JLabel lblAutores;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcercaTienda frame = new AcercaTienda();
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
	public AcercaTienda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 416);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlightText);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblBienvenidosATienda = new JLabel("Bienvenidos a Tienda 01");
		lblBienvenidosATienda.setForeground(SystemColor.controlText);
		lblBienvenidosATienda.setFont(new Font("Yu Gothic UI", Font.PLAIN, 26));
		lblBienvenidosATienda.setBounds(41, 27, 298, 47);
		contentPane.add(lblBienvenidosATienda);
		
		separator = new JSeparator();
		separator.setBounds(41, 83, 303, 2);
		contentPane.add(separator);
		
		lblFloresGonzalesCesar = new JLabel("Flores Gonzales Cesar Jefferson");
		lblFloresGonzalesCesar.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblFloresGonzalesCesar.setBounds(109, 148, 230, 35);
		contentPane.add(lblFloresGonzalesCesar);
		
		lblTorresHuamanzanaDayely = new JLabel("Torres Huamanzana Dayely Yessica\r\n");
		lblTorresHuamanzanaDayely.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblTorresHuamanzanaDayely.setBounds(96, 175, 243, 35);
		contentPane.add(lblTorresHuamanzanaDayely);
		
		lblZrateCamposCristian = new JLabel("Z\u00E1rate Campos Cristian");
		lblZrateCamposCristian.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblZrateCamposCristian.setBounds(122, 205, 187, 35);
		contentPane.add(lblZrateCamposCristian);
		
		lblAutores = new JLabel("Autores");
		lblAutores.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		lblAutores.setBounds(158, 85, 65, 35);
		contentPane.add(lblAutores);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(349, 11, 359, 394);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(AcercaTienda.class.getResource("/wallpapers/Final.png")));
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setForeground(Color.WHITE);
		btnSalir.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		btnSalir.setBackground(SystemColor.activeCaptionBorder);
		btnSalir.setBounds(192, 379, 147, 26);
		contentPane.add(btnSalir);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSalir) {
			actionPerformedBtnSalir(e);
		}
	}
	protected void actionPerformedBtnSalir(ActionEvent e) {
		this.setVisible(false);
	}
}
