package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import datosProyecto.BDPerfumes;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Mantenimiento_Listar extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton button;
	private JButton btnListar;
	private JLabel lblMantenimientolistar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mantenimiento_Listar frame = new Mantenimiento_Listar();
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
	public Mantenimiento_Listar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 477);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setForeground(SystemColor.controlLtHighlight);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setBounds(10, 91, 585, 349);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setBorder(null);
		txtS.setEditable(false);
		scrollPane.setViewportView(txtS);
		
		button = new JButton("Cerrar");
		button.addActionListener(this);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Yu Gothic UI", Font.ITALIC, 14));
		button.setBackground(new Color(0, 128, 0));
		button.setBounds(359, 41, 147, 26);
		contentPane.add(button);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setForeground(Color.WHITE);
		btnListar.setFont(new Font("Yu Gothic UI", Font.ITALIC, 14));
		btnListar.setBackground(new Color(0, 128, 0));
		btnListar.setBounds(104, 41, 147, 26);
		contentPane.add(btnListar);
		
		lblMantenimientolistar = new JLabel("Mantenimiento/Listar");
		lblMantenimientolistar.setForeground(SystemColor.textInactiveText);
		lblMantenimientolistar.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblMantenimientolistar.setBounds(23, 11, 456, 26);
		contentPane.add(lblMantenimientolistar);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnListar) {
			actionPerformedBtnListar(arg0);
		}
		if (arg0.getSource() == button) {
			actionPerformedButton(arg0);
		}
	}
	protected void actionPerformedButton(ActionEvent arg0) {
		this.setVisible(false);
	}
	void listar(){
		
		txtS.append("Listado de Perfumes\n");
		txtS.append("\nNombre\t\t: "+BDPerfumes.nombre0);
		txtS.append("\nPrecio\t\t: "+BDPerfumes.precio0);
		txtS.append("\nAño de lanzamiento\t: "+BDPerfumes.año0);
		txtS.append("\nCasa\t\t: "+BDPerfumes.casa0);
		
		txtS.append("\n\nNombre\t\t: "+BDPerfumes.nombre1);
		txtS.append("\nPrecio\t\t: "+BDPerfumes.precio1);
		txtS.append("\nAño de lanzamiento\t: "+BDPerfumes.año1);
		txtS.append("\nCasa\t\t: "+BDPerfumes.casa1);
		
		txtS.append("\n\nNombre\t\t: "+BDPerfumes.nombre2);
		txtS.append("\nPrecio\t\t: "+BDPerfumes.precio2);
		txtS.append("\nAño de lanzamiento\t: "+BDPerfumes.año2);
		txtS.append("\nCasa\t\t: "+BDPerfumes.casa2);
		
		txtS.append("\n\nNombre\t\t: "+BDPerfumes.nombre3);
		txtS.append("\nPrecio\t\t: "+BDPerfumes.precio3);
		txtS.append("\nAño de lanzamiento\t: "+BDPerfumes.año3);
		txtS.append("\nCasa\t\t: "+BDPerfumes.casa3);
		
		txtS.append("\n\nNombre\t\t: "+BDPerfumes.nombre4);
		txtS.append("\nPrecio\t\t: "+BDPerfumes.precio4);
		txtS.append("\nAño de lanzamiento\t: "+BDPerfumes.año4);
		txtS.append("\nCasa\t\t: "+BDPerfumes.casa4);
	}
	protected void actionPerformedBtnListar(ActionEvent arg0) {
		listar();
	}
}
