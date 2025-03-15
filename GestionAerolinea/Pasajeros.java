package GestionAerolinea;

public class Pasajeros {
    private String nombre;
    private String documento;

    public Pasajeros(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    // metodos para modificar
    public void setNombre(String nombreNuevo) {
        this.nombre = nombreNuevo;
    }

    public void setDocumento(String docuemtoNuevo) {
        this.documento = docuemtoNuevo;
    }

    // metodos para obtener
    public String getNombre() {
        return nombre;
    }

    public String getDocuemto() {
        return documento;
    }

    // metodo para mostrar informacion
    public String mostrarInfo() {
        return "Nombre:" + nombre + " docuemento" + documento;
    }
}
