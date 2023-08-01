package modelo;

public class Habitacion {

    private Integer id;
    private String numero_ha;
    private String tipo_habitacion;
    private String descripcion;
    private String estado;
    private Double precio_hab;
    private Integer estado2;

    public Habitacion() {
    }

    public Habitacion(Integer id, String numero_ha, String tipo_habitacion, String descripcion, String estado, Double precio_hab,
Integer estado2) 
    {
        this.id = id;
        this.numero_ha = numero_ha;
        this.tipo_habitacion = tipo_habitacion;
        this.descripcion = descripcion;
        this.estado = estado;
        this.precio_hab = precio_hab;
        this.estado2=estado2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero_ha() {
        return numero_ha;
    }

    public void setNumero_ha(String numero_ha) {
        this.numero_ha = numero_ha;
    }

    public String getTipo_habitacion() {
        return tipo_habitacion;
    }

    public void setTipo_habitacion(String tipo_habitacion) {
        this.tipo_habitacion = tipo_habitacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getPrecio_hab() {
        return precio_hab;
    }

    public void setPrecio_hab(Double precio_hab) {
        this.precio_hab = precio_hab;
    }

    public Integer getEstado2() {
        return estado2;
    }

    public void setEstado2(Integer estado2) {
        this.estado2 = estado2;
    }



    

    

}
