public class Alumno {
    private final int CEVA = 3;
    private final int CEJER = 5;
    private int [][] matriz = new int [CEVA][CEJER];
    public void ponerNota(int nota, int eval, int ejer) throws EvaluacionIncorrecta,EjercicioIncorrecto{
        if (eval>3 || eval<0){
            throw new EvaluacionIncorrecta("La evaluación debe ser mayor que 0 y menor o igual a 3");
        }
        if(ejer<0 || ejer>5){
            throw new EjercicioIncorrecto("El ejercicio debe ser mayor que 0 o menor o igual a 5");
        }
        matriz[eval-1][ejer-1] = nota;
    }
}
