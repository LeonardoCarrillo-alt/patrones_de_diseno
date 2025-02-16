package org.example;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRegular implements Recomendable{

    private List<Producto> historialCompras;

    // Constructor
    public UsuarioRegular(List<Producto> historialCompras) {
        this.historialCompras = historialCompras;
    }

    @Override
    public List<Producto> obtenerRecomendaciones() {
        // Lógica para recomendaciones regulares (por ejemplo, productos económicos)
        List<Producto> recomendaciones = new ArrayList<>();
        for (Producto producto : historialCompras) {
            if (producto.getPrecio() <= 100) { // Recomendar productos económicos
                recomendaciones.add(producto);
            }
        }
        return recomendaciones;
    }

}
