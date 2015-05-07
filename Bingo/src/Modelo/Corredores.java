package Modelo;

public class Corredores {
	static ConexionDB corredoresDB;
	static modeloCorredores mCorredor;
	
	

	public void conectar(){	
		//Generado el objeto


		corredoresDB=ConexionDB.getInstance("localhost","Bingo","UsuarioPrueba","prueba");

		if(corredoresDB.connectDB()==true) {
			System.out.println("CONECTADOS CON EXITO");
			mCorredor=new modeloCorredores(corredoresDB.getConexion());
			mCorredor.getDatosCorredores();
			System.out.println("LISTADO DE CORRREDORES");
		}
		else System.out.println("ERROR EN LA CONEXION");
	}

}
