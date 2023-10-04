package testcomposicion;
public class Cuenta {
    private int numero;
    private double saldo;
    
    public Cuenta (int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    public Cuenta(int numero){
        this(numero,0);
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "{" + "numero=" + numero + ", saldo=" + saldo + '}';
    }
    
}
