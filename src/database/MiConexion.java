package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MiConexion {
     static{
         try{
             //conectar con el driver de MySQL
             Class.forName("com.mysql.jdbc.Driver");
         }catch(ClassNotFoundException e){
             e.printStackTrace();
         }
     }
    
     
    public Connection getConexion(){
        Connection conn=null;
        try{
            conn= DriverManager.getConnection(
                                     "jdbc:mysql://localhost:3306/hotel",
                                     "root","");
        }catch(SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
    
    public static void main(String[] args) {
        MiConexion mysql = new MiConexion();
        java.sql.Connection cnx = mysql.getConexion();
        if(cnx!=null){
            System.out.println("Conexion Satisfactoria");
            try{
                cnx.close();
            }catch(SQLException ex){
                System.out.println("Error al desconectar:"+ex);
            }
        }
    }
}
