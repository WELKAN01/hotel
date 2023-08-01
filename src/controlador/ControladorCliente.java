package controlador;

import database.MiConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

public class ControladorCliente {
    //metodo insertar
    public int insertarCliente(Cliente obj){
        //insertando registros
        int insertados = -1;
        Connection conn= null;
        PreparedStatement pstm=null;
        try{
           conn= new MiConexion().getConexion();        
           String sql="insert into Cliente values(null,?,?,?,?,?,1)"; 
           pstm = conn.prepareStatement(sql);
           //aqui se asigna valores a los campos del modelo set:asignar
           
           pstm.setString(1,obj.getNombre());
           pstm.setString(2,obj.getApellido());
           pstm.setString(3,obj.getDni());
           pstm.setString(4,obj.getDireccion());
           pstm.setString(5,obj.getTelefono());
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
    public List<Cliente>listaCliente(){
        List<Cliente>data = new ArrayList<Cliente>();
        Connection conn = null;
        PreparedStatement pstm=null;
        ResultSet rs = null;
        try{
            conn= new MiConexion().getConexion();
            //mostrar todos los registros de la tabla Cliente
            String sql="select * from Cliente where estado=1 ";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            Cliente c=null;
            while(rs.next()){
                c=new Cliente();
                c.setId(rs.getInt("id"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setDni(rs.getString("dni"));
                c.setDireccion(rs.getString("direccion"));
                c.setTelefono(rs.getString("telefono"));
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
     public int actualizarCliente(Cliente obj){
        //actaulizando registros
        int actualizados = -1;
        Connection conn= null;
        PreparedStatement pstm=null;
        try{
           conn= new MiConexion().getConexion();        
           String sql="update Cliente set nombre=?, apellido=?, dni=?, direccion=?, telefono=? where id=?"; 
           pstm = conn.prepareStatement(sql);
           //aqui se asigna valores a los campos del modelo set:asignar
           pstm.setString(1,obj.getNombre());
           pstm.setString(2,obj.getApellido());
           pstm.setString(3,obj.getDni());
           pstm.setString(4,obj.getDireccion());
           pstm.setString(5,obj.getTelefono());
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
      public int eliminarCliente(int id){
        //eliminando registros
        int eliminados = -1;
        Connection conn= null;
        PreparedStatement pstm=null;
        try{
           conn= new MiConexion().getConexion();        
           String sql="update cliente set estado=0 where id=?"; 
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
//    public List<Cliente>buscarCampenonato(String nombre){
//        List<Cliente>data = new ArrayList<Cliente>();
//        Connection conn = null;
//        PreparedStatement pstm=null;
//        ResultSet rs = null;
//        try{
//            conn= new MiConexion().getConexion();
//            //mostrar todos los registros de la tabla Cliente
//            String sql="{call consultar_Cliente(?)}";
//            pstm = conn.prepareStatement(sql);
//            pstm.setString(1, nombre + "%");//obtener nombre
//            rs = pstm.executeQuery();//rs guardando el resultado
//            Cliente c=null;
//            while(rs.next()){
//                c=new Cliente();
//                c.setIdCliente(rs.getInt("id"));
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
public List<Cliente> buscarCliente(String ClienteNom){
    List<Cliente> data = new ArrayList();
    Connection conn=null;
    PreparedStatement PS=null;
    ResultSet RS=null;
    try {
        conn=new MiConexion().getConexion();
        String sql="SELECT * from cliente WHERE nombre like (?)";
        PS=conn.prepareStatement(sql);
        PS.setString(1,ClienteNom);
        RS=PS.executeQuery();
        Cliente VARI=null;
        while(RS.next()){
            VARI=new Cliente();
            VARI.setId(RS.getInt("id"));
            VARI.setNombre(RS.getString("nombre"));
            VARI.setApellido(RS.getString("Apellido"));
            VARI.setDni(RS.getString("dni"));
            VARI.setDireccion(RS.getString("direccion"));
            VARI.setTelefono(RS.getString("telefono"));
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
public Cliente buscarDNI(String DNI){
    Connection conn=null;
    PreparedStatement PS=null;
    ResultSet RS=null;
    Cliente VARI=new Cliente();
    try {
        conn=new MiConexion().getConexion();
        String sql="SELECT * from cliente WHERE dni = (?)";
        PS=conn.prepareStatement(sql);
        PS.setString(1,DNI);
        RS=PS.executeQuery();
        while(RS.next()){
            VARI=new Cliente();
            VARI.setId(RS.getInt("id"));
            VARI.setNombre(RS.getString("nombre"));
            VARI.setApellido(RS.getString("Apellido"));
            VARI.setDni(RS.getString("dni"));
            VARI.setDireccion(RS.getString("direccion"));
            VARI.setTelefono(RS.getString("telefono"));        }
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
    return VARI;
    }
}
