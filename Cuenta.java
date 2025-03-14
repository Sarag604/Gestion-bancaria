public class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private Cliente cliente;

    public Cuenta(String numeroCuenta, double saldo, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.cliente = cliente;
        if (saldo < 0) {
            System.out.println("Error.El saldo no puede ser negativo ");
        } else {
            this.saldo = saldo;
        }

    }

    // metodos para modificar
    public void setNumeroCuenta(String nuevoNumeroCuenta) {
        this.numeroCuenta = nuevoNumeroCuenta;
    }

    public void setNuevoSaldo(double nuevoSaldo) {
        if (nuevoSaldo <= 0) {
            System.out.println("Error.El saldo debe de ser mayor a 0 ");
        } else {
            System.out.println("Se ha guardado correctamente el nuevo saldo ");
            saldo = nuevoSaldo;
        }
    }

    public void setCliente(Cliente nuevoCliente) {
        this.cliente = nuevoCliente;
    }

    // metodos para obtener informacion
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    // metodos para depositar y retirar
    public void setDepositaDinero(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error.El saldo debe de ser mayor a 0 ");
        } else {
            System.out.println("Se ha guardado correctamente el deposito  ");
            saldo += cantidad;
        }
    }

    public void setRetirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error.El saldo debe de ser mayor a 0 ");
        } else if (cantidad > saldo) {
            System.out.println("Saldo insuficiente.Ingrese un nuevo valor  ");
        } else {
            saldo -= cantidad;
            System.out.println(" Su retiro fue exitoso ");
        }
    }

    // metodo para mostrar informacion del clinte y de la cuenta
    public String mostrarInfo() {
        String infoBase = cliente.mostrarInfo();
        return infoBase + " Su numero de cuenta es " + " y tiene un saldo de $" + saldo;
    }
}
