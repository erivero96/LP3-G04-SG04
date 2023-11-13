package Ejercicio1;
public class Empleado {
    private int numero;
    private String nombre;
    private double sueldo;

    public Empleado(int numero, String nombre, double sueldo){
        this.numero = numero;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getSueldo(){
        return this.sueldo;
    }
}
