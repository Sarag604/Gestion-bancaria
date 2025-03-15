package GestionAerolinea;

public class Vuelo {
    private String codigoVuelo;
    private String origen;
    private String destino;
    private Aeronave aeronave;
    private Pasajeros pasajeros;

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

}
