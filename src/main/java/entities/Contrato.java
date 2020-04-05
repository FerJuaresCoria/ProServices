package entities;

public class Contrato {

    private Prestador prestador;
    private Consumidor consumidor;
    private Tarea tarea;
    private String fecha;
    private int hora;
    private String direccion;
    private EstadoContrato estado;

    public Contrato(Prestador prestador, Consumidor consumidor, Tarea tarea, String fecha, int hora, String direccion, EstadoContrato estado){
        this.consumidor = consumidor;
        this.prestador = prestador;
        this.tarea = tarea;
        this.fecha = fecha;
        this.hora = hora;
        this.direccion = direccion;
        this.estado = estado;
    }

    //Getters
    public Prestador getPrestador() {
        return prestador;
    }
    public Consumidor getConsumidor() {
        return consumidor;
    }
    public Tarea getTarea() {
        return tarea;
    }
    public String getFecha() {
        return fecha;
    }
    public int getHora() {
        return hora;
    }
    public String getDireccion() {
        return direccion;
    }
    public EstadoContrato getEstado() {
        return estado;
    }

    //Setters
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }
    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }
    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public void setEstado(EstadoContrato estado) {
        this.estado = estado;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
