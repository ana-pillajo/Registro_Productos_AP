public class MainProducto {

    public static void main(String[] args) {

        Producto producto1 = new Producto("Mouse", 29.99, 5);
        Producto producto2 = new Producto("Teclado", 40.99, 15);
        Producto producto3 = new Producto("Monitor", 269.00, 5);
        Producto producto4 = new Producto("Audifonos", 200.00, 20);
        Producto producto5 = new Producto("Parlante", 89.00, 5);

        System.out.println("Total de productos: " + Producto.getContadorProductos());
    }
}