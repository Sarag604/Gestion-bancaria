import java.util.Date;

public class Transaccion {
    private String tipo;
    private double monto;
    private Date fecha;

    public Transaccion(String tipo, double monto, Date fecha) {
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
    }

    // metodos para modificar
    public void setTipo(String nuevoTipo) {
        tipo = nuevoTipo;
    }

    public void setMonto(double nuevoMonto) {
        monto = nuevoMonto;
    }

    public void setFecha(Date nuevaFecha) {
        fecha = nuevaFecha;
    }

    // metodos para obtener
    public String getTipo() {
        return tipo;
    }

    public double getMonto() {
        return monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public String mostrarInfo() {
        return "El tipo de transaccion realizada fue " + tipo + " y se hizo el dia " + fecha + "monto$" + monto;
    }

}
