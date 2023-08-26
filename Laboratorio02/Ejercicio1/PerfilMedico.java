public class PerfilMedico {
    private String nombre;
    private String apellido;
    private String sexo;
    private String año;
    private String mes;
    private String dia;
    private String fechaNacimiento;
    private int altura;
    private int peso;

    public PerfilMedico(String nombre,String apellido, String sexo, String año,String mes, String dia, int altura, int peso) {
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

    public int getAltura() {
        return altura;
    }

    public int getPeso() {
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
    
    public void calcularEdad() {
        
    }

}
