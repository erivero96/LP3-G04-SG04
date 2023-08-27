

public class PerfilMedico {
    private String nombre;
    private String apellido;
    private String sexo;
    private String año;
    private String mes;
    private String dia;
    private String fechaNacimiento;
    private double altura;
    private double peso;

    public PerfilMedico(String nombre,String apellido, String sexo, String año,String mes, String dia, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        this.altura = altura;
        this.peso = peso;
        this.fechaNacimiento = dia + "/" + mes + "/" + año;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setFechaNacimiento (String año, String mes, String dia ) {
        this.fechaNacimiento = dia + "/" + mes + "/" + año;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public int calcularEdad() {
        int diaA, mesA, añoA, edad; //Variables que almacenan la fecha actual
    
        diaA = 26;
        mesA = 8;
        añoA = 2023;
    
        edad = añoA - Integer.parseInt(año); // Usamos el método "parseInt" de la clase Integer para convertir el atributo años, que definimos como String, a int
    
        if (Integer.parseInt(mes) > mesA || (Integer.parseInt(mes) == mesA && Integer.parseInt(dia) > diaA)) {
            edad--; // Ajustar la edad si el cumpleaños aún no ha ocurrido este año
        }
    
        return edad;
    }
    

    public double calcularFCM() {
        int edad = calcularEdad();
        double FCM = 208 - (0.7 * edad);
        return FCM;
    }

    public double calcularIMC() {
        double IMC;
        IMC = this.peso/((this.altura/100)*(this.altura/100)); //Se modifico la formula de la practica, pues no era correcta para calcular el IMC
        return IMC;
    }

}
