public class Electronico implements Producto{

    private int precio;
    private int stock;

    public Electronico (int precio, int stock){
        this.precio = precio;
        this.stock = stock;
    }
    @Override
    public int obtenerPrecio() {

        return precio;

    }

    @Override
    public int obtenerStock() {
        return stock;

    }
}
