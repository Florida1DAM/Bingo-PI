import Modelo.Corredores;
import Principal.Primera;


public class Lanzador {

	public static void main(String[] args) {
		Primera frame = new Primera();
		frame.setVisible(true);
		Corredores c=new Corredores();
		c.conectar();

	}

}
