import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import java.awt.Font;


public class Primera extends JFrame {

	private JPanel contentPane;
	private JTextField txtIntroduzcaJugador;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public Primera() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNuevoJugador = new JButton("Nuevo Jugador");
		btnNuevoJugador.setBounds(305, 63, 119, 23);
		contentPane.add(btnNuevoJugador);
		
		JButton btnEliminarJugador = new JButton("Eliminar Jugador");
		btnEliminarJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEliminarJugador.setBounds(305, 97, 119, 23);
		contentPane.add(btnEliminarJugador);
		
		JButton btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.setBounds(319, 203, 105, 23);
		contentPane.add(btnAtrs);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(319, 227, 105, 23);
		contentPane.add(btnSalir);
		
		JButton btnEmpezarPartida = new JButton("Empezar Partida");
		btnEmpezarPartida.setBounds(305, 131, 119, 23);
		contentPane.add(btnEmpezarPartida);
		
		txtIntroduzcaJugador = new JTextField();
		txtIntroduzcaJugador.setText("Nombre jugador");
		txtIntroduzcaJugador.setBounds(71, 64, 119, 20);
		contentPane.add(txtIntroduzcaJugador);
		txtIntroduzcaJugador.setColumns(10);
		
		JLabel lblIntroduzcaLosJugadores = new JLabel("Introduzca los jugadores");
		lblIntroduzcaLosJugadores.setFont(new Font("Tahoma", Font.ITALIC, 24));
		lblIntroduzcaLosJugadores.setBounds(84, 11, 275, 29);
		contentPane.add(lblIntroduzcaLosJugadores);
		
		txtEmail = new JTextField();
		txtEmail.setText("E-mail");
		txtEmail.setBounds(71, 98, 86, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 67, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(10, 101, 46, 14);
		contentPane.add(lblEmail);
	}
}
