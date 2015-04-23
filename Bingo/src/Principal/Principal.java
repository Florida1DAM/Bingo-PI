package Principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JMenuBar;

import java.awt.Button;

import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;

import java.awt.List;

import javax.swing.JRadioButton;
import javax.swing.JTree;
import javax.swing.JInternalFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;

public class Principal extends JFrame {

	private JPanel pantalla;
    private JLabel marcador[]=new JLabel[91];
    private int cont=0;

	
	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 90, 900, 600);
		pantalla = new Fondo("Bingo.jpg");
		pantalla.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pantalla);
		pantalla.setLayout(null);
		
		JSeparator separador = new JSeparator();
		separador.setBounds(0, 434, 915, 9);
		pantalla.add(separador);
		
		// Añade marcador de bolas salidas
		for (int i=0;i<=8;i++){
			for (int j=0;j<=9;j++){
				cont=cont+1;
		marcador[cont]=new JLabel();	
		marcador[cont].setIcon(new ImageIcon((getClass().getResource("/Principal/imagenes/Botones Rojos/"+cont+".png"))));
		marcador[cont].setBounds(10+j*60, 10+i*45, 38, 38);
		pantalla.add(marcador[cont]);
		}}
		
		
		JButton Atras = new JButton("Atras");
		Atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugadores VentPrinc = new jugadores();
				VentPrinc.setVisible (true);
				Principal.this.dispose();			
				
			}
		});	
		Atras.setBounds(717, 468, 126, 30);
		pantalla.add(Atras);
		
		JButton Salir = new JButton("Salir");
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {						
				Principal.this.dispose();						
			}
		});	
		
		Salir.setBounds(717, 509, 126, 29);
		pantalla.add(Salir);
		
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
