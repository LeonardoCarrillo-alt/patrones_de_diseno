import java.util.Date;

public class Alimento implements Producto, Almacenable{
    private int precio;
    private Date fecha;
    private int stock;
    public Alimento (int precio, Date fecha, int stock){
        this.precio = precio;
        this.fecha = fecha;
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
    @Override
    public void guardarEnBodega() {
        if (fecha.after(new Date())){
            System.out.println("alimentos guardado en bodega");
        }else{
            retirarDeBodega();
        }
    }
    @Override
    public void retirarDeBodega() {
        System.out.println("retirando producto vencido de bodega");
    }
}
