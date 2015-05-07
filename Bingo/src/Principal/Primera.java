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
import java.util.Iterator;

import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;

import Modelo.modeloCorredores;
import Modelo.modeloCorredores;

public class Primera extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel pantalla;
	private JPasswordField CampoContra;
	modeloCorredores usuarios;

	

	public Primera() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 90, 900, 600);
		pantalla = new Fondo("/Principal/imagenes/fondoPrimera.png");
		pantalla.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pantalla);
		pantalla.setLayout(null);
		setTitle("Bingo twist");
		
		JButton Entrar = new JButton("Entrar");
		Entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/*if (CampoUsuario.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(CampoUsuario,"Introduzca un usuario");
					 jugadores VentPrinc = new jugadores();
						VentPrinc.setVisible (false);
							
				}*/
				
				if(CampoContra.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(CampoContra,"Introduzca una contraseña");
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
		logo.setIcon(new ImageIcon(getClass().getResource("/Principal/imagenes/logoBingoNuevo.png")));
		logo.setBounds(77, 43, 700, 294);
		pantalla.add(logo);
		
		JLabel Usuario = new JLabel("Usuario");
		Usuario.setForeground(Color.WHITE);
		Usuario.setBounds(387, 434, 46, 14);
		pantalla.add(Usuario);
		
		JLabel Contrasena = new JLabel("Contrase\u00F1a");
		Contrasena.setForeground(Color.WHITE);
		Contrasena.setBounds(370, 459, 76, 14);
		pantalla.add(Contrasena);
		
		CampoContra = new JPasswordField();
		CampoContra.setBounds(443, 460, 120, 18);
		pantalla.add(CampoContra);
		
		JButton Salir = new JButton("Salir");
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {						
				Primera.this.dispose();							
			}
		});	
		Salir.setBounds(478, 503, 89, 23);
		pantalla.add(Salir);
		
		JComboBox Desplegable = new JComboBox();
		Desplegable.setBounds(443, 431, 120, 17);
		pantalla.add(Desplegable);
		
		//Rellenamos JComboBox
		
				usuarios=new modeloCorredores();
				
				Iterator<String> it=usuarios.getusuarios().iterator();
				while(it.hasNext()){
					Desplegable.addItem((String)it.next());
				}
				
				
	

	}
}
