public class Disponibilidad {
    private String dia;
    private int horaInicio;
    private int horaFin;

    public Disponibilidad(String dia, int horaInicio, int horaFin){
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    //Getters
    public String getDia() {
        return dia;
    }
    public int getHoraInicio() {
        return horaInicio;
    }
    public int getHoraFin() {
        return horaFin;
    }

    //Setters
    public void setDia(String dia) {
        this.dia = dia;
    }
    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }
    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }
}
