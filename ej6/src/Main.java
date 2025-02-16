public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Usuario u1 = new Usuario("Pepe");
        Usuario u2 = new Usuario("Leo");
        Usuario u3 = new Usuario("Mario");
        Usuario u4 = new Usuario("Maria");
        Usuario u5 = new Usuario("Joaquin");

        TransportePublico taxi = new Taxi(new Taxista());
        TransportePublico bus = new Bus();
        TransportePublico bici = new BicicletaCompartida();

        u1.solicitarViaje(taxi, "Achumani", "Av.triangular");
        u2.solicitarViaje(bus, "Irpavi", "Obrajes");
        u3.solicitarViaje(bici, "Achumani c.20", "Achumani c.30");

    }
}