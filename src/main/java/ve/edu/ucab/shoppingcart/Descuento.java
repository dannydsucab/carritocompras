package ve.edu.ucab.shoppingcart;

class Descuento {
    private String nombrePromo;
    private double porcentajeDeDescuento;

    public Descuento(String nombrePromo, double porcentajeDeDescuento) {
        this.nombrePromo = nombrePromo;
        this.porcentajeDeDescuento = porcentajeDeDescuento;
    }

    public String obtenerNombreDelProducto() {
        return nombrePromo;
    }

    public double obtenerPorcentajeDeDescuento() {
        return porcentajeDeDescuento;
    }
}
