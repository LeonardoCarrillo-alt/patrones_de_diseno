public class Bus implements TransportePublico{
    @Override
    public void iniciarViaje(String origen, String destino) {
        System.out.println("el pasajero desde el origen de "+ origen + " llego a su destino: "+ destino);

    }

    @Override
    public double calcularTarifa() {
        return 2.60;
    }
}
