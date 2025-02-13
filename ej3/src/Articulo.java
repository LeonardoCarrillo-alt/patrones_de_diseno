public class Articulo implements Interactuable{
    @Override
    public void comentar(String comentario) {
        System.out.println("comentario en articulo: " + comentario);

    }

    @Override
    public void reaccionar(String tipoReaccion) {
        System.out.println("reaccion en articulo" + tipoReaccion);

    }

    @Override
    public void compartir() {
        System.out.println("articulo compartido. ");

    }
}
