/**
 * Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
 * 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
 * programa mostrará la nota mínima, máxima y media de cada alumno.
 * @author Adrián Rueda Fernández
 */

public class App4 {
    
    public static void main(String[] args) {
        String[] alumnos = {"Alumno 1", "Alumno 2", "Alumno 3", "Alumno 4"};
        String[] asignaturas = {"Asignatura 1", "Asignatura 2", "Asignatura 3", "Asignatura 4", "Asignatura 5"};

        double[][] notas = new double[alumnos.length][asignaturas.length];


        for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < asignaturas.length; j++) {
                String input = System.console().readLine("Ingrese la nota de " + alumnos[i] + " en " + asignaturas[j] + ": ");
                notas[i][j] = Double.parseDouble(input);
            }
        }

        for (int i = 0; i < alumnos.length; i++) {
            double minNota = notas[i][0];
            double maxNota = notas[i][0];
            double sumNotas = notas[i][0];

            for (int j = 1; j < asignaturas.length; j++) {
                double nota = notas[i][j];

                if (nota < minNota) {
                    minNota = nota;
                }

                if (nota > maxNota) {
                    maxNota = nota;
                }

                sumNotas += nota;
            }

            double media = sumNotas / asignaturas.length;

            System.out.println("Notas de " + alumnos[i] + ":");
            System.out.println("   Mínima: " + minNota);
            System.out.println("   Máxima: " + maxNota);
            System.out.println("   Media: " + media);
            System.out.println();
        }
    }
}