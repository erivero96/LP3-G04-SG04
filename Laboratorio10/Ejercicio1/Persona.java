package Ejercicio1;

public class Persona {
    private String nombre;
    private Integer dni;
    private String direccion;

    public Persona(String nombre, Integer dni, String direccion){
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
    }
    
    @Override
    public String toString(){
        return "[N:" + this.nombre + ", Dni: " + this.dni + ", D: " + this.direccion + "]";
    }
}
