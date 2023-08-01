
package controlador;

import database.MiConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.usuario;
import modelo.usuarioView;
import vista.JF_Factura;
import vista.MENU;

/**
 *
 * @author Andy
 */
public class ControladorUsuario {
    
    public List<usuarioView> listadousuario(){
        List <usuarioView> AUXILIAR=new ArrayList<>();
        Connection cn=null;
        PreparedStatement PS=null;
        String sql="Select * from usuario_vista";
        ResultSet RS=null;
        try {
            cn= new MiConexion().getConexion();
            PS= cn.prepareStatement(sql);
            RS= PS.executeQuery();
             usuarioView U=null;
            while (RS.next()) {
                U= new usuarioView();
                U.setId_usu(RS.getInt("id"));
                U.setUsuario(RS.getString("usuario"));
                U.setPassword(RS.getString("password"));
                U.setNomempleado(RS.getString("nombre_empleado"));
                U.setDniempleado(RS.getString("dni_empleado"));
                U.setTelefonoempleado(RS.getString("telefono_empleado"));
                U.setRol(RS.getString("roles"));
                AUXILIAR.add(U);
            }
        } catch (Exception e) {
           e.printStackTrace();
        }finally{
            try {
             if (PS != null) {
                PS.close();
            }
            if (RS != null) {
                RS.close();
            }   
            } catch (Exception e) {
            }
        }
        return AUXILIAR;
    }
    public List<usuarioView>getidnombre(String DNI){
        List<usuarioView> DATAUX=new ArrayList<>();
        Connection conn=null;
        PreparedStatement PS=null;
        ResultSet RS=null;
        try {
            conn=new MiConexion().getConexion();
            String sql="Select * from usuario_vista where DNI like ?";
            PS=conn.prepareStatement(sql);
            PS.setString(1, DNI);
            RS=PS.executeQuery();
            usuarioView AUX=null;
            if (RS.next()) {
                AUX= new usuarioView();
                AUX.setId_usu(RS.getInt("id"));
                AUX.setUsuario(RS.getString("usuario"));
                AUX.setPassword(RS.getString("password"));
                AUX.setNomempleado(RS.getString("nombre_empleado"));
                AUX.setDniempleado(RS.getString("dni_empleado"));
                DATAUX.add(AUX);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
              if (PS!=null) {
                PS.close();
                }
              if(conn!=null){
                conn.close();
                }  
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }
        return DATAUX;
    }
    public List<usuarioView> ingress(String user,String pass){
        List<usuarioView> datau=new ArrayList<>();
         Connection cn=null;
        PreparedStatement PS=null;
        String sql = "select * from usuario_vista where usuario=? and password=?";
        ResultSet rs=null;
        usuarioView u = new usuarioView();
        try {
            cn= new MiConexion().getConexion();
            PS= cn.prepareStatement(sql);
            PS.setString(1, user);
            PS.setString(2, pass);
            rs= PS.executeQuery();
            if (rs.next()) {
                u.setRol(rs.getString("roles"));
                u.setNomempleado(rs.getString("nombre_empleado"));
                u.setUsuario(rs.getString("usuario"));
                u.setDniempleado(rs.getString("dni_empleado"));
                u.setTelefonoempleado(rs.getString("telefono_empleado"));
                datau.add(u);
                System.out.println("resuelto");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
             if (PS != null) {
                PS.close();
            }
            if (rs != null) {
                rs.close();
            }   
            } catch (Exception e) {
            }
        }
        return datau;
    }
    
//    public usuarioView buscadorUsuario(String usuario){
//         Connection cn=null;
//        PreparedStatement PS=null;
//        String sql = "select * from usuario_vista where usuario=?";
//        ResultSet rs=null;
//        usuarioView u = new usuarioView();
//    }
}
