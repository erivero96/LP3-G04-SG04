
package lp04.lab3;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class LP04Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Ingrese el nombre del titular: ");
        String nombre = s1.next();
        System.out.print("¿Desea ingresar una cantidad? (S/N): ");
        char opcion;
        opcion = s1.next().charAt(0);
        double cant = 0;
        if(opcion == 'S'){
            System.out.print("Ingrese cantidad: ");
            cant = s1.nextDouble();
        }else if(opcion == 'N'){
            CuentaBanco p1 = new CuentaBanco(nombre);
        }else {
            System.out.println("Error: Solo se acepta S y N como respuestas");
        }
        CuentaBanco p1 = new CuentaBanco(nombre, cant);
        System.out.println(p1);
        
        //MENU
        while(true){
            System.out.println("MENU...");
            System.out.println("1. Ingresar");
            System.out.println("2. Retirar");
            System.out.println("3. Mostrar Saldo");
            System.out.println("4. Salir");
            System.out.print("\nIngresar opcion: ");
            int op = s1.nextInt();
            
            switch(op){
                case 1:
                    System.out.print("Ingrese cantidad: ");
                    double cantidad = s1.nextInt();
                    p1.ingresar(cantidad);
                    break;
                case 2:
                    System.out.print("Ingrese cantidad: ");
                    cantidad = s1.nextInt();
                    p1.retirar(cantidad);
                    break;
                case 3:
                    System.out.println("Saldo actual: " + p1.getCantidad());
                    break;
                case 4:
                    return;
            }
        }
    }
}
