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

public class Principal extends JFrame {

	private JPanel contentPane;


	
	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 90, 900, 600);
		contentPane = new Fondo("Bingo.jpg");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separador = new JSeparator();
		separador.setBounds(0, 434, 915, 9);
		contentPane.add(separador);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\Desktop\\1\u00BA DAM\\Proyecto integrado\\Botones Rojos\\button (97).png"));
		label.setBounds(10, 11, 35, 36);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\Desktop\\1\u00BA DAM\\Proyecto integrado\\Botones Rojos\\button (98).png"));
		label_1.setBounds(55, 11, 36, 36);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\Desktop\\1\u00BA DAM\\Proyecto integrado\\Botones Rojos\\button (99).png"));
		label_2.setBounds(101, 11, 36, 36);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\Desktop\\1\u00BA DAM\\Proyecto integrado\\Botones Rojos\\button (100).png"));
		label_3.setBounds(147, 11, 36, 36);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\Desktop\\1\u00BA DAM\\Proyecto integrado\\Botones Rojos\\button101.png"));
		label_4.setBounds(193, 11, 36, 36);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\Desktop\\1\u00BA DAM\\Proyecto integrado\\Botones Rojos\\button6.png"));
		label_5.setBounds(239, 11, 36, 36);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\Desktop\\1\u00BA DAM\\Proyecto integrado\\Botones Rojos\\button7.png"));
		label_6.setBounds(285, 11, 36, 36);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\Desktop\\1\u00BA DAM\\Proyecto integrado\\Botones Rojos\\button.png"));
		label_7.setBounds(331, 11, 36, 36);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\Desktop\\1\u00BA DAM\\Proyecto integrado\\Botones Rojos\\button (1).png"));
		label_8.setBounds(377, 11, 36, 36);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\Desktop\\1\u00BA DAM\\Proyecto integrado\\Botones Rojos\\button (2).png"));
		label_9.setBounds(423, 11, 37, 36);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\Desktop\\1\u00BA DAM\\Proyecto integrado\\Botones Rojos\\button (3).png"));
		label_10.setBounds(10, 58, 37, 36);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\Desktop\\1\u00BA DAM\\Proyecto integrado\\Botones Rojos\\button (10).png"));
		label_11.setBounds(10, 105, 36, 36);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\Desktop\\1\u00BA DAM\\Proyecto integrado\\Botones Rojos\\button (20).png"));
		label_12.setBounds(10, 152, 36, 36);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\Desktop\\1\u00BA DAM\\Proyecto integrado\\Botones Rojos\\button (42).png"));
		label_13.setBounds(10, 199, 36, 36);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("");
		label_14.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\Desktop\\1\u00BA DAM\\Proyecto integrado\\Botones Rojos\\button (52).png"));
		label_14.setBounds(10, 246, 36, 36);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\Desktop\\1\u00BA DAM\\Proyecto integrado\\Botones Rojos\\button (62).png"));
		label_15.setBounds(10, 293, 36, 36);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("");
		label_16.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\Desktop\\1\u00BA DAM\\Proyecto integrado\\Botones Rojos\\button (72).png"));
		label_16.setBounds(10, 340, 36, 36);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("");
		label_17.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\Desktop\\1\u00BA DAM\\Proyecto integrado\\Botones Rojos\\button (82).png"));
		label_17.setBounds(10, 387, 36, 36);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("");
		label_18.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\git\\Bingo\\src\\Principal\\imagenes\\Botones Rojos\\12.png"));
		label_18.setBounds(55, 58, 37, 36);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("");
		label_19.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\git\\Bingo\\src\\Principal\\imagenes\\Botones Rojos\\13.png"));
		label_19.setBounds(101, 58, 37, 36);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\git\\Bingo\\src\\Principal\\imagenes\\Botones Rojos\\14.png"));
		label_20.setBounds(147, 58, 37, 36);
		contentPane.add(label_20);
		
		JLabel label_21 = new JLabel("");
		label_21.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\git\\Bingo\\src\\Principal\\imagenes\\Botones Rojos\\15.png"));
		label_21.setBounds(193, 58, 37, 36);
		contentPane.add(label_21);
		
		JLabel label_22 = new JLabel("");
		label_22.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\git\\Bingo\\src\\Principal\\imagenes\\Botones Rojos\\16.png"));
		label_22.setBounds(239, 58, 37, 36);
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel("");
		label_23.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\git\\Bingo\\src\\Principal\\imagenes\\Botones Rojos\\17.png"));
		label_23.setBounds(285, 58, 37, 36);
		contentPane.add(label_23);
		
		JLabel label_24 = new JLabel("");
		label_24.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\git\\Bingo\\src\\Principal\\imagenes\\Botones Rojos\\18.png"));
		label_24.setBounds(331, 58, 37, 36);
		contentPane.add(label_24);
		
		JLabel label_25 = new JLabel("");
		label_25.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\git\\Bingo\\src\\Principal\\imagenes\\Botones Rojos\\19.png"));
		label_25.setBounds(377, 58, 37, 36);
		contentPane.add(label_25);
		
		JLabel label_26 = new JLabel("");
		label_26.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\git\\Bingo\\src\\Principal\\imagenes\\Botones Rojos\\20.png"));
		label_26.setBounds(423, 58, 36, 36);
		contentPane.add(label_26);
		
		JLabel label_27 = new JLabel("");
		label_27.setIcon(new ImageIcon("C:\\Users\\JoseAntonio\\git\\Bingo\\src\\Principal\\imagenes\\Botones Rojos\\22.png"));
		label_27.setBounds(55, 105, 36, 36);
		contentPane.add(label_27);
		
		JButton Atras = new JButton("Atras");
		Atras.setBounds(717, 468, 126, 30);
		contentPane.add(Atras);
		
		JButton Salir = new JButton("Salir");
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {						
				Principal.this.dispose();						
			}
		});	
		
		Salir.setBounds(717, 509, 126, 29);
		contentPane.add(Salir);
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
