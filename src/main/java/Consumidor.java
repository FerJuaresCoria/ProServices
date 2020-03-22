public class Consumidor {

    private String nombre;
    private String apellido;
    private int telefono;
    private String email;

    public Consumidor(String nombre, String apellido, int telefono, String email){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getEmail() {
        return email;
    }
    public String getApellido() {
        return apellido;
    }
    public int getTelefono() {
        return telefono;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
