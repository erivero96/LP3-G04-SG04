public class GestionCuentasBancarias {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Pérez", 1000);
        CuentaBancaria cuenta2 = new CuentaBancaria("María López", 500);

        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();

        cuenta1.depositar(500);
        cuenta2.depositar(300);

        cuenta1.retirar(200);
        cuenta2.retirar(700); 

        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();
    }
}