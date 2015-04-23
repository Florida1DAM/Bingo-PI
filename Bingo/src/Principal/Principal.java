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

public class Principal extends JFrame {

	private JPanel pantalla;


	
	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 90, 900, 600);
		pantalla = new Fondo("Bingo.jpg");
		pantalla.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pantalla);
		pantalla.setLayout(null);
		setTitle("Bingo twist");
		
		JButton Salir = new JButton("Salir");
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {						
				Principal.this.dispose();						
			}
		});	
		
		Salir.setBounds(748, 521, 126, 29);
		pantalla.add(Salir);
		
		JButton btnPartidaNueva = new JButton("Partida Nueva");
		btnPartidaNueva.setBounds(748, 480, 126, 30);
		pantalla.add(btnPartidaNueva);
		
		JButton btnBolaNueva = new JButton("Bola Nueva");
		btnBolaNueva.setBounds(629, 480, 109, 70);
		pantalla.add(btnBolaNueva);
		
		JButton btnLinea = new JButton("");
		btnLinea.setIcon(new ImageIcon(getClass().getResource("/Principal/imagenes/btnLinea.png")));
		btnLinea.setBounds(629, 11, 109, 50);
		pantalla.add(btnLinea);
		
		JButton btnBingo = new JButton("");
		btnBingo.setIcon(new ImageIcon(getClass().getResource("/Principal/imagenes/btnBingo.png")));
		btnBingo.setBounds(765, 11, 109, 50);
		pantalla.add(btnBingo);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(629, 72, 245, 393);
		pantalla.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Jugador 1", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Jugador 2", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Jugador 3", null, panel_2, null);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
