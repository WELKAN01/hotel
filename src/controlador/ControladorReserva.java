package controlador;

import database.MiConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Reserva;
import modelo.ReservaDTO;

public class ControladorReserva {
    //metodo insertar
    public int insertarReserva(Reserva obj){
        //insertando registros
        int insertados = -1;
        Connection conn= null;
        PreparedStatement pstm=null;
        try{
            conn= new MiConexion().getConexion();       
           String sql="insert into reserva values(null,?,?,?,?,?,1)"; 
           pstm = conn.prepareStatement(sql);
           //aqui se asigna valores a los campos del modelo set:asignar
           pstm.setInt(1,obj.getHabitacion());
           pstm.setInt(2,obj.getCliente());
           pstm.setInt(3,obj.getEmpleado());
           pstm.setString(4,obj.getCantidad_reserva());
           pstm.setString(5,obj.getObservacion());
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
    

    public List<ReservaDTO> listaReserva(){
        List<ReservaDTO> data = new ArrayList<ReservaDTO>();
        Connection conn = null;
        PreparedStatement pstm=null;
        ResultSet rs = null;
        try{
             conn= new MiConexion().getConexion();
            //mostrar todos los registros de la tabla reserva
            String sql="select * from reserva_view where estado=1";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            ReservaDTO c=null;
            while(rs.next()){
                c=new ReservaDTO();
                c.setId(rs.getInt("id"));
                c.setHabitacion(rs.getString("Habitacion"));
                c.setCliente(rs.getString("Cliente"));
                c.setEmpleado(rs.getString("Empleado"));
                c.setCantidad_reserva(rs.getString("Dias"));
                c.setObservacion(rs.getString("observacion"));
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
     public int actualizarReserva(Reserva obj){
        //actaulizando registros
        int actualizados = -1;
        Connection conn= null;
        PreparedStatement pstm=null;
        try{
           conn= new MiConexion().getConexion();        
           String sql="update reserva set habitacion=?, cliente=?, empleado=?, cantidad_reserva=?, observacion=? where id=?"; 
           pstm = conn.prepareStatement(sql);
           //aqui se asigna valores a los campos del modelo set:asignar
           pstm.setInt(1,obj.getHabitacion());
           pstm.setInt(2,obj.getCliente());
           pstm.setInt(3,obj.getEmpleado());
           pstm.setString(4,obj.getCantidad_reserva());
           pstm.setString(5,obj.getObservacion());
           pstm.setInt(6,obj.getId());
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
      public int eliminarReserva(int id){
        //eliminando registros
        int eliminados = -1;
        Connection conn= null;
        PreparedStatement pstm=null;
        try{
           conn= new MiConexion().getConexion();        
           String sql="update reserva set estado=0 where id=?"; 
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
    public List<Reserva> buscarReserva(int id){
    List<Reserva> data = new ArrayList();
    Connection conn=null;
    PreparedStatement PS=null;
    ResultSet RS=null;
    try {
        conn=new MiConexion().getConexion();
        String sql="SELECT * from reserva WHERE id like (?)";
        PS=conn.prepareStatement(sql);
        PS.setInt(1,id);
        RS=PS.executeQuery();
        Reserva VARI=null;
        while(RS.next()){
            VARI=new Reserva();
            VARI.setId(RS.getInt("id"));
            VARI.setCliente(RS.getInt("cliente"));
            VARI.setHabitacion(RS.getInt("habitacion"));
            VARI.setEmpleado(RS.getInt("empleado"));
            VARI.setCantidad_reserva(RS.getString("cantidad_reserva"));
            VARI.setObservacion(RS.getString("observacion"));
            data.add(VARI); //se agregara todo a la data
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
        }
    }
    return data;
    }
//    public List<Reserva>buscarCampenonato(String nombre){
//        List<Reserva>data = new ArrayList<Reserva>();
//        Connection conn = null;
//        PreparedStatement pstm=null;
//        ResultSet rs = null;
//        try{
//            conn= new MiConexion().getConexion();
//            //mostrar todos los registros de la tabla reserva
//            String sql="{call consultar_cliente(?)}";
//            pstm = conn.prepareStatement(sql);
//            pstm.setString(1, nombre + "%");//obtener nombre
//            rs = pstm.executeQuery();//rs guardando el resultado
//            Reserva c=null;
//            while(rs.next()){
//                c=new Reserva();
//                c.setIdReserva(rs.getInt("id"));
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
