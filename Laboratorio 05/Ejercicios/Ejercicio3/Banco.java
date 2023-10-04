public class Banco {
    private String nombre;
    private Persona clientes[];
    private int numClientes;

    public Banco(String nombre) {
        this(nombre, 20);
    }

    public Banco(String nombre, int numCli) {
        this.nombre = nombre;
        this.clientes = new Persona[numCli];
        this.numClientes = 0;
    }

    // Getter y setter para el nombre del banco
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para el arreglo de clientes
    public Persona[] getClientes() {
        return clientes;
    }

    // Método para agregar un cliente al banco
    public void agregarCliente(Persona persona) {
        if (numClientes < clientes.length) {
            if (!buscarCliente(persona)) {
                clientes[numClientes] = persona;
                numClientes++;
            } else {
                System.out.println("El cliente ya existe en el banco.");
            }
        } else {
            System.out.println("El banco está lleno, no se puede agregar más clientes.");
        }
    }

    // Método para dar de baja a un cliente del banco
    public Persona darBajaCliente(Persona persona) {
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i].equals(persona)) {
                Persona clienteEliminado = clientes[i];
                // Mover los clientes restantes hacia adelante para llenar el espacio
                for (int j = i; j < numClientes - 1; j++) {
                    clientes[j] = clientes[j + 1];
                }
                clientes[numClientes - 1] = null; // Eliminar la referencia al último cliente
                numClientes--;
                return clienteEliminado;
            }
        }
        return null; // Si no se encontró el cliente
    }

    // Método para buscar un cliente en el banco
    public boolean buscarCliente(Persona persona) {
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i].equals(persona)) {
                return true;
            }
        }
        return false;
    }

    // Método para obtener los clientes de un tipo específico
    public void clientesTipo(char tipo) {
        System.out.println("Clientes de tipo '" + tipo + "':");
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i].getTipoCliente() == tipo) {
                System.out.println(clientes[i]);
            }
        }
    }

    // Método toString para mostrar la información de todos los clientes del banco
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Banco: ").append(nombre).append("\n");
        sb.append("Clientes:\n");
        for (int i = 0; i < numClientes; i++) {
            sb.append(clientes[i]).append("\n");
        }
        return sb.toString();
    }
}
