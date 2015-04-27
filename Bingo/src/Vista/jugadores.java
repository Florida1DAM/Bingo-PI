package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import java.awt.SystemColor;

public class jugadores extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel pantalla;
	private JTextField CampoNombre;
	private JLabel Nombre;
	private JLabel Email;
	private JTextField CampoEmail;

	
	
	
	public jugadores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 90, 900, 600);
		pantalla = new Fondo("/Principal/imagenes/Fondos/FondoJugadores.jpg");
		pantalla.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pantalla);
		pantalla.setLayout(null);
		setTitle("Bingo twist");
		
		JLabel IntroduzcaJugadores = new JLabel("");
		IntroduzcaJugadores.setIcon(new ImageIcon(getClass().getResource("/Principal/imagenes/botones/IntroduceJugadores.png")));
		IntroduzcaJugadores.setBackground(Color.WHITE);
		IntroduzcaJugadores.setFont(new Font("Trebuchet MS", Font.PLAIN, 28));
		IntroduzcaJugadores.setBounds(241, 11, 471, 80);
		pantalla.add(IntroduzcaJugadores);
				
		Nombre = new JLabel("Nombre");
		Nombre.setBackground(SystemColor.desktop);
		Nombre.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		Nombre.setForeground(Color.BLACK);
		Nombre.setVerticalAlignment(SwingConstants.TOP);
		Nombre.setBounds(336, 179, 96, 29);
		pantalla.add(Nombre);
		
		CampoNombre = new JTextField();
		CampoNombre.setBounds(425, 185, 149, 20);
		pantalla.add(CampoNombre);
		CampoNombre.setColumns(10);
		
		Email = new JLabel("E-Mail");
		Email.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		Email.setVerticalAlignment(SwingConstants.TOP);
		Email.setForeground(Color.BLACK);
		Email.setBounds(342, 224, 73, 29);
		pantalla.add(Email);
		
		CampoEmail = new JTextField();
		CampoEmail.setColumns(10);
		CampoEmail.setBounds(425, 230, 149, 20);
		pantalla.add(CampoEmail);
		
		JButton NuevoJugador = new JButton("Nuevo Jugador");
		NuevoJugador.setBounds(235, 297, 139, 23);
		pantalla.add(NuevoJugador);
		
		JButton EliminarJugador = new JButton("Eliminar Jugador");
		EliminarJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		EliminarJugador.setBounds(490, 297, 139, 23);
		pantalla.add(EliminarJugador);
		
		JButton Salir = new JButton("Salir");
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {						
				jugadores.this.dispose();						
			}
		});	
		
		Salir.setBounds(670, 503, 126, 29);
		pantalla.add(Salir);
		
		JButton comienza = new JButton("");
		comienza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Principal VentPrinc = new Principal();
				VentPrinc.setVisible (true);
				jugadores.this.dispose();				
				
				
			}
		});
		
		comienza.setIcon(new ImageIcon(getClass().getResource("/Principal/imagenes/botones/Comienza.png")));
		comienza.setBounds(333, 393, 195, 72);
		pantalla.add(comienza);
		
		JButton Atras = new JButton("Atras");		
		Atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Primera VentPrinc = new Primera();
				VentPrinc.setVisible (true);
				jugadores.this.dispose();			
				
			}
		});				
		Atras.setBounds(85, 503, 126, 29);
		pantalla.add(Atras);
	}
}
