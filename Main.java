public class Main {

    public static void main(String[] args) {
        Alumno a = new Alumno();
        int nota = Leer.leerEntero("Introduce nota: ");
        int evaluacion = Leer.leerEntero("Introduce evaluacion: ");
        int ejercicio = Leer.leerEntero("Introduce ejercicio: ");
        try{
            a.ponerNota(nota,evaluacion,ejercicio);
        }
        catch(EvaluacionIncorrecta | EjercicioIncorrecto error){
            System.out.println(error.getMessage());
        }

    }
}
