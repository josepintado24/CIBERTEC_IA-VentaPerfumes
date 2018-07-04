package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import datosProyecto.BDPerfumes;
import datosProyecto.BDReportes;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;

public class Ventas_Vender extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNombre;
	private JComboBox cboNombre;
	private JLabel lblPrecio;
	private JTextField txtPrecio;
	private JLabel lblTxtcantidad;
	private JTextField txtCantidad;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnGuardar;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventas_Vender frame = new Ventas_Vender();
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
	public Ventas_Vender() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 619);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlightText);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblNombre.setBounds(86, 64, 86, 14);
		contentPane.add(lblNombre);
		
		cboNombre = new JComboBox();
		cboNombre.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		cboNombre.addActionListener(this);
		cboNombre.setModel(new DefaultComboBoxModel(new String[] {"ALCAZAR", "ALLURE", "AQUA RUSH", "ENVY", "ALAIA"}));
		cboNombre.setBounds(86, 89, 110, 20);
		contentPane.add(cboNombre);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblPrecio.setBounds(86, 120, 65, 14);
		contentPane.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setText(""+BDPerfumes.precio0);
		txtPrecio.setBackground(SystemColor.textHighlightText);
		txtPrecio.setEditable(false);
		txtPrecio.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtPrecio.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		txtPrecio.setBounds(86, 147, 145, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		lblTxtcantidad = new JLabel("Cantidad");
		lblTxtcantidad.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblTxtcantidad.setBounds(86, 188, 65, 14);
		contentPane.add(lblTxtcantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setText("0");
		txtCantidad.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtCantidad.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		txtCantidad.setBounds(86, 216, 145, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setBounds(10, 295, 717, 274);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textArea.setBorder(null);
		scrollPane.setViewportView(textArea);
		
		btnGuardar = new JButton("Vender");
		btnGuardar.addActionListener(this);
		btnGuardar.setForeground(Color.WHITE);
		btnGuardar.setFont(new Font("Yu Gothic UI", Font.ITALIC, 14));
		btnGuardar.setBackground(SystemColor.activeCaption);
		btnGuardar.setBounds(42, 258, 189, 26);
		contentPane.add(btnGuardar);
		
		button = new JButton("Cerrar");
		button.addActionListener(this);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Yu Gothic UI", Font.ITALIC, 14));
		button.setBackground(new Color(0, 128, 0));
		button.setBounds(536, 58, 147, 26);
		contentPane.add(button);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(Ventas_Vender.class.getResource("/icons/precio_30px.png")));
		label.setBounds(58, 132, 30, 45);
		contentPane.add(label);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Ventas_Vender.class.getResource("/icons/add_30px.png")));
		label_1.setBounds(58, 202, 30, 45);
		contentPane.add(label_1);
		
		lblVentasvender = new JLabel("Ventas/Vender");
		lblVentasvender.setForeground(SystemColor.textInactiveText);
		lblVentasvender.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblVentasvender.setBounds(42, 11, 456, 26);
		contentPane.add(lblVentasvender);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGuardar) {
			actionPerformedBtnGuardar(e);
		}
		if (e.getSource() == cboNombre) {
			actionPerformedCboNombre(e);
		}
		if (e.getSource() == button) {
			actionPerformedButton(e);
		}
	}
	protected void actionPerformedButton(ActionEvent e) {
		this.setVisible(false);
	}
	int indiceCombo(){
		return cboNombre.getSelectedIndex();
	}
	String nombrePerfumeActual;
	double precioUnitario;
	
	
	private JLabel label;
	private JLabel label_1;
	private JLabel lblVentasvender;
	protected void actionPerformedCboNombre(ActionEvent e) {
		switch (indiceCombo()) {
		case 0:
			txtPrecio.setText(BDPerfumes.precio0+"");
			nombrePerfumeActual=BDPerfumes.nombre0;
			precioUnitario=BDPerfumes.precio0;
			
			break;
		case 1:
			txtPrecio.setText(BDPerfumes.precio1+"");
			nombrePerfumeActual=BDPerfumes.nombre1;
			precioUnitario=BDPerfumes.precio1;
			
			break;
		case 2:
			txtPrecio.setText(BDPerfumes.precio2+"");
			nombrePerfumeActual=BDPerfumes.nombre2;
			precioUnitario=BDPerfumes.precio2;
			
			break;
		case 3:
			txtPrecio.setText(BDPerfumes.precio3+"");
			nombrePerfumeActual=BDPerfumes.nombre3;
			precioUnitario=BDPerfumes.precio3;
		
			break;
		case 4:
			txtPrecio.setText(BDPerfumes.precio4+"");
			nombrePerfumeActual=BDPerfumes.nombre4;
			precioUnitario=BDPerfumes.precio4;
			
			break;
		}
	}
	int getCantidad(){
		return Integer.parseInt(txtCantidad.getText());
	}
	
	double importeCompra(){
		return getCantidad()*precioUnitario;
	}
	
	double importeDescuento(){
		double descuento=0.0;
		if (getCantidad()<=5){
			descuento=BDPerfumes.porcentaje1/100;
		}
		else if(getCantidad()<=10){
			descuento=BDPerfumes.porcentaje2/100;
		}
		else if (getCantidad()<=15){
			descuento=BDPerfumes.porcentaje3/100;
		}
		else {
			descuento=BDPerfumes.porcentaje4/100;
		}
					
		return importeCompra()* descuento;
	}
	
	double importePagar(){
		return importeCompra()-importeDescuento();
	}
	
	String obsequio(){
		String obsequio="No corresponde";
		if (importePagar()>=BDPerfumes.importeMinimoObsequiable){
			obsequio=BDPerfumes.obsequio;
		}
			
		return obsequio;
	}
	
	String premioSorpresa(){
		String sorpresa="No corresponde";
		if (BDReportes.numClientes==BDPerfumes.numeroClienteSorpresa){
			sorpresa=BDPerfumes.premioSorpresa;
		}
			
		return sorpresa;
	}
	
	void llenarReportes(){
		switch (indiceCombo()) {
		case 0:
			BDReportes.cantPerfumesVenta0+=getCantidad();
			BDReportes.importeAcumulado0+=importePagar();
			BDReportes.cantidadVentas0++;
			break;
		case 1:
			BDReportes.cantPerfumesVenta1+=getCantidad();
			BDReportes.importeAcumulado1+=importePagar();
			BDReportes.cantidadVentas1++;
			break;
		case 2:
			BDReportes.cantPerfumesVenta2+=getCantidad();
			BDReportes.importeAcumulado2+=importePagar();
			BDReportes.cantidadVentas2++;
			break;
		case 3:
			BDReportes.cantPerfumesVenta3+=getCantidad();
			BDReportes.importeAcumulado3+=importePagar();
			BDReportes.cantidadVentas3++;
			break;
		case 4:
			BDReportes.cantPerfumesVenta4+=getCantidad();
			BDReportes.importeAcumulado4+=importePagar();
			BDReportes.cantidadVentas4++;
			break;
		}
	
	}
	void mostrar(){
		llenarReportes();
		
		textArea.append("\t\t\tN° Clientes: "+BDReportes.numClientes);
		textArea.append("\nNombre Perfume\t: "+nombrePerfumeActual);
		textArea.append("\nPrecio Unitario\t\t: "+precioUnitario);
		textArea.append("\nCantidad de unidades\t: "+getCantidad());
		textArea.append("\nImporte de compra\t: "+importeCompra());
		textArea.append("\nImporte Descuento\t: "+importeDescuento());
		textArea.append("\nImporte Pagar\t\t: "+importePagar());
		textArea.append("\nObsequio\t\t: "+obsequio());
		textArea.append("\nObsequio\t\t: "+premioSorpresa());
		
		
	}
	
	
	protected void actionPerformedBtnGuardar(ActionEvent e) {
		BDReportes.numClientes++;
		textArea.setText("");
		mostrar();
	}
}

