package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import datosProyecto.BDReportes;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventas_GenerarReportes extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JComboBox cboTipo;
	private JScrollPane scrollPane;
	private JTextArea txtS;

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
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cboTipo = new JComboBox();
		cboTipo.addActionListener(this);
		cboTipo.setModel(new DefaultComboBoxModel(new String[] {"Ventas por perfume", "Perfumes con venta \u00F3ptima", "Precios en relaci\u00F3n al promedio", "Promedios, m\u00E1ximos y m\u00EDnimos"}));
		cboTipo.setBounds(121, 30, 264, 20);
		contentPane.add(cboTipo);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 76, 603, 304);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboTipo) {
			actionPerformedComboBox(e);
		}
	}
	int Tipoindex(){
		return cboTipo.getSelectedIndex();
	}
	void mostrarVentaPerfumes(){
		txtS.append("\ncantidad0 "+BDReportes.cantPerfumesVenta0);
		txtS.append("\ncantidad0 "+BDReportes.importeAcumulado0);
		txtS.append("\ncantidad0 "+BDReportes.cantPerfumesVenta1);
		txtS.append("\ncantidad0 "+BDReportes.importeAcumulado1);
		txtS.append("\ncantidad0 "+BDReportes.cantPerfumesVenta2);
		txtS.append("\ncantidad0 "+BDReportes.importeAcumulado2);
		txtS.append("\ncantidad0 "+BDReportes.cantPerfumesVenta3);
		txtS.append("\ncantidad0 "+BDReportes.importeAcumulado3);
		txtS.append("\ncantidad0 "+BDReportes.cantPerfumesVenta4);
		txtS.append("\ncantidad0 "+BDReportes.importeAcumulado4);
	}
	protected void actionPerformedComboBox(ActionEvent e) {
		switch (Tipoindex()) {
		case 0:
			mostrarVentaPerfumes();
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		}
		
	}
	
	
	
	
}
