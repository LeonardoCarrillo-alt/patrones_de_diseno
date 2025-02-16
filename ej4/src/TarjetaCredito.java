public class TarjetaCredito implements MetodoPago{
    @Override
    public void procesarPago(double monto) {
        System.out.println("el monto por targeta de credito es de: "+ monto);

    }
}
