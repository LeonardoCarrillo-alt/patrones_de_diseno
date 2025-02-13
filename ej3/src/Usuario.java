public class Usuario {
    public void interaccionConPublicacion(Interactuable interactuable, String comentario, String reaccion){
        interactuable.comentar(comentario);
        interactuable.compartir();
        interactuable.reaccionar(reaccion);

    }
}
