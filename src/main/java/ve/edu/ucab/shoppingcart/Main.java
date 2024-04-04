package ve.edu.ucab.shoppingcart;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // Crear instancia del carrito de compras
        CarritoCompras carrito = new CarritoComprasImpl();

        // Crear productos
        Producto pan = new Producto("Pan", 1.00, 10, 21); // costo, porcentaje de beneficio, porcentaje de IVA
        Producto leche = new Producto("Leche", 0.80, 15, 21);

        // Agregar productos al carrito
        carrito.agregarProducto(pan);
        carrito.agregarProducto(leche);

        // Imprimir el carrito antes del descuento
        System.out.println("Carrito antes del descuento:");
        carrito.imprimirCarritoDeCompras();

        // Aplicar descuento al pan
        Descuento descuentoPan = new Descuento("PROMO_5", 5); // 5% de descuento al pan
        carrito.aplicarDescuento(descuentoPan);

        // Imprimir el carrito después del descuento
        System.out.println("\nCarrito después del descuento:");
        carrito.imprimirCarritoDeCompras();
    }
}