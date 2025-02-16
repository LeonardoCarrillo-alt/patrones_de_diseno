import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Inventario inventario = new Inventario();
        Electronico tv = new Electronico(2000, 20);
        Alimento leche = new Alimento(20, new Date(System.currentTimeMillis()+ 86400000), 50);
        Ropa pantalon = new Ropa(120, 100);

        inventario.agregarProducto(tv);
        inventario.agregarProducto(leche);
        inventario.agregarProducto(pantalon);


        inventario.mostrarInventario();

        leche.guardarEnBodega();
        leche.retirarDeBodega();
    }
}