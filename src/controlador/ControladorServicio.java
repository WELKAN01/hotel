package controlador;

import database.MiConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Servicio;

public class ControladorServicio {
    //metodo insertar
    public int insertarServicio(Servicio obj){
        //insertando registros
        int insertados = -1;
        Connection conn= null;
        PreparedStatement pstm=null;
        try{
           conn= new MiConexion().getConexion();        
           String sql="insert into servicio values(null,?,?,?)"; 
           pstm = conn.prepareStatement(sql);
           //aqui se asigna valores a los campos del modelo set:asignar
           pstm.setString(1,obj.getRuc());
           pstm.setString(2,obj.getNom_serv());
           pstm.setDouble(3,obj.getPrecio());
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
    public List<Servicio>listaServicio(){
        List<Servicio>data = new ArrayList<Servicio>();
        Connection conn = null;
        PreparedStatement pstm=null;
        ResultSet rs = null;
        try{
            conn= new MiConexion().getConexion();
            //mostrar todos los registros de la tabla servicio
            String sql="select * from servicio";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            Servicio c=null;
            while(rs.next()){
                c=new Servicio();
                c.setId(rs.getInt("id"));
                c.setRuc(rs.getString("ruc"));
                c.setNom_serv(rs.getString("nom_serv"));
                c.setPrecio(rs.getDouble("precio"));
                data.add(c);
            }
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
        return data;
    }
    //metodo actualizar
     public int actualizarServicio(Servicio obj){
        //actaulizando registros
        int actualizados = -1;
        Connection conn= null;
        PreparedStatement pstm=null;
        try{
           conn= new MiConexion().getConexion();        
           String sql="update servicio set ruc=?, nom_serv=?, precio=? where id=?"; 
           pstm = conn.prepareStatement(sql);
           //aqui se asigna valores a los campos del modelo set:asignar
           pstm.setString(1,obj.getRuc());
           pstm.setString(2,obj.getNom_serv());
           pstm.setDouble(3,obj.getPrecio());
           pstm.setInt(4,obj.getId());
           actualizados= pstm.executeUpdate();
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
        return actualizados;
    }
    //metodo de eliminar
      public int eliminarServicio(int id){
        //eliminando registros
        int eliminados = -1;
        Connection conn= null;
        PreparedStatement pstm=null;
        try{
           conn= new MiConexion().getConexion();        
           String sql="delete from servicio where id=?"; 
           pstm = conn.prepareStatement(sql);
           //aqui se asigna valores a los campos del modelo set:asignar
           pstm.setInt(1,id);
           eliminados= pstm.executeUpdate();
           System.out.println("Eliminados:"+eliminados);
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
        return eliminados;
    }
    public Servicio buscarServicio(String RUC){
        Connection cn=null;
        PreparedStatement PS=null;
        ResultSet RS=null;
        Servicio AUX= new Servicio();
        try {
            cn=new MiConexion().getConexion();
            String SQL="SELECT * from servicio WHERE ruc = (?)";
            PS=cn.prepareStatement(SQL);
            PS.setString(1,RUC);
            RS=PS.executeQuery();
            while (RS.next()) {
                AUX.setId(RS.getInt("id"));
                AUX.setRuc(RS.getString("ruc"));
                AUX.setNom_serv(RS.getString("nom_serv"));
                AUX.setPrecio(RS.getDouble("precio"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if (PS!=null) {
                    PS.close();
                }
                if (RS!=null) {
                    RS.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return AUX;
    }
}
