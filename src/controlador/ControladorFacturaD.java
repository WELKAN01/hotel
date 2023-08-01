
package controlador;

import database.MiConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import vista.Factura;

/**
 *
 * @author Andy
 */
public class ControladorFacturaD {
    int valor=0;
    public int InsertFactura(Factura fa){
        Connection cn=null;
        PreparedStatement PS=null;
        ResultSet RS=null;
            try {
            String sql="insert into factura values (null,?,?,?,?)";
            cn=new MiConexion().getConexion();
            PS=cn.prepareStatement(sql);
         valor=PS.executeUpdate();
            } catch (Exception e) {
        }
       return valor;
    }
}
