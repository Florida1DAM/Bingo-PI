package Principal;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

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
		pantalla = new Fondo("/Principal/imagenes/fondoJugadores.jpg");
		pantalla.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pantalla);
		pantalla.setLayout(null);
		setTitle("Bingo twist");
		
		JLabel IntroduzcaJugadores = new JLabel("");
		IntroduzcaJugadores.setIcon(new ImageIcon(getClass().getResource("/Principal/imagenes/IntroduceJugadores.png")));
		IntroduzcaJugadores.setBackground(Color.WHITE);
		IntroduzcaJugadores.setFont(new Font("Trebuchet MS", Font.PLAIN, 28));
		IntroduzcaJugadores.setBounds(241, 11, 471, 80);
		pantalla.add(IntroduzcaJugadores);
				
		Nombre = new JLabel("Nombre");
		Nombre.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		Nombre.setForeground(Color.BLACK);
		Nombre.setVerticalAlignment(SwingConstants.TOP);
		Nombre.setBounds(339, 179, 96, 29);
		pantalla.add(Nombre);
		
		CampoNombre = new JTextField();
		CampoNombre.setBounds(445, 185, 149, 20);
		pantalla.add(CampoNombre);
		CampoNombre.setColumns(10);
		
		Email = new JLabel("E-Mail");
		Email.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		Email.setVerticalAlignment(SwingConstants.TOP);
		Email.setForeground(Color.BLACK);
		Email.setBounds(349, 224, 73, 29);
		pantalla.add(Email);
		
		CampoEmail = new JTextField();
		CampoEmail.setColumns(10);
		CampoEmail.setBounds(445, 230, 149, 20);
		pantalla.add(CampoEmail);

		
		
		JButton NuevoJugador = new JButton("Nuevo Jugador");
		NuevoJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					
			}
		});
		NuevoJugador.setBounds(296, 278, 139, 23);
		pantalla.add(NuevoJugador);
		
		JButton EliminarJugador = new JButton("Eliminar Jugador");
		EliminarJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CampoNombre.setText("");
			}
		});
		EliminarJugador.setBounds(472, 278, 139, 23);
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
				
				
					/*
					 * Si no hay ningun nombre de jugador y/o ningun email, nos aparece un mensaje informativo
					 * avisandonos de la auscencia de estos
					 */
					
					if (CampoNombre.getText().trim().isEmpty())
					{
						JOptionPane.showMessageDialog(CampoNombre,"Introduzca un jugador");
						 Principal VentPrinc = new Principal();
							VentPrinc.setVisible (false);
								
					}
					
					else if(CampoEmail.getText().trim().isEmpty())
					{
						JOptionPane.showMessageDialog(CampoEmail,"Introduzca un Email");
						Principal VentPrinc = new Principal();
						VentPrinc.setVisible (false);
							
					}
					
					else
					{
						Principal VentPrinc = new Principal();
						VentPrinc.setVisible (true);
						jugadores.this.dispose();
					}
					

				
			}
		});
		
		comienza.setIcon(new ImageIcon(getClass().getResource("/Principal/imagenes/Comienza.png")));
		comienza.setBounds(361, 365, 195, 72);
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
