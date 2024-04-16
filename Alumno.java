public class Alumno {
    private final int CEVA = 3;
    private final int CEJER = 5;
    private int [][] notas = new int [CEVA][CEJER];
    public void ponerNota(int nota, int eval, int ejer) throws EvaluacionIncorrecta,EjercicioIncorrecto{
        if(eval>3){
            throw new EvaluacionIncorrecta("La evaluación debe ser como mucho 3");
        }
        if(eval<=0){
            throw new EvaluacionIncorrecta("La evaluación no puede ser negativa ni cero");
        }
        if(ejer>5){
            throw new EjercicioIncorrecto("El ejercicio debe ser como mucho 5");
        }
        if(ejer<=0){
            throw new EjercicioIncorrecto("El ejercicio no puede ser negativo ni cero");
        }
        notas[eval-1][ejer-1] = nota;
    }
    public int[][] getNotas() {
        return notas;
    }

    public int getCEVA() {
        return CEVA;
    }

    public int getCEJER() {
        return CEJER;
    }
}
