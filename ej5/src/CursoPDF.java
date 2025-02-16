public class CursoPDF implements Curso{
    @Override
    public void iniciar() {
        System.out.println("iniciando curso con PDFs");

    }

    @Override
    public void completar() {
        System.out.println("terminando el curso PDF");

    }
}
