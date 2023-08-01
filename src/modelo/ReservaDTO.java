package modelo;

public class ReservaDTO {

    private Integer id;
    private String habitacion;
    private String cliente;
    private String empleado;
    private String cantidad_reserva;
    private String observacion;
    private Integer estado;

    public ReservaDTO() {
    }

    public ReservaDTO(Integer id, String habitacion, String cliente, String empleado, String cantidad_reserva, String observacion,Integer estado) {
        this.id = id;
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.empleado = empleado;
        this.cantidad_reserva = cantidad_reserva;
        this.observacion = observacion;
        this.estado=estado;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getCantidad_reserva() {
        return cantidad_reserva;
    }

    public void setCantidad_reserva(String cantidad_reserva) {
        this.cantidad_reserva = cantidad_reserva;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
     public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    
    

}