public class Video implements Interactuable{
    @Override
    public void comentar(String comentario) {
        System.out.println("comantario en video: "+comentario);
    }

    @Override
    public void reaccionar(String tipoReaccion) {
        System.out.println("reaccion en video: " + tipoReaccion);
    }

    @Override
    public void compartir() {
        System.out.println("video compartido.");
    }
}
