package Modelo;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.ResultSetMetaData;


public class ModeloVerificacion {

	private static String CONTRA_SEL="SELECT contrasena FROM Jugadores where nombre='seleccion'";
	
	
	
	//Conexion
	private static Connection conexion = null; //maneja la conexi�n
	static Statement instruccion = null;
	static ResultSet Contrase�a=null;
	
	
	
	public ModeloVerificacion() {
		conexion=ConexionDB.getConexion();
	}
	
	
	
	public static ResultSet Verificacion(){
		String resultado = null;
		
		try{
			instruccion = conexion.createStatement();
			Contrase�a = instruccion.executeQuery(CONTRA_SEL);
			
			
			
		}
		catch( SQLException excepcionSql ) 
		{
			excepcionSql.printStackTrace();
			
		}
		finally{
			try{
				//conjuntoResultados.close();
				instruccion.close();
				//conexion.close();
			}
			catch( SQLException excepcionSql ) 
			{
				excepcionSql.printStackTrace();
			}
		}
		return Contrase�a;
	}
	
	

}