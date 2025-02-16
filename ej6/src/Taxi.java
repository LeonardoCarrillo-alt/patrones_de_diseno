public class Taxi implements TransportePublico{

    private Conductor conductor;
    public Taxi (Conductor conductor){
        this.conductor=conductor;
    }

    @Override
    public void iniciarViaje(String origen, String destino) {
        System.out.println("el pasajero con un origen en "+ origen + " y con un destino: "+ destino);
        conductor.aceptarPasajero();


    }

    @Override
    public double calcularTarifa() {
        conductor.finalizarViaje();
        return 20.0;

    }
}
