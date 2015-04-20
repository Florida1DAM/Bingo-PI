package Principal;

import java.awt.BorderLayout;
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

public class jugadores extends JFrame {

	private JPanel contentPane;
	private JTextField CampoNombre;
	private JLabel Nombre;
	private JLabel Email;
	private JTextField CampoEmail;

	
	
	
	public jugadores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 90, 900, 600);
		contentPane = new Fondo("Bingo.jpg");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel IntroduzcaJugadores = new JLabel("");
		IntroduzcaJugadores.setIcon(new ImageIcon("//Bingo//src//Principal//imagenes//IntroduceJugadores.png"));
		IntroduzcaJugadores.setForeground(UIManager.getColor("ToolBar.dockingForeground"));
		IntroduzcaJugadores.setBackground(Color.WHITE);
		IntroduzcaJugadores.setFont(new Font("Trebuchet MS", Font.PLAIN, 28));
		IntroduzcaJugadores.setBounds(241, 11, 471, 80);
		contentPane.add(IntroduzcaJugadores);
				
		Nombre = new JLabel("Nombre");
		Nombre.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		Nombre.setForeground(Color.WHITE);
		Nombre.setVerticalAlignment(SwingConstants.TOP);
		Nombre.setBounds(166, 179, 96, 29);
		contentPane.add(Nombre);
		
		CampoNombre = new JTextField();
		CampoNombre.setBounds(299, 185, 149, 20);
		contentPane.add(CampoNombre);
		CampoNombre.setColumns(10);
		
		Email = new JLabel("E-Mail");
		Email.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		Email.setVerticalAlignment(SwingConstants.TOP);
		Email.setForeground(Color.WHITE);
		Email.setBounds(164, 224, 73, 29);
		contentPane.add(Email);
		
		CampoEmail = new JTextField();
		CampoEmail.setColumns(10);
		CampoEmail.setBounds(299, 230, 149, 20);
		contentPane.add(CampoEmail);
		
		JButton NuevoJugador = new JButton("Nuevo Jugador");
		NuevoJugador.setBounds(156, 278, 139, 23);
		contentPane.add(NuevoJugador);
		
		JButton EliminarJugador = new JButton("Eliminar Jugador");
		EliminarJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		EliminarJugador.setBounds(315, 278, 139, 23);
		contentPane.add(EliminarJugador);
		
		JButton Salir = new JButton("Salir");
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {						
				jugadores.this.dispose();						
			}
		});	
		
		Salir.setBounds(670, 503, 126, 29);
		contentPane.add(Salir);
		
		JButton comienza = new JButton("");
		comienza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Principal VentPrinc = new Principal();
				VentPrinc.setVisible (true);
				jugadores.this.dispose();				
				
				
			}
		});
		comienza.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\Desktop\\1\u00BA DAM\\Proyecto integrado\\cooltext116275924563119.png"));
		comienza.setBounds(202, 374, 195, 72);
		contentPane.add(comienza);
		
		JLabel imagenBolas = new JLabel("");
		imagenBolas.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\Desktop\\1\u00BA DAM\\Proyecto integrado\\bolas.jpg"));
		imagenBolas.setBounds(607, 90, 241, 382);
		contentPane.add(imagenBolas);
		
		JButton Atras = new JButton("Atras");
		Atras.setBounds(85, 503, 126, 29);
		contentPane.add(Atras);
	}
}
