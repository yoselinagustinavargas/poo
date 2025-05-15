public class PrecioTotalProductos {

    public static void main(String[] args) {
        // Vectores de ejemplo
        int[] cantidades = {2, 5, 1, 10, 3};
        double[] costos = {200.0, 150.0, 1200.0, 50.0, 400.0};

        double precioTotal = 0;

        System.out.println("Productos con precio individual mayor a $1000:");
        for (int i = 0; i < cantidades.length; i++) {
            double precioProducto = cantidades[i] * costos[i];
            precioTotal += precioProducto;

            if (precioProducto > 1000) {
                System.out.println("Producto " + (i + 1) + ": $" + precioProducto);
            }
        }

        System.out.println("\nPrecio total de todos los productos: $" + precioTotal);
    }
}
