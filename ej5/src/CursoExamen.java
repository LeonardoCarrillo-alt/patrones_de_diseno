public class CursoExamen implements Curso,Evaluable{
    @Override
    public void iniciar() {
        System.out.println("iniciando el examen");

    }

    @Override
    public void completar() {
        System.out.println("terminando examen!");
    }

    @Override
    public void calificar(int puntaje) {
        System.out.println("la calificacion del estudiante es: "+ puntaje);
        if (puntaje < 61){
            System.out.println("el estudiante reprobó el curso");
        }else{
            System.out.println("el estudiante termino el curso con exito!");
        }
    }
}
