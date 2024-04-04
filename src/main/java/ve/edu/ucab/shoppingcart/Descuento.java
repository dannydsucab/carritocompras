package ve.edu.ucab.shoppingcart;

class Descuento {
    String nombreDelProducto;
    double porcentajeDeDescuento;

    public Descuento(String nombreDelProducto, double porcentajeDeDescuento) {
        this.nombreDelProducto = nombreDelProducto;
        this.porcentajeDeDescuento = porcentajeDeDescuento;
    }

    public String obtenerNombreDelProducto() {
        return nombreDelProducto;
    }

    public double obtenerPorcentajeDeDescuento() {
        return porcentajeDeDescuento;
    }
}
