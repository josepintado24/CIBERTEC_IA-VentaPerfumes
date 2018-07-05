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
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class Configuracion_CantidadOptimaPerfume extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txt1;
	private JButton button;
	private JLabel lblCantidadptimaDe;
	private JButton button_1;
	private JLabel lblMensaje;
	private JLabel lblConfigurarCantidadptima;
	private JLabel label_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Configuracion_CantidadOptimaPerfume frame = new Configuracion_CantidadOptimaPerfume();
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
	public Configuracion_CantidadOptimaPerfume() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 346);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlightText);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt1 = new JTextField();
		txt1.setText(""+BDPerfumes.cantidadOptima);
		txt1.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		txt1.setColumns(10);
		txt1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txt1.setBounds(323, 104, 158, 20);
		contentPane.add(txt1);
		
		button = new JButton("Guardar");
		button.addActionListener(this);
		button.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		button.setForeground(Color.WHITE);
		button.setBackground(SystemColor.activeCaption);
		button.setBounds(323, 225, 184, 23);
		contentPane.add(button);
		
		lblCantidadptimaDe = new JLabel("Cantidad \u00F3ptima de perfumes vendidos");
		lblCantidadptimaDe.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblCantidadptimaDe.setBounds(25, 102, 268, 23);
		contentPane.add(lblCantidadptimaDe);
		
		button_1 = new JButton("Cerrar");
		button_1.addActionListener(this);
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Yu Gothic UI", Font.ITALIC, 14));
		button_1.setBackground(new Color(0, 128, 0));
		button_1.setBounds(535, 55, 147, 26);
		contentPane.add(button_1);
		
		lblMensaje = new JLabel("");
		lblMensaje.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblMensaje.setBounds(515, 223, 185, 25);
		contentPane.add(lblMensaje);
		
		lblConfigurarCantidadptima = new JLabel("Configurar cantidad \u00F3ptima de perfumes vendidos");
		lblConfigurarCantidadptima.setForeground(SystemColor.textInactiveText);
		lblConfigurarCantidadptima.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblConfigurarCantidadptima.setBounds(25, 30, 456, 26);
		contentPane.add(lblConfigurarCantidadptima);
		
		label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Configuracion_CantidadOptimaPerfume.class.getResource("/icons/add_30px.png")));
		label_4.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		label_4.setBounds(488, 91, 43, 34);
		contentPane.add(label_4);
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
			BDPerfumes.cantidadOptima=Integer.parseInt(txt1.getText());
			
			lblMensaje.setText("Datos guardados");
		} catch (Exception e2) {
			// TODO: handle exception
			lblMensaje.setText("Datos incorrectos");
		}
	}
}
