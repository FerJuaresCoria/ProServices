public class Calificacion {

    private int estrellas;
    private String descripcion;

    public Calificacion(int estrellas) {
        this.estrellas = estrellas;
        this.descripcion = null;
    }

    public Calificacion(int estrellas, String descripcion) {
        this.estrellas = estrellas;
        this.descripcion = descripcion;
    }

    //Getters
    public int getEstrellas() {
        return estrellas;
    }
    public String getDescripcion() {
        return descripcion;
    }

    //Setters
    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
