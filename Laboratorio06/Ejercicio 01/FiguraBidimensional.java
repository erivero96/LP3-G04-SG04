public abstract class FiguraBidimensional extends Figura {
    

    FiguraBidimensional() {
        this.area = 0.0;
    }

    public void figura(){
        super.figura();
        System.out.println("Soy una figura Bidimensional");
    }
}
