// sistema de pago y facturacion para una empresa
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        Compra compra1 = new Compra(new FacturaElectronica(), new TarjetaCredito());
        Compra compra2 = new Compra(new FacturaFisica(), new PayPal());
        Compra compra3 = new Compra(new FacturaElectronica(), new TransferenciaBancaria());

        System.out.println("\n realizando compras");

        compra1.realizarCompra(10.50);
        compra2.realizarCompra(115.90);
        compra3.realizarCompra(200.30);

    }
}