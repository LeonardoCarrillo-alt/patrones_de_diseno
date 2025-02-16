public class Compra{
    private Facturable facturable;
    private MetodoPago metodoPago;

    public Compra (Facturable facturable, MetodoPago metodoPago){
        this.facturable =facturable;
        this.metodoPago = metodoPago;
    }
    public void realizarCompra(double monto){
        metodoPago.procesarPago(monto);
        facturable.generarFactura();
    }
}
