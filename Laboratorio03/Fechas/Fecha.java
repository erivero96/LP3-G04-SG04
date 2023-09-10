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
        valida();
    }

    public void leer() {
        System.out.print("Ingrese el dia 1-31: ");
        this.dia = sc.nextInt();

        System.out.print("Ingrese el mes 1-12: ");
        this.mes = sc.nextInt();

        System.out.print("Ingrese el año 1900-2050: ");
        this.año = sc.nextInt();
        valida();
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

    public boolean bisiesto() {
        if ((this.año % 4 == 0 && this.año % 100 != 0) || (this.año % 400 == 0)) {
            System.out.println(this.año + " es año bisiesto");
            return true;
        }
        return false;
    }
    

    public int diaMes(int mes) {
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

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAño() {
        return this.año;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void corta() {
        String fecha = String.valueOf(this.dia) + "-" + String.valueOf(this.mes) + "-"+ String.valueOf(this.año);
        System.out.println(fecha);
    }

    public boolean esBisiesto(int año) { 
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0); 
    }

    public int diasTranscurridos() {
        int dias = this.dia - 1; 
        int meses = this.mes - 1; 
    
        for (int añoActual = 1900; añoActual < this.año; añoActual++) {
            if (esBisiesto(añoActual) == true) {
                dias += 366;
            } else {
                dias += 365;
            }
        }
        for (int mesActual = 1; mesActual <= meses; mesActual++) {
            dias += diaMes(mesActual);
        }
    
        return dias;
    }

    
    public int diaSemana() {
        int inicio = 0;
        int dias = diasTranscurridos();
        int diaActual = (inicio + dias) % 7;
        return diaActual; 
    }

    public void larga() {
        String nombreDia = " ";
        String nombreMes = " ";
        switch(diaSemana()) {
            case 0:
                nombreDia = "Domingo";
                break;
            
            case 1:
                nombreDia = "Lunes";
                break;
            
            case 2:
                nombreDia = "Martes";
                break;
            
            case 3:
                nombreDia = "Miercoles";
                break;
            
            case 4:
                nombreDia = "Jueves";
                break;
            
            case 5:
                nombreDia = "Viernes";
                break;
            
            case 6:
                nombreDia = "Sabado";
                break;

        }

        switch (this.mes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
        }

        String fechaLarga = nombreDia+" "+ this.dia + " de " + nombreMes + " de " + this.año;
        System.out.println(fechaLarga);
    }

    public void fechaTras(long diasTranscurridos) {
        int diaActual = 1;
        int mesActual = 1;
        int añoActual = 1900;
    
        while (diasTranscurridos > 0) {
            int diasEnMes = diaMes(mesActual);
    
            if (diaActual + diasTranscurridos > diasEnMes) {
                diasTranscurridos -= (diasEnMes - diaActual + 1);
                diaActual = 1;
                mesActual++;
    
                if (mesActual > 12) {
                    mesActual = 1;
                    añoActual++;
                }
            } else {
                diaActual += diasTranscurridos;
                diasTranscurridos = 0;
            }
        }

        this.dia = diaActual;
        this.mes = mesActual;
        this.año = añoActual;
    }

    public int diasEntre(Fecha otraFecha) {
        long diasFechaActual = this.diasTranscurridos();
        long diasOtraFecha = otraFecha.diasTranscurridos();
        long diferenciaDias = Math.abs(diasFechaActual - diasOtraFecha);

        return (int) diferenciaDias;
    }

    public void siguiente() {
        if (this.dia < diaMes(this.mes)) {
            this.dia ++;
        } else {
            this.dia = 1;
            if (this.mes < 12) {
                this.mes++;
            } else {
                this.mes = 1;
                this.año++;
            }
        }
    }

    public void anterior() {
        if (this.dia > 1) {
            this.dia--;
        } else {
            if (this.mes > 1) {
                this.mes--;
                this.dia = diaMes(this.mes); 
            } else {
                this.mes = 12; 
                this.año--;
                this.dia = 31;
            }
        }
    }

    public void fechaFutura(long diasTranscurridos) {
        int diaActual = this.dia;
        int mesActual = this.mes;
        int añoActual = this.año;

        while (diasTranscurridos > 0) {
            int diasEnMes = diaMes(mesActual);
    
            if (diaActual + diasTranscurridos > diasEnMes) {
                diasTranscurridos -= (diasEnMes - diaActual + 1);
                diaActual = 1;
                mesActual++;
    
                if (mesActual > 12) {
                    mesActual = 1;
                    añoActual++;
                }
            } else {
                diaActual += diasTranscurridos;
                diasTranscurridos = 0;
            }
        }

        this.dia = diaActual;
        this.mes = mesActual;
        this.año = añoActual;
    }

    public Fecha copia() {
        return new Fecha(this.dia, this.mes, this.año);
    }

    public static boolean igualQue(Fecha x, Fecha y) {
        return (x.getDia()==y.getDia() && x.getMes() == y.getMes() && x.getAño() == y.getAño());
    }

    public static boolean menorQue(Fecha x, Fecha y) {
        if (x.getAño() < y.getAño()) {
            return true;
        } else if (x.getAño() == y.getAño() && x.getMes() < y.getMes()) {
            return true;
        } else if (x.getAño() == y.getAño() && x.getMes() == y.getMes() && x.getDia() < y.getDia()) {
            return true;
        }
        return false;
    }

    public static boolean mayorQue(Fecha x, Fecha y) {
        if (x.getAño() > y.getAño()) {
            return true;
        } else if (x.getAño() == y.getAño() && x.getMes() > y.getMes()) {
            return true;
        } else if (x.getAño() == y.getAño() && x.getMes() == y.getMes() && x.getDia() > y.getDia()) {
            return true;
        }
        return false;
    }
}
