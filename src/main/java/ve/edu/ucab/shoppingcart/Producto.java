package ve.edu.ucab.shoppingcart;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Producto {
    String nombre;
    double costo;
    double porcentajeDeBeneficio;
    double porcentajeDeIVA;

    public Producto(String nombre, double costo, double porcentajeDeBeneficio, double porcentajeDeIVA) {
        this.nombre = nombre;
        this.costo = costo;
        this.porcentajeDeBeneficio = porcentajeDeBeneficio;
        this.porcentajeDeIVA = porcentajeDeIVA;
    }

    // Calcula el precio por unidad basado en el costo y el porcentaje de beneficio
    public double obtenerPrecioPorUnidad() {
        double precio = costo + (costo * porcentajeDeBeneficio / 100);
        return redondear(precio);
    }

    // Calcula el precio final del producto incluyendo el IVA
    public double obtenerPrecioFinal() {
        double precioBase = obtenerPrecioPorUnidad();
        double precioConIVA = precioBase + (precioBase * porcentajeDeIVA / 100);
        return redondear(precioConIVA);
    }

    private double redondear(double valor) {
        return new BigDecimal(valor).setScale(2, RoundingMode.UP).doubleValue();
    }

    public String obtenerNombre() {
        return nombre;
    }
}
