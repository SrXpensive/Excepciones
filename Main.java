import java.util.ArrayList;

public class Main {
    static ArrayList <Alumno> alumnos = new ArrayList<>();
    public static void main(String[] args) {
        int opcion;
        String nombre;
        String apellido;
        int num;
        int nota;
        int evaluacion;
        int ejercicio;
        do{
            System.out.println("1 - Añadir nuevo alumno");
            System.out.println("2 - Poner una nota");
            System.out.println("3 - Mostrar lista de notas de un alumno");
            System.out.println("0 - Salir");
            System.out.println("-------------------------");
            opcion = Leer.leerEntero("Introduce una opción: ");
            switch(opcion){
                case 1:
                    nombre = Leer.leerTexto("Introduce el nombre del alumno: ");
                    apellido = Leer.leerTexto("Introduce el apellido del alumno: ");
                    Alumno a = new Alumno(nombre,apellido);
                    alumnos.add(a);
                    break;
                case 2:
                    for(int i = 0; i < alumnos.size();i++){
                        System.out.println((i+1)+" - "+alumnos.get(i).getNombre()+" "+alumnos.get(i).getApellido());
                    }
                    num = Leer.leerEntero("¿A qué alumno quieres ponerle la nota?: ");
                    nota = Leer.leerEntero("Introduce nota: ");
                    evaluacion = Leer.leerEntero("Introduce evaluacion: ");
                    ejercicio = Leer.leerEntero("Introduce ejercicio: ");
                    try{
                        alumnos.get(num-1).ponerNota(nota,evaluacion,ejercicio);
                    }
                    catch(EvaluacionIncorrecta error1){
                        System.out.println(error1.getMessage());
                    }
                    catch(EjercicioIncorrecto error2){
                        System.out.println(error2.getMessage());
                    }
                    break;
                case 3:
                    for(int i = 0; i < alumnos.size();i++){
                        System.out.println((i+1)+" - "+alumnos.get(i).getNombre()+" "+alumnos.get(i).getApellido());
                    }
                    num = Leer.leerEntero("¿De qué alumno quieres consultar las notas?: ");
                    alumnos.get(num-1).notas();
                    System.out.println("-------------------------");
                    break;
            }
        }while(opcion !=0);

    }
}
