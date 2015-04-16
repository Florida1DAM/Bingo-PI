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

public class jugadores extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNombre;
	private JLabel lblEmail;
	private JTextField textField_1;

	
	
	
	public jugadores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 90, 900, 600);
		contentPane = new Fondo("Bingo.jpg");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIntroduzcaJugadores = new JLabel("");
		lblIntroduzcaJugadores.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\Desktop\\1\u00BA DAM\\Proyecto integrado\\cooltext116276313898490.png"));
		lblIntroduzcaJugadores.setForeground(UIManager.getColor("ToolBar.dockingForeground"));
		lblIntroduzcaJugadores.setBackground(Color.WHITE);
		lblIntroduzcaJugadores.setFont(new Font("Trebuchet MS", Font.PLAIN, 28));
		lblIntroduzcaJugadores.setBounds(241, 11, 471, 80);
		contentPane.add(lblIntroduzcaJugadores);
		
		textField = new JTextField();
		textField.setBounds(299, 185, 149, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setVerticalAlignment(SwingConstants.TOP);
		lblNombre.setBounds(166, 179, 96, 29);
		contentPane.add(lblNombre);
		
		lblEmail = new JLabel("E-Mail");
		lblEmail.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblEmail.setVerticalAlignment(SwingConstants.TOP);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(164, 224, 73, 29);
		contentPane.add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(299, 230, 149, 20);
		contentPane.add(textField_1);
		
		JButton btnNuevoJugador = new JButton("Nuevo Jugador");
		btnNuevoJugador.setBounds(156, 278, 139, 23);
		contentPane.add(btnNuevoJugador);
		
		JButton btnEliminarJugador = new JButton("Eliminar Jugador");
		btnEliminarJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEliminarJugador.setBounds(315, 278, 139, 23);
		contentPane.add(btnEliminarJugador);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(670, 503, 126, 29);
		contentPane.add(btnSalir);
		
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\Desktop\\1\u00BA DAM\\Proyecto integrado\\bolas.jpg"));
		lblNewLabel.setBounds(607, 90, 241, 382);
		contentPane.add(lblNewLabel);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(85, 503, 126, 29);
		contentPane.add(btnAtras);
	}
}
