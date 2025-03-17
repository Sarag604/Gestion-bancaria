package GestionAerolinea;

public class metodoMain {
    public static void main(String[] args) {
        // Crear una instancia de Aeronave
        Aeronave aeronave = new Aeronave("Boeing 737", 180);

        // Crear una instancia de Pasajeros
        Pasajeros pasajero1 = new Pasajeros("Juan Pérez", " 12345678");

        // Crear una instancia de Vuelo
        Vuelo vuelo = new Vuelo("AB123", "Madrid", " Barcelona", aeronave, pasajero1);

        // Mostrar información del vuelo
        System.out.println(vuelo.mostrarInfo());

        // Agregar más pasajeros
        vuelo.setAgregaPasajeros(2); // Intentar agregar 2 pasajeros

        // Mostrar información actualizada del vuelo
        System.out.println("Pasajeros actuales: " + vuelo.getPasajerosActuales());
    }
}
