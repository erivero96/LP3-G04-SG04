import java.util.Scanner;

public class PrincipalPerfilMedico {
    public static void main(String[] args) throws Exception {
        String nombre, apellido, sexo, año, mes, dia;
        int altura, peso, edad;
        double FCM, IMC;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        nombre = sc.next();

        System.out.print("Ingrese su apellido: ");
        apellido = sc.next();

        System.out.print("Ingrese su sexo: ");
        sexo = sc.next();

        System.out.print("Ingrese su año de nacimiento: ");
        año = sc.next();

        System.out.print("Ingrese su mes de nacimiento: ");
        mes = sc.next();

        System.out.print("Ingrese su dia de nacimiento: ");
        dia = sc.next();

        System.out.print("Ingrese su altura en CM: ");
        altura = sc.nextInt();

        System.out.print("Ingrese su peso en KG: ");
        peso = sc.nextInt();

        PerfilMedico persona = new PerfilMedico(nombre, apellido, sexo, año, mes, dia, altura, peso);

        System.out.println("----------DATOS----------");
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Apellido: "+persona.getApellido());
        System.out.println("Sexo: "+persona.getSexo());
        System.out.println("Fecha de nacimiento: "+persona.getFechaNacimiento());
        System.out.println("Altura: "+persona.getAltura());
        System.out.println("Peso: "+persona.getPeso());
        sc.close();

        edad = persona.calcularEdad();
        FCM = persona.calcularFCM();
        IMC = persona.calcularIMC();

        System.out.println("Edad: "+ edad);
        System.out.println("IMC: "+ IMC);
        System.out.println("FCM: "+ FCM);
    }
}
