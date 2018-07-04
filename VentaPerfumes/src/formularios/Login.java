package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.MatteBorder;

import datosProyecto.BDUsuarios;

import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame implements MouseListener, ActionListener {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JLabel lblCerrar;
	private JTextField txtUsuario;
	private JPasswordField txtContraseña;
	private JLabel lblLogin;
	private JLabel label;
	private JLabel label_1;
	private JButton btnNewButton;
	private JLabel lblMensaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(100, 100, 1020, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 0, 320, 438);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtUsuario = new JTextField();
		txtUsuario.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtUsuario.setBounds(80, 88, 129, 28);
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContraseña = new JPasswordField();
		txtContraseña.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtContraseña.setEchoChar('*');
		txtContraseña.setBounds(80, 156, 129, 28);
		panel.add(txtContraseña);
		
		lblLogin = new JLabel("LOGIN ");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblLogin.setBounds(99, 50, 104, 27);
		panel.add(lblLogin);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(Login.class.getResource("/icons/icons8_Male_User_30px.png")));
		label.setBounds(209, 88, 40, 28);
		panel.add(label);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Login.class.getResource("/icons/icons8_Key_30px.png")));
		label_1.setBounds(209, 149, 40, 46);
		panel.add(label_1);
		
		btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(this);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(209, 87, 22));
		btnNewButton.setBounds(80, 235, 90, 28);
		panel.add(btnNewButton);
		
		lblMensaje = new JLabel("");
		lblMensaje.setFont(new Font("Yu Gothic UI", Font.PLAIN, 13));
		lblMensaje.setBounds(78, 289, 160, 19);
		panel.add(lblMensaje);
		
		panel_1 = new JPanel();
		panel_1.setBounds(327, 0, 703, 446);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		lblCerrar = new JLabel("");
		lblCerrar.addMouseListener(this);
		lblCerrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblCerrar.setBounds(631, 11, 62, 42);
		panel_1.add(lblCerrar);
		lblCerrar.setIcon(new ImageIcon(Login.class.getResource("/icons/Close_Gris30px.png")));
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/wallpapers/Principal2.jpg")));
		lblNewLabel.setLabelFor(this);
		lblNewLabel.setBounds(0, -11, 703, 446);
		panel_1.add(lblNewLabel);
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblCerrar) {
			mouseEnteredLblCerrar(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == lblCerrar) {
			lblCerrar.setIcon(new ImageIcon(Login.class.getResource("/icons/Close_Rojo34px.png")));
		}
	}
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == lblCerrar) {
			lblCerrar.setIcon(new ImageIcon(Login.class.getResource("/icons/Close_Gris30px.png")));
		}
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseEnteredLblCerrar(MouseEvent e) {
		this.setVisible(false);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(arg0);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent arg0) {
		String usuario=txtUsuario.getText();
		String contraseña=txtContraseña.getText();
		
		if ((usuario.equals(BDUsuarios.usuario1)) && (contraseña.equals(BDUsuarios.contraseña))){
			MenuSuperAdmin objeto=new MenuSuperAdmin();
			objeto.setVisible(true);
			this.setVisible(false);
		}
		else{
			lblMensaje.setText("Datos erroneos");
		}
			
		
		
	}
}
