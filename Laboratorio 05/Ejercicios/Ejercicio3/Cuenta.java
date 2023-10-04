public class Cuenta {
    private String numero;
    private double saldo;

    public Cuenta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Cuenta(String numero) {
        this(numero, 50);
    }

    // Getter para el campo 'numero'
    public String getNumero() {
        return numero;
    }

    // Setter para el campo 'numero'
    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Getter para el campo 'saldo'
    public double getSaldo() {
        return saldo;
    }

    // Setter para el campo 'saldo'
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void retirar(double Cantidad) {
        if((this.saldo - Cantidad < 50 || this.saldo == 50)) {
            System.out.println("No tiene suficientes fondos");
        }
        else {
            this.saldo -= Cantidad;
        }
    }

    public void depositar(double Cantidad) {
        this.saldo += Cantidad;
    }

    @Override
    public String toString() {
        return "Número de Cuenta: " + numero + "\nSaldo: " + saldo;
    }
}