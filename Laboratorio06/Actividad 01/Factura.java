public class Factura implements PorPagar{
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public String getNumeroPieza() {
        return this.numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getDescripcionPieza() {
        return this.descripcionPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioPorArticulo() {
        return this.precioPorArticulo;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        this.precioPorArticulo = precioPorArticulo;
    }

    public Factura(String pieza, String descripcion, int cuenta, double precio) {
        numeroPieza = pieza;
        descripcionPieza = descripcion;
        setCantidad(cuenta);
        setPrecioPorArticulo(precio);
    }

    @Override
    public double obtenerMontoPago(){
        return getCantidad() * getPrecioPorArticulo();
    }

    @Override
    public String toString() {
    return "Número de Pieza: " + getNumeroPieza() + "\nDescripción de Pieza: " + getDescripcionPieza() +
           "\nCantidad: " + getCantidad() + "\nPrecio por Artículo: " + getPrecioPorArticulo();
    }

}


