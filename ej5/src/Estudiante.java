public class Estudiante {
    private String nombre;
    public Estudiante (String nombre){
        this.nombre = nombre;
    }
    public void inscripcion(Curso curso){
        System.out.println("inscripcion de estudiante completo");
        curso.iniciar();
    }
    public void finDeCurso(Curso curso){
        curso.completar();
    }
    public void calificacion(CursoExamen examen, int puntaje){
        examen.calificar(puntaje);

    }
}
