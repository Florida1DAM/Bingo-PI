import Modelo.ConexionDB;
import Modelo.modeloCorredores;
import Principal.Primera;


public class Lanzador {

	public static void main(String[] args) {
		
		
		//Establecemos la conexion con la base de datos
				ConexionDB Bingo;
				
				//Generamos el objeto
				Bingo=new ConexionDB ("91.121.110.152","Bingo","rootbingo","bingoplayers");
				
				if (Bingo.connectDB()==true) System.out.println("Conectados con éxito");
				else System.out.println("Error en la conexión");	
				
		
			
		
		
		
		Primera frame = new Primera();
		frame.setVisible(true);
		

	}

}
