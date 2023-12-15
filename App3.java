/**
 * Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
 * introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
 * matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
 * menores que cero y cuántos son igual a cero.
 * @author Adrián Rueda Fernández
 */

public class App3 {
    
    public static void main(String[] args) {
        int filas = Integer.parseInt(System.console().readLine("Ingrese el número de filas (N): "));
        int columnas = Integer.parseInt(System.console().readLine("Ingrese el número de columnas (M): "));
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Integer.parseInt(System.console().readLine(
                        "Ingrese el valor para la posición [" + i + "][" + j + "]: "));
            }
        }

        int mayoresCero = 0, menoresCero = 0, igualCero = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > 0) {
                    mayoresCero++;
                } else if (matriz[i][j] < 0) {
                    menoresCero++;
                } else {
                    igualCero++;
                }
            }
        }

        System.out.println("Valores mayores a cero: " + mayoresCero);
        System.out.println("Valores menores a cero: " + menoresCero);
        System.out.println("Valores iguales a cero: " + igualCero);
    }
}