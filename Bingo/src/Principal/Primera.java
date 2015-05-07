package Principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.JPasswordField;

public class Primera extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel pantalla;
	private JTextField CampoUsuario;
	private JPasswordField CampoContra;

	public Primera() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 90, 900, 600);
		pantalla = new Fondo("/Principal/imagenes/fondoPrimera.png");
		pantalla.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pantalla);
		pantalla.setLayout(null);
		setTitle("Bingo twist");
		
		JButton Entrar = new JButton("Enter");
		Entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (CampoUsuario.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(CampoUsuario,"Please Introduce an Username");
					 jugadores VentPrinc = new jugadores();
						VentPrinc.setVisible (false);
							
				}
				
				else if(CampoContra.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(CampoContra,"Please Introduce a Password");
					jugadores VentPrinc = new jugadores();
					VentPrinc.setVisible (false);
						
				}
				
				else
				
				{
				jugadores VentPrinc = new jugadores();
				Primera.this.dispose();			
				VentPrinc.setVisible (true);
				}
			}
			
		});	
		Entrar.setBounds(357, 503, 89, 23);
		pantalla.add(Entrar);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(getClass().getResource("/Principal/imagenes/logotipo.png")));
		logo.setBounds(71, 57, 700, 248);
		pantalla.add(logo);
		
		JLabel Username = new JLabel("Username");
		Username.setForeground(Color.WHITE);
		Username.setBounds(373, 434, 60, 14);
		pantalla.add(Username);
		
		CampoUsuario = new JTextField();
		CampoUsuario.setBounds(443, 432, 120, 17);
		pantalla.add(CampoUsuario);
		CampoUsuario.setColumns(10);
		
		JLabel Password = new JLabel("Password");
		Password.setForeground(Color.WHITE);
		Password.setBounds(373, 462, 63, 14);
		pantalla.add(Password);
		
		CampoContra = new JPasswordField();
		CampoContra.setBounds(443, 460, 120, 18);
		pantalla.add(CampoContra);
		
		JButton Salir = new JButton("Leave");
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {						
				Primera.this.dispose();							
			}
		});	
		Salir.setBounds(478, 503, 89, 23);
		pantalla.add(Salir);
		
	

	}
}
