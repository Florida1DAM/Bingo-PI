package Modelo;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.ResultSetMetaData;


public class modeloCorredores {
	//DEVOLVER CORREDORES
	private static String USUARIO_SEL="SELECT * FROM Jugadores";
	private static String USUARIO_COL="nombre";
	
	
	//Conexion
	private Connection conexion = null;// maneja la conexión
	Statement instruccion = null;
	ResultSet conjuntoResultados = null;
	
	
	//usuariosDB
	private ArrayList<String> usuarios=null;
	
	
	
	public modeloCorredores() {
		conexion=ConexionDB.getConexion();
		usuarios= new ArrayList<String>();
	}
	
	
	
	public ArrayList getusuarios(){
		try{
			instruccion = this.conexion.createStatement();
			conjuntoResultados = instruccion.executeQuery(USUARIO_SEL);

			//Listaremos por pantalla los datos
			while( conjuntoResultados.next() ) {
				usuarios.add (conjuntoResultados.getString(USUARIO_COL));
			}// fin de while
			return usuarios;
		}
		catch( SQLException excepcionSql ) 
		{
			excepcionSql.printStackTrace();
			return usuarios;
		}
		finally{
			try{
				conjuntoResultados.close();
				instruccion.close();

				//conexion.close();

			}
			catch( SQLException excepcionSql ) 
			{
				excepcionSql.printStackTrace();
			}
		}
	}
	
	

}
