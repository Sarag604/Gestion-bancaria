public class Cliente {
    private String nombre;
    private String identificacion;

    public Cliente(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }// metodos para cambiar informacion

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void setIdentificacion(String nuevaIdentificacion) {
        this.identificacion = nuevaIdentificacion;
    }

    // metodos para obetener informacion
    public String getNombre() {
        return nombre;
    }

}