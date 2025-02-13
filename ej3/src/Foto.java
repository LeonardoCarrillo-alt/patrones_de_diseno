public class Foto implements Interactuable{
    @Override
    public void comentar(String comentario) {
        System.out.println("comentario en foto: "+comentario);

    }

    @Override
    public void reaccionar(String tipoReaccion) {
        System.out.println("reaccion en foto: "+tipoReaccion);

    }

    @Override
    public void compartir() {
        System.out.println("foto compartida.");

    }
}
