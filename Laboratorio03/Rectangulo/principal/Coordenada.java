package principal;
public class Coordenada {
    private int x;
    private int y;
    public Coordenada(){
        this.x = 0;
        this.y = 0;
    }
    public Coordenada(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Coordenada(Coordenada c){
        this.x = c.getX();
        this.y = c.getY();
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    //Distancia entre punto X y punto Y del objeto
    public double distancia(Coordenada c){
        double d = Math.sqrt((Math.pow(c.getX(),2))+Math.pow(c.getY(), 2));
        return d;
    }
    //Distancia entre dos puntos introducidos por parametro
    public static double distancia(Coordenada c1, Coordenada c2){
        double d,a,b;
        a = Math.pow((c1.getX()-c2.getX()), 2);
        b = Math.pow((c1.getY()-c2.getY()), 2);
        d = Math.sqrt(a+b);
        return d;
    }
    @Override
    public String toString() {
        return "{" + "x=" + x + ", y=" + y + '}';
    }
}
