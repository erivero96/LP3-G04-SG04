package ejercicio1;
import java.util.Scanner;
import java.util.ArrayList;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salida = false;
        boolean llenado = false;
        int opcion;
        String numID;
        ArrayList<Persona> lista = new ArrayList<Persona>();
        do{
            System.out.println("MENU");
            System.out.println("1. Crear cliente");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Mostrar clientes");
            System.out.println("5. Salir");
            System.out.print("Ingrese opcion: ");opcion = sn.nextInt();
            switch(opcion){
                case 1:
                    Persona c = crearCliente(sn);
                    lista.add(c);
                    llenado = true;
                    break;
                case 2:
                    if(llenado){
                        System.out.print("Ingrese el id del cliente: ");numID = sn.next();
                        for(Persona i:lista){
                            if (i.getId().equals(numID)){
                                System.out.print("Ingrese dinero a depositar: ");double cant = sn.nextDouble();
                                i.depositar(cant);
                            }
                        }
                    }
                    else{
                        System.out.println("No se ha llenado la lista");
                    }
                    break;
                case 3:
                    if(llenado){
                        System.out.print("Ingrese el id del cliente: ");numID = sn.next();
                        for(Persona i:lista){
                            if (i.getId().equals(numID)){
                                System.out.print("Ingrese dinero a retirar: ");double cant = sn.nextDouble();
                                i.retirar(cant);
                            }
                        }
                    }
                    else{
                        System.out.println("No se ha llenado la lista");
                    }
                    break;
                case 4:
                    if(llenado){
                        for(Persona i:lista){
                            System.out.println(i);
                        }
                    }
                    else{
                        System.out.println("No se ha llenado la lista");
                    }
                    break;
                case 5:
                    salida = true;
                default:
                    break;
            }
            
        }while(!salida);
        
    }
    //Crear cliente
    public static Persona crearCliente(Scanner sn){
        String id;
        String nombre;
        String apellido;
        char tipo;
        System.out.print("Ingrese id: ");id = sn.next();
        System.out.print("Ingrese Nombre: ");nombre = sn.next();
        System.out.print("Ingrese Apellido: ");apellido = sn.next();
        System.out.print("Ingrese Tipo de cliente: ");tipo = sn.next(). charAt(0);
        return new Persona(id, nombre, apellido, tipo);
    }
}
