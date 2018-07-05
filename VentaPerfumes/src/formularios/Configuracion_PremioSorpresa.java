package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import datosProyecto.BDPerfumes;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Configuracion_PremioSorpresa extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JButton button;
	private JLabel lblNmeroClientes;
	private JButton button_1;
	private JLabel lblPremioSorpresa;
	private JLabel lblMensaje;
	private JLabel lblConfigurarPremioSorpresa;
	private JLabel label_4;
	private JLabel label_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Configuracion_PremioSorpresa frame = new Configuracion_PremioSorpresa();
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
	public Configuracion_PremioSorpresa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 343);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlightText);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt1 = new JTextField();
		txt1.setText(""+BDPerfumes.numeroClienteSorpresa);
		txt1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		txt1.setColumns(10);
		txt1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txt1.setBounds(231, 94, 184, 20);
		contentPane.add(txt1);
		
		txt2 = new JTextField();
		txt2.setText(BDPerfumes.premioSorpresa);
		txt2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		txt2.setColumns(10);
		txt2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txt2.setBounds(231, 151, 184, 20);
		contentPane.add(txt2);
		
		button = new JButton("Guardar");
		button.addActionListener(this);
		button.setForeground(Color.WHITE);
		button.setBackground(SystemColor.activeCaption);
		button.setBounds(231, 217, 184, 23);
		contentPane.add(button);
		
		lblNmeroClientes = new JLabel("N\u00F9mero clientes");
		lblNmeroClientes.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblNmeroClientes.setBounds(31, 94, 170, 14);
		contentPane.add(lblNmeroClientes);
		
		button_1 = new JButton("Cerrar");
		button_1.addActionListener(this);
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Yu Gothic UI", Font.ITALIC, 14));
		button_1.setBackground(new Color(0, 128, 0));
		button_1.setBounds(520, 47, 147, 26);
		contentPane.add(button_1);
		
		lblPremioSorpresa = new JLabel("Premio Sorpresa");
		lblPremioSorpresa.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblPremioSorpresa.setBounds(31, 154, 139, 14);
		contentPane.add(lblPremioSorpresa);
		
		lblMensaje = new JLabel("");
		lblMensaje.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblMensaje.setBounds(434, 215, 185, 25);
		contentPane.add(lblMensaje);
		
		lblConfigurarPremioSorpresa = new JLabel("Configurar premio sorpresa");
		lblConfigurarPremioSorpresa.setForeground(SystemColor.textInactiveText);
		lblConfigurarPremioSorpresa.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblConfigurarPremioSorpresa.setBounds(31, 22, 456, 26);
		contentPane.add(lblConfigurarPremioSorpresa);
		
		label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Configuracion_PremioSorpresa.class.getResource("/icons/numeroClientes_30px.png")));
		label_4.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		label_4.setBounds(425, 79, 43, 34);
		contentPane.add(label_4);
		
		label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(Configuracion_PremioSorpresa.class.getResource("/icons/obsequio_30px.png")));
		label_5.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		label_5.setBounds(425, 137, 43, 34);
		contentPane.add(label_5);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			actionPerformedButton(e);
		}
		if (e.getSource() == button_1) {
			actionPerformedButton_1(e);
		}
	}
	protected void actionPerformedButton_1(ActionEvent e) {
		this.setVisible(false);
	}
	protected void actionPerformedButton(ActionEvent e) {
		try {
			BDPerfumes.numeroClienteSorpresa=Integer.parseInt(txt1.getText());
			BDPerfumes.premioSorpresa=txt2.getText();
			lblMensaje.setText("Datos guardados");
		} catch (Exception e2) {
			// TODO: handle exception
			lblMensaje.setText("Datos incorrectos");
		}
	}
}
