package controlador;

import database.MiConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Habitacion;

public class ControladorHabitacion {
    //metodo insertar
    public int insertarHabitacion(Habitacion obj){
        //insertando registros
        int insertados = -1;
        Connection conn= null;
        PreparedStatement pstm=null;
        try{
           conn= new MiConexion().getConexion();        
           String sql="insert into habitacion values(null,?,?,?,?,?,1)"; 
           pstm = conn.prepareStatement(sql);
           //aqui se asigna valores a los campos del modelo set:asignar
           pstm.setString(1,obj.getNumero_ha());
           pstm.setString(2,obj.getTipo_habitacion());
           pstm.setString(3,obj.getDescripcion());
           pstm.setString(4,obj.getEstado());
           pstm.setDouble(5,obj.getPrecio_hab());
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
    public List<Habitacion>listaHabitacion(){
        List<Habitacion>data = new ArrayList<Habitacion>();
        Connection conn = null;
        PreparedStatement pstm=null;
        ResultSet rs = null;
        try{
            conn= new MiConexion().getConexion();
            //mostrar todos los registros de la tabla habitacion
            String sql="select * from habitacion where estado2=1";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            Habitacion c=null;
            while(rs.next()){
                c=new Habitacion();
                c.setId(rs.getInt("id"));
                c.setNumero_ha(rs.getString("numero_ha"));
                c.setTipo_habitacion(rs.getString("tipo_habitacion"));
                c.setDescripcion(rs.getString("descripcion"));
                c.setEstado(rs.getString("estado"));
                c.setPrecio_hab(rs.getDouble("precio_hab"));
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
     public int actualizarHabitacion(Habitacion obj){
        //actaulizando registros
        int actualizados = -1;
        Connection conn= null;
        PreparedStatement pstm=null;
        try{
           conn= new MiConexion().getConexion();        
           String sql="update habitacion set numero_ha=?, tipo_habitacion=?, descripcion=?, estado=?, precio_hab=? where id=?"; 
           pstm = conn.prepareStatement(sql);
           //aqui se asigna valores a los campos del modelo set:asignar
           pstm.setString(1,obj.getNumero_ha());
           pstm.setString(2,obj.getTipo_habitacion());
           pstm.setString(3,obj.getDescripcion());
           pstm.setString(4,obj.getEstado());
           pstm.setDouble(5,obj.getPrecio_hab());
           pstm.setInt(6,obj.getId());
           actualizados= pstm.executeUpdate();
           System.out.println("Actualizados:"+actualizados);
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
      public int eliminarHabitacion(int id){
        //eliminando registros
        int eliminados = -1;
        Connection conn= null;
        PreparedStatement pstm=null;
        try{
           conn= new MiConexion().getConexion();        
           String sql="update habitacion set estado2=0 where id=?"; 
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
//    public List<Habitacion>buscarCampenonato(String nombre){
//        List<Habitacion>data = new ArrayList<Habitacion>();
//        Connection conn = null;
//        PreparedStatement pstm=null;
//        ResultSet rs = null;
//        try{
//            conn= new MiConexion().getConexion();
//            //mostrar todos los registros de la tabla habitacion
//            String sql="{call consultar_cliente(?)}";
//            pstm = conn.prepareStatement(sql);
//            pstm.setString(1, nombre + "%");//obtener nombre
//            rs = pstm.executeQuery();//rs guardando el resultado
//            Habitacion c=null;
//            while(rs.next()){
//                c=new Habitacion();
//                c.setIdHabitacion(rs.getInt("id"));
//                c.setDescripcion(rs.getString("nombre"));
//                c.setAnno(rs.getInt("anho"));
//                data.add(c);
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        } finally {
//            try {
//                if (pstm != null) {
//                    pstm.close();
//                }
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (Exception e2) {
//            }
//        }
//        return data;
//    }
}
