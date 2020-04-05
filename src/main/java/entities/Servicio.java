package entities;

import java.util.ArrayList;
import java.util.List;

public class Servicio {

    private String tipoServicio;
    private List<String> tareas;

    /*
    * TODO:
    *       []Arreglar setter y getter de "tareas"
    * */

    public Servicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
        this.tareas = new ArrayList<String>();
    }

    //Getters
    public String getTipoServicio() {
        return tipoServicio;
    }
    public List<String> getTareas() {
        return tareas;
    }

    //Setters
    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
    public void setTareas(List<String> tareas) {
        this.tareas = tareas;
    }
}
