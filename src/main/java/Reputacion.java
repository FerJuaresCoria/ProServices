public abstract class Reputacion {

    private int calificacionesRecibidasPositivasSeguidas;
    private int calificacionesRecibidasNegativasSeguidas;

    public Reputacion(){

    }

    //Getters
    public int getCalificacionesRecibidasPositivasSeguidas() {
        return calificacionesRecibidasPositivasSeguidas;
    }
    public int getCalificacionesRecibidasNegativasSeguidas() {
        return calificacionesRecibidasNegativasSeguidas;
    }

    //Setters
    public void setCalificacionesRecibidasPositivasSeguidas(int calificacionesRecibidasPositivasSeguidas) {
        this.calificacionesRecibidasPositivasSeguidas = calificacionesRecibidasPositivasSeguidas;
    }
    public void setCalificacionesRecibidasNegativasSeguidas(int calificacionesRecibidasNegativasSeguidas) {
        this.calificacionesRecibidasNegativasSeguidas = calificacionesRecibidasNegativasSeguidas;
    }

    //Abstract
    public abstract void recibirCalificacion(Calificacion calificacion);

}
