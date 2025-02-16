public class Usuario {
    private String nombre;
    public Usuario (String nombre){
        this.nombre=nombre;
    }

    public void solicitarViaje(TransportePublico transportePublico, String origen, String destino){
        System.out.println("el pasajero " + nombre + " solicito un viaje");
        transportePublico.iniciarViaje(origen, destino);
        System.out.println("tarifa estimanda es de " + transportePublico.calcularTarifa() + " bs");

    }
}
