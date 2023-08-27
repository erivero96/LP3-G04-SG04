package proyectomatias;

public class Diagnostico {
    public Diagnostico(){}  
    public void aptoVacunaA(Perro perro){
        if(perro.getTemp()>=37 && perro.getTemp()<=40 && perro.getPeso()>5 && perro.getEdad()>1){
            System.out.println("El perro esta SANO");
        }else{
            System.out.println("El perro esta ENFERMO");
        }
    }
    public void aptoVacunaB(double temp, double peso, int edad){
        if(temp>=37 && temp<=40 && peso>5 && edad>1){
            System.out.println("El perro esta SANO");
        }else{
            System.out.println("El perro esta ENFERMO");
        }
    }
}