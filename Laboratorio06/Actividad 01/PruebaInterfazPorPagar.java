public class PruebaInterfazPorPagar {
    public static void main(String[] args) {
        PorPagar[] objetPorPagars = new PorPagar[5];

        objetPorPagars[0] = new Factura("0001", "asiento", 2, 375.00);
        objetPorPagars[1] = new Factura("0002", "mesa", 3, 250.00);
        objetPorPagars[2] = new EmpleadoAsalariado("José", "Ramírez", "3232932", 2000.0);
        objetPorPagars[3] = new EmpleadoAsalariado("María", "García", "1234567", 1800.0);
        objetPorPagars[4] = new Prestamo(6, 1500.00);

        System.out.println("Facturas y Empleados procesados en forma polimórfica\n");

        for (PorPagar porPagarActual : objetPorPagars) {
            System.out.println(porPagarActual.toString());
            System.out.println("Pago vencido: $" + porPagarActual.obtenerMontoPago() + "\n");
        }
    }
}
