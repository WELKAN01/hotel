package modelo;

public class Reserva {

    private Integer id;
    private Integer habitacion;
    private Integer cliente;
    private Integer empleado;
    private String cantidad_reserva;
    private String observacion;
    private Integer estado;

    public Reserva() {
    }

    public Reserva(Integer id, Integer habitacion, Integer cliente, Integer empleado, String cantidad_reserva, String observacion,Integer estado) {
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

    public Integer getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Integer habitacion) {
        this.habitacion = habitacion;
    }

    public Integer getCliente() {
        return cliente;
    }

    public void setCliente(Integer cliente) {
        this.cliente = cliente;
    }

    public Integer getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Integer empleado) {
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