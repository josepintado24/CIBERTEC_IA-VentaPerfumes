package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import datosProyecto.BDPerfumes;
import datosProyecto.BDReportes;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Ventas_GenerarReportes extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JComboBox cboTipo;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JLabel lblNewLabel;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventas_GenerarReportes frame = new Ventas_GenerarReportes();
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
	public Ventas_GenerarReportes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 430);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlightText);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cboTipo = new JComboBox();
		cboTipo.setBackground(SystemColor.textHighlightText);
		cboTipo.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		cboTipo.addActionListener(this);
		cboTipo.setModel(new DefaultComboBoxModel(new String[] {"Ventas por perfume", "Perfumes con venta \u00F3ptima", "Precios en relaci\u00F3n al promedio", "Promedios, m\u00E1ximos y m\u00EDnimos"}));
		cboTipo.setBounds(118, 21, 320, 23);
		contentPane.add(cboTipo);
		
		scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setBounds(10, 76, 603, 304);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		scrollPane.setViewportView(txtS);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Ventas_GenerarReportes.class.getResource("/icons/reporte_30px.png")));
		lblNewLabel.setBounds(73, 11, 35, 33);
		contentPane.add(lblNewLabel);
		
		button = new JButton("Cerrar");
		button.addActionListener(this);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Yu Gothic UI", Font.ITALIC, 14));
		button.setBackground(new Color(0, 128, 0));
		button.setBounds(466, 22, 147, 26);
		contentPane.add(button);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			actionPerformedButton(e);
		}
		if (e.getSource() == cboTipo) {
			actionPerformedComboBox(e);
		}
	}
	int Tipoindex(){
		return cboTipo.getSelectedIndex();
	}
	void mostrarVentaPerfumes(){
		txtS.setText("");
		txtS.append("Ventas Perfumes\n");
		txtS.append("\nNombre\t\t\t: "+BDPerfumes.nombre0);
		txtS.append("\nCantidad de ventas\t\t: "+BDReportes.cantidadVentas0);
		txtS.append("\nCantidad total de unidades vendidas\t: "+BDReportes.cantPerfumesVenta0);
		txtS.append("\nImporte total acumulado\t\t :"+BDReportes.importeAcumulado0);
		
		txtS.append("\n\nNombre\t\t\t: "+BDPerfumes.nombre1);
		txtS.append("\nCantidad de ventas\t\t: "+BDReportes.cantidadVentas1);
		txtS.append("\nCantidad total de unidades vendidas\t: "+BDReportes.cantPerfumesVenta1);
		txtS.append("\nImporte total acumulado\t\t :"+BDReportes.importeAcumulado1);
		
		txtS.append("\n\nNombre\t\t\t: "+BDPerfumes.nombre2);
		txtS.append("\nCantidad de ventas\t\t: "+BDReportes.cantidadVentas2);
		txtS.append("\nCantidad total de unidades vendidas\t: "+BDReportes.cantPerfumesVenta2);
		txtS.append("\nImporte total acumulado\t\t :"+BDReportes.importeAcumulado2);

		txtS.append("\n\nNombre\t\t\t: "+BDPerfumes.nombre3);
		txtS.append("\nCantidad de ventas\t\t: "+BDReportes.cantidadVentas3);
		txtS.append("\nCantidad total de unidades vendidas\t: "+BDReportes.cantPerfumesVenta3);
		txtS.append("\nImporte total acumulado\t\t :"+BDReportes.importeAcumulado3);
		
		txtS.append("\n\nNombre\t\t\t: "+BDPerfumes.nombre4);
		txtS.append("\nCantidad de ventas\t\t: "+BDReportes.cantidadVentas4);
		txtS.append("\nCantidad total de unidades vendidas\t: "+BDReportes.cantPerfumesVenta4);
		txtS.append("\nImporte total acumulado\t\t :"+BDReportes.importeAcumulado4);
	}
	
	void mostrarVentaOptima0(){
		
		txtS.append("\n\nNombre\t\t: "+BDPerfumes.nombre0);
		txtS.append("\nCantidad total de unidades vendidas\t: "+BDReportes.cantPerfumesVenta0+"("+(BDReportes.cantPerfumesVenta0-BDPerfumes.cantidadOptima)+" más que la cantidad óptima)");
	}
	void mostrarVentaOptima1(){
			
		txtS.append("\n\nNombre\t\t: "+BDPerfumes.nombre1);
		txtS.append("\nCantidad total de unidades vendidas\t: "+BDReportes.cantPerfumesVenta1+"("+(BDReportes.cantPerfumesVenta1-BDPerfumes.cantidadOptima)+" más que la cantidad óptima)");
	}
	void mostrarVentaOptima2(){
		
		txtS.append("\n\nNombre\t\t: "+BDPerfumes.nombre2);
		txtS.append("\nCantidad total de unidades vendidas\t: "+BDReportes.cantPerfumesVenta2+"("+(BDReportes.cantPerfumesVenta2-BDPerfumes.cantidadOptima)+" más que la cantidad óptima)");
	}
	void mostrarVentaOptima3(){
	
		txtS.append("\n\nNombre\t\t: "+BDPerfumes.nombre3);
		txtS.append("\nCantidad total de unidades vendidas\t: "+BDReportes.cantPerfumesVenta3+"("+(BDReportes.cantPerfumesVenta3-BDPerfumes.cantidadOptima)+" más que la cantidad óptima)");
	}
	void mostrarVentaOptima4(){
	
		txtS.append("\n\nNombre\t\t: "+BDPerfumes.nombre4);
		txtS.append("\nCantidad total de unidades vendidas\t: "+BDReportes.cantPerfumesVenta4+"("+(BDReportes.cantPerfumesVenta4-BDPerfumes.cantidadOptima)+" más que la cantidad óptima)");
	}
	
	void precioRelacionPromedio(){
		String mensaje="menor al promedio";
		if ()
		
	}
	
	
	protected void actionPerformedComboBox(ActionEvent e) {
		switch (Tipoindex()) {
		case 0:
			mostrarVentaPerfumes();
			break;
		case 1:
			txtS.setText("");
			txtS.append("Perfumes con venta Óptima\n");
			if (BDReportes.cantPerfumesVenta0>BDPerfumes.cantidadOptima){
				mostrarVentaOptima0();
			}
			if (BDReportes.cantPerfumesVenta1>BDPerfumes.cantidadOptima){
				mostrarVentaOptima1();
			}
			if (BDReportes.cantPerfumesVenta2>BDPerfumes.cantidadOptima){
				mostrarVentaOptima2();
			}
			if (BDReportes.cantPerfumesVenta3>BDPerfumes.cantidadOptima){
				mostrarVentaOptima3();
			}
			if (BDReportes.cantPerfumesVenta4>BDPerfumes.cantidadOptima){
				mostrarVentaOptima4();
			}
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		}
		
	}
	
	
	
	
	protected void actionPerformedButton(ActionEvent e) {
		this.setVisible(false);
	}
}
