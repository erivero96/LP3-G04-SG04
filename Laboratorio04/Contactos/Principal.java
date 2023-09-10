import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        char opc;
        String nombreBuscar, nombre, telefono, direccion;;
        Scanner sc = new Scanner(System.in);
        Contacto contacto = new Contacto("Juan", "938483009", "Avenida 123");
        Contacto contacto1;
        boolean rellenado = false;
        do {
            System.out.println("1. Añadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Modificar contacto");
            System.out.println("4. Borrar contactos");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Mostrar Contactos");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opcion 1-7: ");
            opc = sc.next().charAt(0);

            switch(opc) {
                case '1':
                    System.out.print("Ingrese el nombre: ");
                    nombre = sc.next();
                    System.out.print("Ingrese el telefono: ");
                    telefono = sc.next();
                    System.out.print("Ingrese la direccion: ");
                    direccion = sc.next();

                    contacto1 = new Contacto(nombre, telefono, direccion);
                    contacto.contactos.add(contacto1);

                    System.out.println("Se añadio a "+nombre+ " a tu lista de contactos");
                    rellenado = true;
                break;

                case '2':
                    if(rellenado == true) {
                        System.out.print("Ingrese el nombre a buscar: ");
                        nombreBuscar = sc.next();
                        
                        for(Contacto pivote : contacto.contactos) {
                            if (pivote.getNombre().equals(nombreBuscar)) {      //Para comparar strings usamos .equals()
                                System.out.println("Se encontro el contacto");
                                break;
                            }
                        }
                        System.out.println("No se encontro el contacto"); 
                    } else {
                        System.out.println("Añade un contacto antes");
                    }
                break;

                case '3': 
                    if(rellenado == true) {
                        char opc1;
                        System.out.print("Ingrese el nombre a buscar: ");
                        nombreBuscar = sc.next();
                        for(int i = 0; i < contacto.contactos.size(); i++) {
                            if(contacto.contactos.get(i).getNombre().equals(nombreBuscar)) {
                                do {
                                    System.out.println("Modificar datos de "+contacto.contactos.get(i).getNombre());
                                    System.out.println("1. Nombre");
                                    System.out.println("2. Telefono");
                                    System.out.println("3. Direccion");
                                    System.out.println("4. Salir");
                                    System.out.print("Elija el dato a modificar: ");
                                    opc1 = sc.next().charAt(0);

                                    switch (opc1) {
                                            case '1':
                                                System.out.print("Ingrese el nuevo nombre: ");
                                                nombre = sc.next();
                                                contacto.contactos.get(i).setNombre(nombre);
                                            break;

                                            case '2':
                                                System.out.print("Ingrese el nuevo telefono: ");
                                                telefono = sc.next();
                                                contacto.contactos.get(i).setTelefono(telefono);
                                            break;

                                            case '3':
                                                System.out.print("Ingrese la nueva direccion: ");
                                                direccion = sc.next();
                                                contacto.contactos.get(i).setDireccion(direccion);
                                            break;

                                            case '4' :
                                                System.out.println("Saliendo del menu...");

                                            default:
                                                System.out.println("Ingrese una opcion del 1 al 4");
                                            break;
                                        }
                                    } while (opc1 != '4');
                            }     
                        }
                    } else {
                        System.out.println("Añade un contacto antes");
                    }
                break;

                case '4':
                    if(rellenado == true) {
                        contacto.contactos.clear();
                        System.out.println("Se eliminaron todos los contactos");
                        // Sin utilizar metodo clear()
                        // for(Contacto pivote : contacto.contactos) { 
                        //     contacto.contactos.remove(pivote);
                        // }
                        // System.out.println("Se eliminaron todos los contactos");
                    } else {
                        System.out.println("Añade un contacto antes");
                    }
                break;

                case '5':
                    if(rellenado == true) {
                        String borrar;
                        System.out.println("Ingresa el nombre del contacto");
                        borrar = sc.next();
                        for(Contacto pivote : contacto.contactos) {
                            if (pivote.getNombre() == borrar) {
                            contacto.contactos.remove(pivote);
                                break;
                            }
                        }
                    } else {
                        System.out.println("Añade un contacto antes");
                    }
                break;

                case '6':
                    if(rellenado == true) {
                        System.out.println("Contactos");
                        for(Contacto pivote: contacto.contactos) {
                            System.out.println("--------------------------------");
                            System.out.println("Nombre: " + pivote.getNombre());
                            System.out.println("Numero: "+ pivote.getTelefono());
                            System.out.println("Direccion: " + pivote.getDireccion());
                            System.out.println("--------------------------------");
                        }
                    } else {
                        System.out.println("Añade un contacto antes");
                    }
                    
                break;

                case '7':
                    System.out.println("Saliendo del programa...");
                break;
            }
            
        } while (opc != '7');
        sc.close();
    }
}
