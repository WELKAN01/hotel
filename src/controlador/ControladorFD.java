
package controlador;

import database.MiConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Detalle;
import modelo.Factura;

/**
 *
 * @author Andy
 */
public class ControladorFD {
    public int IdFactura(){
        int id = 0;
        Connection conn= null;
        PreparedStatement pstm=null;
        ResultSet RS=null;
        String sql = "SELECT MAX(id) FROM factura";
        try {
            conn =new MiConexion().getConexion();
            pstm = conn.prepareStatement(sql);
            RS = pstm.executeQuery();
            if (RS.next()) {
                id = RS.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return id;
    }
    public  int INSERTVENTA(Factura f){
int insertados = -1;
        Connection conn= null;
        PreparedStatement pstm=null;
        try{
           conn= new MiConexion().getConexion();        
           String sql="insert into factura values(null,?,?,?,?)"; 
           pstm = conn.prepareStatement(sql);
           //aqui se asigna valores a los campos del modelo set:asignar
           pstm.setString(1,f.getNombre_cli());
           pstm.setString(2,f.getNombre_emp());
           pstm.setDouble(3,f.getPrecio_total());
           pstm.setString(4,f.getFecha());
           insertados= pstm.executeUpdate();
           System.out.println("insertados:"+insertados);
        }catch(Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e2) {
            }
        }
        return insertados;
    }
    public int INSERTARDETALLE(Detalle D){
        int insertados = -1;
        Connection conn= null;
        PreparedStatement pstm=null;
        try {
           conn= new MiConexion().getConexion();        
           String sql="insert into detalle values(null,?,?,?)"; 
           pstm = conn.prepareStatement(sql);
           pstm.setInt(1,D.getServicio());
           pstm.setDouble(2,D.getPrecio());
           pstm.setInt(3,D.getId_factura());
           insertados= pstm.executeUpdate();
        } catch (Exception e) {
                        e.printStackTrace();

        }finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e2) {
            }
        }
        return insertados;
    }
}
