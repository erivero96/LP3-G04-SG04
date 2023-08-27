/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectomatias;

/**
 *
 * @author Alumno
 */
public class Perro {
    private String raza;
    private String color;
    private double temp;
    private int edad;
    public double peso;

    public Perro(String raza, String color) {
        this.raza = "raza";
        this.color = "color";
        this.temp = 37;
        this.edad = 1;
        this.peso = 0.5;
    }

    public Perro() {
        this.raza = "Chusco";
        this.color = "Gris";
        this.temp = 37;
        this.edad = 1;
        this.peso = 0.5;
    }

    public String getRaza() {
        return this.raza;
    }

    public String getColor() {
        return this.color;
    }

    public double getTemp() {
        return this.temp;
    }

    public int getEdad() {
        return this.edad;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", color=" + color + ", temp=" + temp + ", edad=" + edad + ", peso=" + peso + '}';
    }
    
    public void ladrar() {
        System.out.println("Guau Guau");
    }
    
    public void dormir() {
        System.out.println("zzz zzzz");
    }
    
    public void comer() {
        System.out.println("pka pka");
    }
    
    public void increEdad(int anios) {
        this.edad = this.edad + anios;
        cambiarPeso(anios);
    }
    
    public void cambiarPeso(int anios){
        this.peso = (anios * 1.5) + this.peso;
    }
}
