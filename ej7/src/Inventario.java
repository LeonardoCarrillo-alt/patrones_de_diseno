import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarInventario() {
        for (Producto producto : productos) {
            System.out.println("Precio: " + producto.obtenerPrecio() + ", Stock: " + producto.obtenerStock());
        }
    }
}
