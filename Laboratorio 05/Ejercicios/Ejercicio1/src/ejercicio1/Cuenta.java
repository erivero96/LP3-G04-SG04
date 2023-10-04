package ejercicio1;
public class Cuenta {
    public static int numC = 1000;
    public static int numB = 5000;
    public static int numE = 8000;
    private char tipo;
    private String numero;
    private double saldo;
    
    public Cuenta (char tipo, double saldo){
        this.tipo = tipo;
        switch (this.tipo){
            case 'C':
                this.numero = tipo + Integer.toString(numC);
                numC++;
                break;
            case 'B':
                this.numero = tipo + Integer.toString(numB);
                numB++;
                break;
            case 'E':
                this.numero = tipo + Integer.toString(numE);
                numE++;
                break;
            default:
                System.out.println("Solo existen los tipos C, B y E");
                this.numero = 'C' + Integer.toString(numC);
                numC++;
                break;
        }
        if(saldo >= 50)
            this.saldo = saldo;
        else
            this.saldo = 50;
    }
    
    public Cuenta(char tipo){
        this(tipo, 50);
    }

    public char getTipo() {
        return tipo;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void retirar(double cantidad){
        if(cantidad >= 0){
            if(this.saldo-cantidad < 50){
                System.out.println("ERROR: Su saldo quedaria en menos de 50");
            }
            else
                this.saldo -= cantidad;
        }
            
    }
    public void depositar(double cantidad){
        if (cantidad >= 0){
            this.saldo += cantidad;
        }
    }

    @Override
    public String toString() {
        return "No.Cuenta: " + numero + "\t\tSaldo: " + saldo;
    }
    
}

