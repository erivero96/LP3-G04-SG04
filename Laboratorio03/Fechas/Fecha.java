import java.util.Scanner;

public class Fecha {
    private int dia, mes, año;
    Scanner sc = new Scanner(System.in);

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.año = 1900;
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public void leer() {
        System.out.print("Ingrese el dia 1-31: ");
        this.dia = sc.nextInt();

        System.out.print("Ingrese el mes 1-12: ");
        this.mes = sc.nextInt();

        System.out.print("Ingrese el año 1900-2050: ");
        this.año = sc.nextInt();
    }

    //Metodo leer con validacion de datos
    //     do {
    //         System.out.print("Ingrese el dia 1-31: ");
    //         this.dia = sc.nextInt();
    //     } while(this.dia < 1 || this.dia > 31 );


    //     do {
    //         System.out.print("Ingrese el mes 1-12: ");
    //         this.mes = sc.nextInt();
    //     } while(this.mes < 1 || this.mes > 12);

    //     do {
    //         System.out.print("Ingrese el año 1900-2050: ");
    //         this.año = sc.nextInt();
    //     } while(this.año < 1900 || this.año > 2050);
    // }

    public boolean bisiesto(){
        if(this.año % 4 == 0 )  {
            System.out.println(año+" es año bisiesto");
            return true;
        }
        return false;
    }

    public int diaMes() {
        switch (mes) {
            case 1,3,5,7,8,10,12: 
                return 31;

            case 2:{
                if (bisiesto() == true) 
                    return 29;
                return 28;
            }

            case 4,6,9,11:
                return 30;
        }
        System.out.println("Error: Mes inexistente");
        return 0;
    }

    public void valida() {
        if(this.dia < 1 || this.dia > 31) {
            this.dia = 1;
        }

        if(this.mes < 1 || this.mes > 12) {
            this.mes = 1;
        }

        if(this.año < 1900 || this.año > 2050) {
            this.año = 1900;
        }
    }
    
}
