package actividadlab4;
import java.util.Scanner;
public class ActividadLab4 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        //Matriz cuadrada de 4x4
        int matriz[][] = new int[4][4];
        
        //Variables utilizadas 
        boolean salir = false;
        int opcion, fila, columna;
        
        //utilizado para indicar si hemos entrado en la 1era opcion
        boolean rellenado = false;
        
        //Menu
        do{
            //mensajes del menu
            System.out.println("Menu");
            System.out.println("1. Rellenar Matriz");
            System.out.println("2. Sumar fila");
            System.out.println("3. Sumar columna");
            System.out.println("4. Sumar diagonal principal");
            System.out.println("5. Sumar diagonal inversa");
            System.out.println("6. Calcular media");
            System.out.println("7. Salir");
            System.out.println("Elije una opcion");
            opcion = sn.nextInt();
            
            switch (opcion){
                case 1:
                    rellenarMatriz(sn, matriz);
                    //Ahora si podemos acceder al resto de opciones
                    rellenado = true;
                    break;
                
                case 2:
                    if(rellenado){
                        //validamos la fila
                        do{
                            System.out.println("Elije un fila");
                            fila = sn.nextInt();                      
                        }while(!(fila >= 0 && fila < matriz.length));
                        System.out.println("La suma de los valores de la fila " + fila + " es: " + sumaFila(matriz,fila));
                    } else{
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 3:
                    if(rellenado){
                        do{ //Validacion de columna
                            System.out.println("Elije una columna");
                            columna = sn.nextInt();
                        }while(!(columna >= 0 && columna < matriz[0].length));
                        System.out.println("La suma de los valores de la columna "+ columna + " es: "+ sumaColumna(matriz,columna));
                    }else{
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 4:
                    if(rellenado){
                        System.out.println("La suma total de la diagonal principal es: " + sumaDiagonal(matriz));
                    }else{
                        System.out.println("Debes rellenar la matriz primero");
                    }
                case 5:
                    if(rellenado){
                        System.out.println("La suma total de la diagonal inversa es: "+ sumaDiagInversa(matriz));
                    }else{
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 6:
                    if(rellenado){
                        System.out.println("La media de todos los elementos de la matriz es: " + mediaMatriz(matriz));
                    }else{
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Tienes que meter un valor entre 1 y 7");
            }
        }while(!salir);
        System.out.println("FIN");
    }
    
    public static void rellenarMatriz(Scanner sn, int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j<matriz[0].length; j++){
                System.out.println("Escribe un numero en la posicion " + i + " " + j);
                matriz[i][j] = sn.nextInt();
            }
        }
    }
    
    public static int sumaFila(int[][] matriz, int fila){
        int suma = 0;
        for(int j = 0; j<matriz.length; j++){
            suma += matriz[fila][j];
        }
        return suma;
    }
    //Parte a
    public static int sumaColumna(int[][] matriz, int columna){
        int suma = 0;
        for(int j = 0; j<matriz[0].length; j++){
            suma += matriz[j][columna];
        }
        return suma;
    }
    //Parte b
    public static int sumaDiagonal(int[][] matriz){
        int suma = 0;
        for(int i = 0; i < matriz.length; i++){
            //Diagonal principal es [1][1], [2][2], [3][3] ...
            suma += matriz[i][i];
        }
        return suma;
    }
    //Parte c
    public static int sumaDiagInversa(int[][] matriz){
        int suma = 0;
        for(int i = 0; i < matriz.length; i++){
            //Diagonal inversa: Sus indices suman la cantidad total de filas o columnas
            suma += matriz[i][(matriz.length-1)-i];
        }
        return suma;
    }
    //Parte d
    public static double mediaMatriz(int[][] matriz){
        int suma = 0;
        int cant = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length;j++){
                suma += matriz[i][j]; //Recorre todos los valores de la matriz
                cant++; //Cantidad de valores de la matriz
            }
        }
        return suma/cant; //retorna media
    }
}