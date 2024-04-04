package ve.edu.ucab.shoppingcart;

public interface CarritoCompras {
    void agregarProducto(Producto producto);
    void eliminarProducto(Producto producto);
    void aplicarDescuento(Descuento descuento);
    void imprimirCarritoDeCompras();
}
