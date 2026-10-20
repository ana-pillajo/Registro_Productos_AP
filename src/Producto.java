public class Producto {

    private int id;
    private String nombre;
    private double precio;
    private int stock;
    private static int contadorProductos = 0;

    public Producto(String nombre, double precio, int stock) {
        contadorProductos++;
        this.id = contadorProductos;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }
}