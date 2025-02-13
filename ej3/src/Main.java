// Red social con interacciones
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        Usuario max = new Usuario();
        Usuario pepe = new Usuario();
        Usuario maria = new Usuario();
        Foto foto = new Foto();
        Video video = new Video();
        Articulo articulo= new Articulo();

        max.interaccionConPublicacion(foto, "que graciosa foto", "riendo");
        pepe.interaccionConPublicacion(video, "que video mas triste", "cara triste");
        maria.interaccionConPublicacion(articulo, "que intersante articulo", "interesada");




    }
}