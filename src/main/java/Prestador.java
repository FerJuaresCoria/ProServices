import java.util.ArrayList;
import java.util.List;

public class Prestador {

    private String foto;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String tipoDocumento;
    private int nroDocumento;
    private List<Integer> telefono;
    private List<String> email;
    private Reputacion reputacion;

    /*
     * TODO:
     *      []Generar reputacion
     *      []Arreglar setters y getters de ArrayList's
     *          []telefono
     *          []email
     * */

    public Prestador(String foto, String nombre, String apellido, String fechaNacimiento, String tipoDocumento, int nroDocumento, int telefono, String email) {
        this.foto = foto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.telefono = new ArrayList<Integer>();

        this.email = new ArrayList<String>();

    }

    //Getters
    public String getFoto() {
        return foto;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public String getTipoDocumento() {
        return tipoDocumento;
    }
    public int getNroDocumento() {
        return nroDocumento;
    }
    public List<Integer> getTelefono() {
        return telefono;
    }
    public List<String> getEmail() {
        return email;
    }
    public Reputacion getReputacion() {
        return reputacion;
    }

    //Setters
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public void setNroDocumento(int nroDocumento) {
        this.nroDocumento = nroDocumento;
    }
    public void setTelefono(List<Integer> telefono) {
        this.telefono = telefono;
    }
    public void setEmail(List<String> email) {
        this.email = email;
    }
    public void setReputacion(Reputacion reputacion) {
        this.reputacion = reputacion;
    }
}
