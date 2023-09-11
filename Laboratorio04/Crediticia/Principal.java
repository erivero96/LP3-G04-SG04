import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<Persona>();

        // Generar 8 personas aleatoriamente
        for (int i = 0; i < 8; i++) {
            personas.add(new Persona());
            System.out.println(personas.get(i).getSueldo());
        }

        double promedioH = calcularPromedioSueldo(personas, 1, 1);
        double promedioM = calcularPromedioSueldo(personas, 2, 1);
        

        System.out.println("% de hombres: " + calcularPorcentaje(personas, 1));
        System.out.println("% de mujeres: " + calcularPorcentaje(personas, 2));
        System.out.println("% de hombres que trabajan: " + calcularPorcentaje(personas, 1, 1));
        System.out.println("% de mujeres que trabajan: " + calcularPorcentaje(personas, 2, 1));

        System.out.println("Promedio del sueldo hombres que trabajan: " + promedioH);
        System.out.println("Promedio del sueldo mujeres que trabajan: " + promedioM);
    }

    private static double calcularPorcentaje(ArrayList<Persona> personas, int sexo) {
        int count = 0;
        for (Persona persona : personas) {
            if (persona.getSexo() == sexo) {
                count++;
            }
        }
        return (count * 100.0) / personas.size();
    }
    private static double calcularPorcentaje(ArrayList<Persona> personas, int sexo, int trabaja) {
        int count = 0;
        for (Persona persona : personas) {
            if (persona.getSexo() == sexo && persona.getTrabajo() == trabaja) {
                count++;
            }
        }
        return (count * 100.0) / personas.size();
    }

    private static double calcularPromedioSueldo(ArrayList<Persona> personas, int sexo, int trabaja) {
        double totalSueldo = 0;
        int count = 0;
        for (Persona persona : personas) {
            if (persona.getSexo() == sexo && persona.getTrabajo() == trabaja) {
                totalSueldo += persona.getSueldo();
                count++;
            }
        }
        return count > 0 ? totalSueldo / count : 0; 
    }
}
