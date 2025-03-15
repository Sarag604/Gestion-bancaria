package GestionAerolinea;

public class Aeronave {
    private String modelo;
    private int capacidad;

    public Aeronave(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    // metodos para modificar
    public void setModelo(String modeloNuevo) {
        this.modelo = modeloNuevo;
    }

    public void setCapacidad(int nuevaCapacidad) {
        this.capacidad = nuevaCapacidad;
    }

    // metodos para obetener
    public String getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    // metodo para nmostrar informacion de la aeronave
    public String mostrarInfo() {
        return "La aeronave para su vuelo es " + modelo + " esta tiene una capacidad de " + capacidad;
    }
}
