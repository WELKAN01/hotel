
package modelo;

/**
 *
 * @author Andy
 */
public class usuarioView {
    private int id_usu;
    private String usuario;
    private String password;
    private String nomempleado;
    private String dniempleado;
    private String telefonoempleado;
    private String rol;

    public usuarioView() {
    }

    public int getId_usu() {
        return id_usu;
    }

    public void setId_usu(int id_usu) {
        this.id_usu = id_usu;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNomempleado() {
        return nomempleado;
    }

    public void setNomempleado(String nomempleado) {
        this.nomempleado = nomempleado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getDniempleado() {
        return dniempleado;
    }

    public void setDniempleado(String dniempleado) {
        this.dniempleado = dniempleado;
    }

    public String getTelefonoempleado() {
        return telefonoempleado;
    }

    public void setTelefonoempleado(String telefonoempleado) {
        this.telefonoempleado = telefonoempleado;
    }
    
    
}
