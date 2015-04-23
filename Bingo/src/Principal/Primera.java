package Principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.JPasswordField;

public class Primera extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel pantalla;
	private JTextField CampoUsuario;
	private JPasswordField CampoContra;

	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Primera frame = new Primera();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	
	public Primera() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 90, 900, 600);
		pantalla = new Fondo("Bingo.jpg");
		pantalla.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pantalla);
		pantalla.setLayout(null);
		
		JButton Entrar = new JButton("Entrar");
		Entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugadores VentPrinc = new jugadores();
				VentPrinc.setVisible (true);
				Primera.this.dispose();			
				
			}
		});	
		Entrar.setBounds(638, 516, 89, 23);
		pantalla.add(Entrar);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon("/Bingo/src/Principal/imagenes/logo bingo bueno escalado2.png"));
		logo.setBounds(88, 123, 700, 248);
		pantalla.add(logo);
		
		JLabel Usuario = new JLabel("Usuario");
		Usuario.setForeground(Color.WHITE);
		Usuario.setBounds(655, 446, 46, 14);
		pantalla.add(Usuario);
		
		CampoUsuario = new JTextField();
		CampoUsuario.setBounds(711, 443, 120, 17);
		pantalla.add(CampoUsuario);
		CampoUsuario.setColumns(10);
		
		JLabel Contrasena = new JLabel("Contrase\u00F1a");
		Contrasena.setForeground(Color.WHITE);
		Contrasena.setBounds(638, 478, 76, 14);
		pantalla.add(Contrasena);
		
		CampoContra = new JPasswordField();
		CampoContra.setBounds(711, 474, 120, 18);
		pantalla.add(CampoContra);
		
		JButton Salir = new JButton("Salir");
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {						
				Primera.this.dispose();							
			}
		});	
		Salir.setBounds(742, 516, 89, 23);
		pantalla.add(Salir);
		
	

	}
}
