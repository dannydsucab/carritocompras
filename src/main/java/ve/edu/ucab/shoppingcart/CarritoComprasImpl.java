package ve.edu.ucab.shoppingcart;

import java.util.ArrayList;
import java.util.List;

class CarritoComprasImpl implements CarritoCompras {
    List<Producto> productos = new ArrayList<>();

    @Override
    public void agregarProducto(Producto producto) {
        for (Producto p : productos) {
            if (p.obtenerNombre().equals(producto.obtenerNombre())) {
                System.out.println("El producto ya existe en el carrito.");
                return;
            }
        }
        productos.add(producto);
    }

    @Override
    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    @Override
    public void aplicarDescuento(Descuento descuento) {
        for (Producto p : productos) {
            if (p.obtenerNombre().equals(descuento.obtenerNombreDelProducto())) {
                double cantidadDescuento = p.obtenerPrecioPorUnidad() * descuento.obtenerPorcentajeDeDescuento() / 100;
                p.costo -= cantidadDescuento;
                break;
            }
        }
    }

    @Override
    public void imprimirCarritoDeCompras() {
        for (Producto p : productos) {
            System.out.println("Producto: " + p.obtenerNombre() + ", Precio por unidad: " + p.obtenerPrecioPorUnidad() + ", Precio final: " + p.obtenerPrecioFinal());
        }
    }
}
