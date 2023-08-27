package proyectomatias;
import java.util.Scanner;
public class ProyectoMatias {
    public static void main(String[] args) {
        
        //CREAR OBJETOS
        Diagnostico diag = new Diagnostico();
        Perro Fido = new Perro("Chihuahua", "Marron");
        Perro Pelusa = new Perro("Pequines", "Blanco");
        
        //INCREMENTAR EDAD De AMBOS
        Fido.increEdad(2);
        Pelusa.increEdad(5);
        
        //MODIFICAR ATRIBUTOS
        Scanner s1 = new Scanner(System.in);
        System.out.println("MODIFICANDO ATRIBUTOS DE FIDO");
        System.out.print("Ingrese peso nuevo: ");
        double peso1 = s1.nextDouble();
        Fido.setPeso(peso1);
        System.out.print("Ingrese edad nueva: ");
        int edad1 = s1.nextInt();
        Fido.setEdad(edad1);
        System.out.print("Ingrese temperatura nueva: ");
        double temp1 = s1.nextDouble();
        Fido.setTemp(temp1);
        
        System.out.print("DIAGNOSTICO A: ");
        diag.aptoVacunaA(Fido);
        System.out.print("DIAGNOSTICO B: ");
        diag.aptoVacunaB(Fido.getTemp(),Fido.getPeso(),Fido.getEdad());
        
        
        System.out.println("\n\nMODIFICANDO ATRIBUTOS DE PELUSA");
        System.out.print("Ingrese peso nuevo: ");
        double peso2 = s1.nextDouble();
        Pelusa.setPeso(peso2);
        System.out.print("Ingrese edad nueva: ");
        int edad2 = s1.nextInt();
        Pelusa.setEdad(edad2);
        System.out.print("Ingrese temperatura nueva: ");
        double temp2 = s1.nextDouble();
        Pelusa.setTemp(temp2);
        System.out.print("DIAGNOSTICO A: ");
        diag.aptoVacunaA(Pelusa);
        System.out.print("DIAGNOSTICO B: ");
        diag.aptoVacunaB(Pelusa.getTemp(),Pelusa.getPeso(),Pelusa.getEdad());
    }
    
}
