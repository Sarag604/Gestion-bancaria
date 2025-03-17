package GestionAerolinea;

public class Vuelo {
    private String codigoVuelo;
    private String origen;
    private String destino;
    private Aeronave aeronave;
    private Pasajeros pasajeros;
    private int pasajerosActuales = 0;

    public Vuelo(String codigoVuelo, String origen, String destino, Aeronave aeronave, Pasajeros pasajeros) {
        this.codigoVuelo = codigoVuelo;
        this.origen = origen;
        this.destino = destino;
        this.aeronave = aeronave;
        this.pasajeros = pasajeros;
    }

    // metodos para modiicar info
    public void setCodigoVuelo(String nuevoCodigoVuelo) {
        this.codigoVuelo = nuevoCodigoVuelo;
    }

    public void setOrigen(String origenNuevo) {
        this.origen = origenNuevo;
    }

    public void setDestino(String destinoNuevo) {
        this.destino = destinoNuevo;
    }

    // metodos para obtener info
    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public int getPasajerosActuales() {
        return pasajerosActuales;
    }

    // metodo para agregar pasajeros
    public void setAgregaPasajeros(int agregaPasajeros) {
        int capacidadMaxima = aeronave.getCapacidad();
        if (agregaPasajeros + pasajerosActuales > capacidadMaxima) {
            System.out.println("La aeronave ya llego a su capacidad maxima de pasajeros ");
        } else {
            pasajerosActuales += agregaPasajeros;
            System.out.println("Bienvenido a la aeronave " + aeronave.getModelo() + ". Se han agregado "
                    + agregaPasajeros + " pasajeros.");
        }
    }

    // Método para asignar una aeronave
    public void asignarAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    // metodo para mostrar informacion
    public String mostrarInfo() {
        return pasajeros.mostrarInfo() + "Su codigo de vuelo es : " + codigoVuelo + ".Su origen de vuelo es " + origen
                + " y su destino de vuelo es " + destino +
                " La aeronave para su vuelo es " + aeronave.getModelo();
    }
}
