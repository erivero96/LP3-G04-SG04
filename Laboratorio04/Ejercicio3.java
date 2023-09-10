package ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        //Scanner
        Scanner sn = new Scanner(System.in);
        //conteo de dias
        int diaMes = 1;
        //terminar el programa
        boolean salir = false;
        //verificar rellenado
        boolean rellenado = false;
        //Arreglo
        int[][] ventas = new int[5][4];
        //opcion del menu
        int opcion;
        //Menu
        do{ //Repite mientras salir sea false
            System.out.println("----------------------------------");
            System.out.println("SISTEMA DE VENTAS");
            System.out.println("\t1. Iniciar mes");
            System.out.println("\t2. Registrar dia " + (diaMes + 1));
            System.out.println("\t3. Mostrar Tabla");
            System.out.println("\t4. Ventas totales por producto");
            System.out.println("\t5. Ventas totales por vendedor");
            System.out.println("\t6. Finalizar programa");
            System.out.println("----------------------------------");
            System.out.print("Ingrese opcion: ");opcion = sn.nextInt();
            
            switch(opcion){
                case 1:
                    iniciarMes(sn, ventas);
                    rellenado = true; //Se puede acceder a las demas opciones
                    diaMes = 1; //Reinicia el mes
                    //Pause
                    System.out.println("Oprima ENTER para continuar...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                    
                case 2:
                    if(rellenado){ //Verifica si la matriz contiene datos
                        if(diaMes < 30){ //Si diaMes llega a 30 termina el mes
                            diaMes++; //Incremento de dia
                            registrarDia(sn, ventas, diaMes);
                        }else{
                            System.out.println("Mes culminado, no se puede registrar.");
                        }
                    }else{
                        System.out.println("Mes no iniciado");
                    }
                    //Pause
                    System.out.println("Oprima ENTER para continuar...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                    
                case 3:
                    if(rellenado){ //Verifica si la matriz contiene datos
                        mostrarTabla(sn, ventas, diaMes);
                    }else{
                        System.out.println("Mes no iniciado.");
                    }
                    //Pause
                    System.out.println("Oprima ENTER para continuar...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                    
                case 4:
                    if(rellenado){ //Verifica si la matriz contiene datos
                        int numProducto;
                        do{ //Validacion de entrada (1 al 5)
                            System.out.println("Ingrese numero de producto para consultar (1-5)");
                            numProducto = sn.nextInt();
                        }while(numProducto < 1 || numProducto > 5);
                        System.out.println("---------DIA " + diaMes + "---------");
                        System.out.println("El total de ventas del producto " + numProducto + " es: " + totalProducto(sn, ventas, (numProducto-1)));
                    }else{
                        System.out.println("Mes no iniciado.");
                    }
                    //Pause
                    System.out.println("Oprima ENTER para continuar...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                    
                case 5:
                    if(rellenado){ //Verifica si la matriz contiene datos
                        int numVendedor;
                        do{ //Validacion de entrada (1 al 4)
                            System.out.println("Ingrese numero de vendedor para consultar (1-4)");
                            numVendedor = sn.nextInt();
                        }while(numVendedor < 1 || numVendedor > 4);
                        System.out.println("---------DIA " + diaMes + "---------");
                        System.out.println("El total de ventas hechas por el vendedor " + numVendedor + " es: " + totalVendedor(sn, ventas, (numVendedor-1)));
                    }else{
                        System.out.println("Mes no iniciado.");
                    }
                    //Pause
                    System.out.println("Oprima ENTER para continuar...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                    
                case 6:
                    salir = true; //Culmina el do-while
                    break;
                    
                default:
                    System.out.println("Solo se admiten numeros del 1 al 6");
                    break;
            }
        }while(!salir);
        System.out.println("Programa finalizado...");
    }
    
    public static void iniciarMes(Scanner sn, int[][] matriz){
        System.out.println("Ingrese cantidad de ventas de cada vendedor");
        System.out.println("---------DIA 1---------");
        for (int i = 0; i<matriz.length; i++){ //filas
            System.out.println("\n\tPRODUCTO "+ (i+1));
            for(int j = 0; j<matriz[i].length; j++){ //columnas
                System.out.print("Vendedor " + (j+1) + ": ");
                matriz[i][j] = sn.nextInt();
            }
        }
    }
    
    public static void registrarDia(Scanner sn, int[][] matriz, int dia){
        System.out.println("Ingrese cantidad de ventas de cada vendedor");
        System.out.println("---------DIA " + dia + "---------");
        for (int i = 0; i<matriz.length; i++){
            System.out.println("\n\tPRODUCTO "+ (i+1));
            for(int j = 0; j<matriz[i].length; j++){
                System.out.print("Vendedor " + (j+1) + ": ");
                matriz[i][j] += sn.nextInt();
            }
        }
    }
    
    public static void mostrarTabla(Scanner sn, int[][] matriz, int dia){
        System.out.println("---------DIA " + dia + "---------\n");
        System.out.printf("|%6s|%6s|%6s|%6s|%6s|%6s|%n", "*", "V1", "V2", "V3", "V4", "TOTAL");
        System.out.printf("|%6s|%6s|%6s|%6s|%6s|%6s|%n", "Prod1", matriz[0][0], matriz[0][1], matriz[0][2], matriz[0][3], totalProducto(sn, matriz, 0));
        System.out.printf("|%6s|%6s|%6s|%6s|%6s|%6s|%n", "Prod2", matriz[1][0], matriz[1][1], matriz[1][2], matriz[1][3], totalProducto(sn, matriz, 1));
        System.out.printf("|%6s|%6s|%6s|%6s|%6s|%6s|%n", "Prod3", matriz[2][0], matriz[2][1], matriz[2][2], matriz[2][3], totalProducto(sn, matriz, 2));
        System.out.printf("|%6s|%6s|%6s|%6s|%6s|%6s|%n", "Prod4", matriz[3][0], matriz[3][1], matriz[3][2], matriz[3][3], totalProducto(sn, matriz, 3));
        System.out.printf("|%6s|%6s|%6s|%6s|%6s|%6s|%n", "Prod5", matriz[4][0], matriz[4][1], matriz[4][2], matriz[4][3], totalProducto(sn, matriz, 4));
        System.out.printf("|%6s|%6s|%6s|%6s|%6s|%6s|%n", "TOTAL", totalVendedor(sn, matriz, 0), totalVendedor(sn, matriz, 1), totalVendedor(sn, matriz, 2), totalVendedor(sn, matriz, 3), "*");
    }
    
    public static int totalProducto(Scanner sn, int[][] matriz, int fila){
        int suma = 0;
        for(int i = 0; i<matriz[(fila)].length; i++){ //Recorre fila indicada
            suma += matriz[fila][i];
        }
        return suma;
    }
    public static int totalVendedor(Scanner sn, int[][] matriz, int columna){
        int suma = 0;
        for(int i = 0; i<matriz.length; i++){ //Recorre columna indicada
            suma += matriz[i][columna];
        }
        return suma;
    }
}
