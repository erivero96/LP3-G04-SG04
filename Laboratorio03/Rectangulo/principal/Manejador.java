package principal;
public class Manejador{
    private Rectangulo r;
    public Manejador(Rectangulo r){
        this.r = r;
    }
    public int area(){
        int base = r.getEsquina2().getX() - r.getEsquina1().getX();
        int altura = r.getEsquina2().getY() - r.getEsquina1().getY();
        int area = base*altura;
        return area;
    }
    public int perimetro(){
        int base = r.getEsquina2().getX() - r.getEsquina1().getX();
        int altura = r.getEsquina2().getY() - r.getEsquina1().getY();
        int perimetro = (base+altura)*2;
        return perimetro;
    }
    public void moverX(int cant){
        int c1 = r.getEsquina1().getX() + cant;
        int c2 = r.getEsquina2().getX() + cant;
        r.getEsquina1().setX(c1);
        r.getEsquina2().setX(c2);
    }
    public void moverY(int cant){
        int c1 = r.getEsquina1().getY() + cant;
        int c2 = r.getEsquina2().getY() + cant;
        r.getEsquina1().setY(c1);
        r.getEsquina2().setY(c2);
    }
}