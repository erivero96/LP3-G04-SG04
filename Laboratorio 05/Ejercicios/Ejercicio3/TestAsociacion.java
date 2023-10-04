public class TestAsociacion {
    public static void main(String[] args) throws Exception {
        Banco bcp = new Banco("BCP");
        Banco bbva = new Banco("BBVA", 30);

        // Agregar clientes
        Persona cliente1 = new Persona(1, "Juan", "Díaz", 'A');
        Persona cliente2 = new Persona(2, "María", "Gómez", 'B');
        Persona cliente3 = new Persona(3, "Carlos", "Pérez", 'A');

        bcp.agregarCliente(cliente1);
        bcp.agregarCliente(cliente2);
        bbva.agregarCliente(cliente3);

        // Listar los clientes por tipo
        bcp.clientesTipo('A');
        bbva.clientesTipo('B');

        // Buscar a un cliente
        Persona clienteBuscado = new Persona(1, "Juan", "Díaz", 'A');
        if (bcp.buscarCliente(clienteBuscado)) {
            System.out.println("Cliente encontrado en BCP.");
        } else {
            System.out.println("Cliente no encontrado en BCP.");
        }

        // Eliminar un cliente
        Persona clienteEliminado = bcp.darBajaCliente(cliente1);
        if (clienteEliminado != null) {
            System.out.println("Cliente eliminado de BCP: " + clienteEliminado.getNombre());
        } else {
            System.out.println("Cliente no encontrado en BCP.");
        }

        // Mostrar información del banco
        System.out.println(bcp);
        System.out.println(bbva);
    }
}
