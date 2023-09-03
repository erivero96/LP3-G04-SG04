package principal;
public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;
    private String color;
    public static String ultimoColor = "verde";

    public Rectangulo(Coordenada c1, Coordenada c2){
        this.esquina1 = c1;
        this.esquina2 = c2;
        this.color = ultimoColor;
        switch(ultimoColor){
            case "verde":
                ultimoColor = "rojo";
                break;
            case "rojo":
                ultimoColor = "amarillo";
                break;
            case "amarillo":
                ultimoColor = "verde";
                break;
        }
    }
    public Rectangulo(int base, int altura){
        Coordenada c1 = new Coordenada();
        Coordenada c2 = new Coordenada(base, altura);
        this.esquina1 = c1;
        this.esquina2 = c2;
        this.color = ultimoColor;
        switch(ultimoColor){
            case "verde":
                ultimoColor = "rojo";
                break;
            case "rojo":
                ultimoColor = "amarillo";
                break;
            case "amarillo":
                ultimoColor = "verde";
                break;
        }
    }
    public Coordenada getEsquina1(){
        return esquina1;
    }
    public void setEsquina1(Coordenada esquina1){
        this.esquina1 = esquina1;
    }
    public Coordenada getEsquina2(){
        return esquina2;
    }
    public void setEsquina2(Coordenada esquina2){
        this.esquina2 = esquina2;
    }
    @Override
    public String toString() {
        return "Esquina 1: " + esquina1 + ", Esquina 2: " + esquina2 + ", Color: " + color;
    }
}
