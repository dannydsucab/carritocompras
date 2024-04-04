# ¿Qué queremos construir?
Estamos construyendo un carrito de compras para una tienda de comestibles en línea. La idea de esta kata es construir el producto de forma iterativa.

## Requerimientos técnicos
* El precio por unidad se calcula en función del costo del producto y el porcentaje de ingresos que la empresa quiere para ese producto.
* El precio debe redondearse al alza; entonces, si un precio unitario calculado es 1,7825, entonces el precio unitario esperado para ese producto es 1,79
* El precio final del producto se calcula entonces como el precio unitario con el IVA redondeado al alza .
* No se permite que los productos tengan el mismo nombre.

## Lista de productos
|Nombre|Costo|% Ganancia|Precio por unidad|Impuesto|Precio final|
|------|-----|----------|-----------------|--------|------------|
|Iceberg 🥬|1,55€|15 %|1,79€|Normales (21%)|2,17 €|
|Tomate 🍅|0,52€|15 %|0,60€|Normales (21%)|0,73€|
|Pollo 🍗|1,34€|12 %|1,51€|Normales (21%)|1,83€|
|Pan 🍞|0,71€|12 %|0,80€|Primera necesidad (10%)|0,88€|
|Maíz 🌽|1,21€|12 %|1,36€|Primera necesidad (10%)|1,50€|

## Lista de descuentos
|Código de descuento|Cantidad|
|-------------------|--------|
|PROMO_5|5%|
|PROMO_10|10%|
 
## Casos de uso
* Listar el carrito de compras
* Añadir producto al carrito de compras
  * Eliminar producto del carrito de compras
* Aplicar descuento al carrito de compras

