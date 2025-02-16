package org.example;

import java.util.ArrayList;
import java.util.List;

public class UsuarioPremium implements Recomendable {
    private List<Producto> historialCompras;
    public UsuarioPremium(List<Producto> historialCompras) {
        this.historialCompras = historialCompras;
    }
    public List<Producto> obtenerRecomendaciones() {
        // Lógica para recomendaciones premium (por ejemplo, productos de alta gama)
        List<Producto> recomendaciones = new ArrayList<>();
        for (Producto producto : historialCompras) {
            if (producto.getPrecio() > 100) { // Recomendar productos caros
                recomendaciones.add(producto);
            }
        }
        return recomendaciones;
    }
}
