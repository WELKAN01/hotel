package controlador;

import database.MiConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import modelo.Empleado;

public class ControladorEmpleado {
    //metodo insertar
    public int insertarEmpleado(Empleado obj){
        //insertando registros
        int insertados = -1;
        Connection conn= null;
        PreparedStatement pstm=null;
        try{
           conn= new MiConexion().getConexion();        
           String sql="insert into Empleado values(null,?,?,?,?,1)"; 
           pstm = conn.prepareStatement(sql);
           //aqui se asigna valores a los campos del modelo set:asignar
           pstm.setString(1,obj.getNombre_empleado());
           pstm.setString(2,obj.getApellido_empleado());
           pstm.setString(3,obj.getDni_empleado());
           pstm.setString(4,obj.getTelefono_empleado());
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
    public List<Empleado>listaEmpleado(){
        List<Empleado>data = new ArrayList<Empleado>();
        Connection conn = null;
        PreparedStatement pstm=null;
        ResultSet rs = null;
        try{
            conn= new MiConexion().getConexion();
            //mostrar todos los registros de la tabla Empleado
            String sql="select * from Empleado where estado=1 ";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            Empleado c=null;
            while(rs.next()){
                c=new Empleado();
                c.setId(rs.getInt("id"));
                c.setNombre_empleado(rs.getString("nombre_empleado"));
                c.setApellido_empleado(rs.getString("apellido_empleado"));
                c.setDni_empleado(rs.getString("dni_empleado"));
                c.setTelefono_empleado(rs.getString("telefono_empleado"));
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
     public int actualizarEmpleado(Empleado obj){
        //actaulizando registros
        int actualizados = -1;
        Connection conn= null;
        PreparedStatement pstm=null;
        try{
           conn= new MiConexion().getConexion();        
           String sql="update Empleado set nombre_empleado=?,apellido_empleado=?, dni_empleado=?, telefono_empleado=? where id=?"; 
           pstm = conn.prepareStatement(sql);
           //aqui se asigna valores a los campos del modelo set:asignar
           pstm.setString(1,obj.getNombre_empleado());
           pstm.setString(2,obj.getApellido_empleado());
           pstm.setString(3,obj.getDni_empleado());
           pstm.setString(4,obj.getTelefono_empleado());
           pstm.setInt(5,obj.getId());
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
      public int eliminarEmpleado(int id){
        //eliminando registros
        int eliminados = -1;
        Connection conn= null;
        PreparedStatement pstm=null;
        try{
           conn= new MiConexion().getConexion();        
           String sql="update Empleado set estado=0 where id=?"; 
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
//    public List<Empleado>buscarCampenonato(String nombre){
//        List<Empleado>data = new ArrayList<Empleado>();
//        Connection conn = null;
//        PreparedStatement pstm=null;
//        ResultSet rs = null;
//        try{
//            conn= new MiConexion().getConexion();
//            //mostrar todos los registros de la tabla Empleado
//            String sql="{call consultar_Empleado(?)}";
//            pstm = conn.prepareStatement(sql);
//            pstm.setString(1, nombre + "%");//obtener nombre
//            rs = pstm.executeQuery();//rs guardando el resultado
//            Empleado c=null;
//            while(rs.next()){
//                c=new Empleado();
//                c.setIdEmpleado(rs.getInt("id"));
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
public List<Empleado> buscarEmpleado(String EmpleadoNom){
    List<Empleado> data = new ArrayList();
    Connection conn=null;
    PreparedStatement PS=null;
    ResultSet RS=null;
    try {
        conn=new MiConexion().getConexion();
        String sql="SELECT * from Empleado WHERE nombre_empleado like (?)";
        PS=conn.prepareStatement(sql);
        PS.setString(1,EmpleadoNom);
        RS=PS.executeQuery();
        Empleado VARI=null;
        while(RS.next()){
            VARI=new Empleado();
            VARI.setId(RS.getInt("id"));
            VARI.setNombre_empleado(RS.getString("nombre_empleado"));
            VARI.setApellido_empleado(RS.getString("apellido_empleado"));
            VARI.setDni_empleado(RS.getString("dni_empleado"));
            VARI.setTelefono_empleado(RS.getString("telefono_empleado"));
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
    public int buscarDNI(String DNI){
    Connection conn=null;
    PreparedStatement PS=null;
    ResultSet RS=null;
    Empleado VARI=new Empleado();
    try {
        conn=new MiConexion().getConexion();
        String sql="SELECT * from Empleado WHERE dni_empleado like (?)";
        PS=conn.prepareStatement(sql);
        PS.setString(1,DNI);
        RS=PS.executeQuery();
        while(RS.next()){
            VARI.setId(RS.getInt("id"));
            VARI.setNombre_empleado(RS.getString("nombre_empleado"));
            VARI.setApellido_empleado(RS.getString("apellido_empleado"));
            VARI.setDni_empleado(RS.getString("dni_empleado"));
            VARI.setTelefono_empleado(RS.getString("telefono_empleado"));
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
    return VARI.getId();
    }
}
