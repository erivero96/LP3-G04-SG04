class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            System.err.println("El saldo inicial debe ser no negativo.");
        }
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        } else {
            System.err.println("La cantidad a depositar debe ser positiva.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (cantidad <= saldo) {
                this.saldo -= cantidad;
            } else {
                System.err.println("Fondos insuficientes para la retirada.");
            }
        } else {
            System.err.println("La cantidad a retirar debe ser positiva.");
        }
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: S/ " + saldo);
    }
}

