public class Principal {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(9, 1, 2023);

        System.out.println("Días transcurridos desde el 1 de enero de 1900: " + fecha.diasTranscurridos());


        System.out.println(fecha.diaSemana());

        System.out.print("Fecha en formato largo: ");
        fecha.larga();
        
        System.out.println("¿El año es bisiesto? " + fecha.bisiesto());

        fecha.siguiente();
        System.out.print("Fecha siguiente: ");
        fecha.larga();

        fecha.anterior();
        System.out.print("Fecha anterior: ");
        fecha.larga();

        fecha.fechaFutura(30);
        System.out.print("Fecha 30 días en el futuro: ");
        fecha.larga();


        Fecha copiaFecha = fecha.copia();
        System.out.print("Copia de la fecha original: ");
        copiaFecha.larga();

        Fecha otraFecha = new Fecha(15, 2, 2023);
        System.out.println("¿Las fechas son iguales? " + Fecha.igualQue(fecha, otraFecha));
        System.out.println("¿La primera fecha es menor que la segunda fecha? " + Fecha.menorQue(fecha, otraFecha));
        System.out.println("¿La primera fecha es mayor que la segunda fecha? " + Fecha.mayorQue(fecha, otraFecha));
    }
}
