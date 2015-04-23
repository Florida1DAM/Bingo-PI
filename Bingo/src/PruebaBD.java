import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;


public class PruebaBD extends JFrame {

	private JPanel contentPane;
	private JTextField txtTextoBd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaBD frame = new PruebaBD();
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
	public PruebaBD() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTextoBd = new JTextField();
		txtTextoBd.setText("Texto BD");
		txtTextoBd.setBounds(10, 74, 86, 20);
		contentPane.add(txtTextoBd);
		txtTextoBd.setColumns(10);
		
		JLabel lblEstoSeSubira = new JLabel("Esto se subira");
		lblEstoSeSubira.setBounds(10, 37, 86, 26);
		contentPane.add(lblEstoSeSubira);
		
		JButton btnSubir = new JButton("Subir");
		btnSubir.setBounds(121, 139, 89, 23);
		contentPane.add(btnSubir);
	}
}
