
package modelo;

public class Empleado {
    private Integer id;
    private String nombre_empleado;
    private String apellido_empleado;
    private String dni_empleado;
    private String telefono_empleado;
    private Integer estado;
    public Empleado() {
    }

    public Empleado(Integer id, String nombre_empleado, String apellido_empleado, String dni_empleado, String telefono_empleado,Integer estado) {
        this.id = id;
        this.nombre_empleado = nombre_empleado;
        this.apellido_empleado = apellido_empleado;
        this.dni_empleado = dni_empleado;
        this.telefono_empleado = telefono_empleado;
        this.estado=estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getApellido_empleado() {
        return apellido_empleado;
    }

    public void setApellido_empleado(String apellido_empleado) {
        this.apellido_empleado = apellido_empleado;
    }

    public String getDni_empleado() {
        return dni_empleado;
    }

    public void setDni_empleado(String dni_empleado) {
        this.dni_empleado = dni_empleado;
    }

    public String getTelefono_empleado() {
        return telefono_empleado;
    }

    public void setTelefono_empleado(String telefono_empleado) {
        this.telefono_empleado = telefono_empleado;
    }
     public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    
    
}
