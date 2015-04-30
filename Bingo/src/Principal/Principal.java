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
import javax.swing.JLayeredPane;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import javax.swing.JSplitPane;

import java.awt.Color;

import javax.swing.JToggleButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Font;


public class Principal extends JFrame {

	private JPanel pantalla;
    private JLabel marcador[]=new JLabel[91];
    private JLabel SacaBolas[]=new JLabel[91];
    private int cont=0;

	
	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 90, 900, 600);
		pantalla = new Fondo("/Principal/imagenes/fondoPrincipal.jpg");
		pantalla.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pantalla);
		pantalla.setLayout(null);

		setTitle("Bingo twist");
		
		// Añade marcador de bolas salidas
		for (int i=0;i<=8;i++){
			for (int j=0;j<=9;j++){
				cont=cont+1;
		marcador[cont]=new JLabel();	
		marcador[cont].setIcon(new ImageIcon((getClass().getResource("/Principal/imagenes/Botones Rojos/"+cont+".png"))));
		marcador[cont].setBounds(10+j*60, 10+i*45, 38, 38);
		pantalla.add(marcador[cont]);
		}}

		
		JButton Salir = new JButton("Salir");
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {						
				Principal.this.dispose();						
			}
		});	
		
		Salir.setBounds(748, 521, 126, 29);
		pantalla.add(Salir);
		

		JButton PartidaNueva = new JButton("Partida Nueva");
		PartidaNueva.setBounds(748, 480, 126, 30);
		pantalla.add(PartidaNueva);
		
		JButton BolaNueva = new JButton("Bola Nueva");
		BolaNueva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {						
				
		//Falta sacar la bola bien
				
				int a=(int)(Math.random()*90+1);
				SacaBolas[a]=new JLabel();
				SacaBolas[a].setIcon(new ImageIcon((getClass().getResource("/Principal/imagenes/Bolas/bolaBingo"+a+".png"))));
				SacaBolas[a].setBounds(50, 450, 100, 100);
				pantalla.add(SacaBolas[a]);
					
				
			}
		});	
		
		
		
		BolaNueva.setBounds(629, 480, 109, 70);
		pantalla.add(BolaNueva);
		
		JButton Linea = new JButton("");
		Linea.setIcon(new ImageIcon(getClass().getResource("/Principal/imagenes/btnLinea.png")));
		Linea.setBounds(629, 11, 109, 50);
		pantalla.add(Linea);
		
		JButton Bingo = new JButton("");
		Bingo.setIcon(new ImageIcon(getClass().getResource("/Principal/imagenes/btnBingo.png")));
		Bingo.setBounds(765, 11, 109, 50);
		pantalla.add(Bingo);
		
		JTabbedPane panelPestaña = new JTabbedPane(JTabbedPane.TOP);
		panelPestaña.setBounds(629, 72, 245, 393);
		pantalla.add(panelPestaña);
		
		JPanel pestaña = new JPanel();
		panelPestaña.addTab("Jugador 1", null, pestaña, null);
		
		JPanel pestaña1 = new JPanel();
		panelPestaña.addTab("Jugador 2", null, pestaña1, null);
		
		JPanel pestaña2 = new JPanel();
		panelPestaña.addTab("Jugador 3", null, pestaña2, null);

	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
