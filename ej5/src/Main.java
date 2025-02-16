//
public class Main {
    public static void main(String[] args) {
        System.out.printf("Curso UPB");
        Estudiante estudiante1 = new Estudiante( "Esteban");
        Estudiante estudiante2 = new Estudiante( "Maria");
        Estudiante estudiante3 = new Estudiante( "Juan");
        Curso cursoVideo = new CursoVideo();
        Curso cursoPDF = new CursoPDF();
        Curso cursoExamen = new CursoExamen();
        estudiante1.inscripcion(cursoVideo);
        estudiante1.finDeCurso(cursoVideo);

        estudiante2.inscripcion(cursoPDF);
        estudiante2.finDeCurso(cursoPDF);

        estudiante3.inscripcion(cursoExamen);
        estudiante3.finDeCurso(cursoExamen);
        estudiante3.calificacion((CursoExamen) cursoExamen,40);

    }
}