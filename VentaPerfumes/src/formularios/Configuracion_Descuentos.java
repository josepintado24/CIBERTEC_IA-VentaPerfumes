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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class Configuracion_Descuentos extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JButton button;
	private JLabel lblA;
	private JButton button_1;
	private JLabel lblA_1;
	private JLabel lblMensaje;
	private JLabel lblConfigurarPorcentajeDe;
	private JLabel lblA_2;
	private JLabel lblMsDe;
	private JTextField txt3;
	private JTextField txt4;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Configuracion_Descuentos frame = new Configuracion_Descuentos();
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
	public Configuracion_Descuentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 441);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlightText);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt1 = new JTextField();
		txt1.setText(""+BDPerfumes.porcentaje1);
		txt1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		txt1.setColumns(10);
		txt1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txt1.setBounds(245, 107, 124, 20);
		contentPane.add(txt1);
		
		txt2 = new JTextField();
		txt2.setText(""+BDPerfumes.porcentaje2);
		txt2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		txt2.setColumns(10);
		txt2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txt2.setBounds(245, 164, 124, 20);
		contentPane.add(txt2);
		
		button = new JButton("Guardar");
		button.addActionListener(this);
		button.setForeground(Color.WHITE);
		button.setBackground(SystemColor.activeCaption);
		button.setBounds(245, 357, 184, 23);
		contentPane.add(button);
		
		lblA = new JLabel("1 a 5 unidades");
		lblA.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblA.setBounds(45, 107, 170, 14);
		contentPane.add(lblA);
		
		button_1 = new JButton("Cerrar");
		button_1.addActionListener(this);
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Yu Gothic UI", Font.ITALIC, 14));
		button_1.setBackground(new Color(0, 128, 0));
		button_1.setBounds(461, 36, 147, 26);
		contentPane.add(button_1);
		
		lblA_1 = new JLabel("6 a 10 unidades");
		lblA_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblA_1.setBounds(45, 167, 139, 14);
		contentPane.add(lblA_1);
		
		lblMensaje = new JLabel("");
		lblMensaje.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblMensaje.setBounds(439, 355, 185, 25);
		contentPane.add(lblMensaje);
		
		lblConfigurarPorcentajeDe = new JLabel("Configurar Porcentaje de descuento");
		lblConfigurarPorcentajeDe.setForeground(SystemColor.textInactiveText);
		lblConfigurarPorcentajeDe.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblConfigurarPorcentajeDe.setBounds(31, 35, 456, 26);
		contentPane.add(lblConfigurarPorcentajeDe);
		
		lblA_2 = new JLabel("11 a 15 unidades");
		lblA_2.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblA_2.setBounds(45, 226, 139, 14);
		contentPane.add(lblA_2);
		
		lblMsDe = new JLabel("M\u00E0s de 15 unidades");
		lblMsDe.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblMsDe.setBounds(45, 285, 139, 14);
		contentPane.add(lblMsDe);
		
		txt3 = new JTextField();
		txt3.setText(""+BDPerfumes.porcentaje3);
		txt3.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		txt3.setColumns(10);
		txt3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txt3.setBounds(245, 225, 124, 20);
		contentPane.add(txt3);
		
		txt4 = new JTextField();
		txt4.setText(""+BDPerfumes.porcentaje4);
		txt4.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		txt4.setColumns(10);
		txt4.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txt4.setBounds(245, 284, 124, 20);
		contentPane.add(txt4);
		
		label = new JLabel("%");
		label.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		label.setBounds(379, 102, 28, 25);
		contentPane.add(label);
		
		label_1 = new JLabel("%");
		label_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		label_1.setBounds(379, 159, 28, 25);
		contentPane.add(label_1);
		
		label_2 = new JLabel("%");
		label_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		label_2.setBounds(379, 215, 28, 25);
		contentPane.add(label_2);
		
		label_3 = new JLabel("%");
		label_3.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		label_3.setBounds(379, 274, 28, 25);
		contentPane.add(label_3);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == button_1) {
			actionPerformedButton_1(arg0);
		}
		if (arg0.getSource() == button) {
			actionPerformedButton(arg0);
		}
	}
	protected void actionPerformedButton(ActionEvent arg0) {
		try {
			BDPerfumes.porcentaje1=Double.parseDouble(txt1.getText());
			BDPerfumes.porcentaje2=Double.parseDouble(txt2.getText());
			BDPerfumes.porcentaje3=Double.parseDouble(txt3.getText());
			BDPerfumes.porcentaje4=Double.parseDouble(txt4.getText());
			
			
			lblMensaje.setText("Datos guardados");
		} catch (Exception e) {
			lblMensaje.setText("Ingrese datos correctos");
		}
	}
	protected void actionPerformedButton_1(ActionEvent arg0) {
		this.setVisible(false);
	}
}
