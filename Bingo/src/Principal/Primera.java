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

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	
	
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
		contentPane = new Fondo("Bingo.jpg");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Start = new JButton("Entrar");
		Start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugadores VentPrinc = new jugadores();
				VentPrinc.setVisible (true);
				Primera.this.dispose();				
				
			}
		});	
		Start.setBounds(638, 516, 89, 23);
		contentPane.add(Start);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\Pictures\\logo bingo bueno escalado2.png"));
		label.setBounds(88, 123, 700, 248);
		contentPane.add(label);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setBounds(655, 446, 46, 14);
		contentPane.add(lblUsuario);
		
		textField = new JTextField();
		textField.setBounds(711, 443, 120, 17);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setBounds(638, 478, 76, 14);
		contentPane.add(lblContrasea);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(742, 516, 89, 23);
		contentPane.add(btnSalir);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(711, 474, 120, 18);
		contentPane.add(passwordField);

	}
}
