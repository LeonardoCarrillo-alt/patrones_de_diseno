public class Taxista implements Conductor {

    @Override
    public void aceptarPasajero() {
        System.out.println("pasajero aceptado, iniciando viaje ");
    }

    @Override
    public void finalizarViaje() {
        System.out.println("viaje finalizado ");
    }
}
