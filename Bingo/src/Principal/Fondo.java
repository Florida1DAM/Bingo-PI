package Principal;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;



public class Fondo extends JPanel {

	
	private static final long serialVersionUID = 1L;
	
	ImageIcon imagen1;
	
	public Fondo(String nombre) {

		imagen1 = new ImageIcon (getClass().getResource(nombre));
		setSize(imagen1.getIconWidth(),imagen1.getIconHeight());
				
	}
	protected void paintComponent (Graphics g){
		
		Dimension d = getSize();//new Dimension(imagen.getIconWidth(),imagen.getIconHeight());
		g.drawImage(imagen1.getImage(),0,0, d.width, d.height,null);
		this.setOpaque(false);
		super.paintComponent(g);
		
	}

}
