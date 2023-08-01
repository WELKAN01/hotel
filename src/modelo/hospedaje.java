
package modelo;

/**
 *
 * @author GONZALO
 */
public class hospedaje {
        private int id;
        private String nombre_cli;
        private String apellido;
        private String dni;
        private double totaSl;
        private String fecha;

    public hospedaje() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_cli() {
        return nombre_cli;
    }

    public void setNombre_cli(String nombre_cli) {
        this.nombre_cli = nombre_cli;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getTotaSl() {
        return totaSl;
    }

    public void setTotaSl(double totaSl) {
        this.totaSl = totaSl;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
}

