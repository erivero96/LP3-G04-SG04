package ejercicio2;
public class Automovil{
    private String placa;
    private int numPuertas;
    private String marca;
    private String modelo;
    private Motor motor;

    public Automovil(String placa, int n, String marca, String modelo){
        this.placa = placa;
        this.numPuertas = n;
        this.marca = marca;
        this.modelo = modelo;
    }
    public void asignarMotor(Motor motor){
        this.motor = motor;
    }

    public String getPlaca() {
        return placa;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    @Override
    public String toString(){
        if(this.motor == null){
        return "Automovil sin motor\nPlaca: " + this.placa + "\nNo. Puertas: " + this.numPuertas + "\nMarca: " + this.marca + "\nModelo: " + this.modelo;
        }else{
        return "Automovil con motor\nPlaca: " + this.placa + "\nNo. Motor: " + this.motor.getNumMotor() + "\nNo. Puertas: " + this.numPuertas + "\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\nRPM: " + this.motor.getRevPorMin();
        }
    }
}