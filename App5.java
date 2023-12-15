/**
 * Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una
 * empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la
 * información de N personas distintas (valor también introducido por teclado). Para cada
 * persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta información debe
 * guardarse en una única matriz. Luego se mostrará por pantalla el sueldo medio de cada
 * género.
 * @author Adrián Rueda Fernández
 */

public class App5 {
    
    public static void main(String[] args) {
        int nPersonas = Integer.parseInt(System.console().readLine("Ingrese el número de personas: "));


        double[][] sueldosGenero = new double[nPersonas][2];

        for (int i = 0; i < nPersonas; i++) {
            String inputGenero = System.console().readLine("Ingrese el género de la persona " + (i + 1) + " (0 para varón, 1 para mujer): ");
            int genero = Integer.parseInt(inputGenero);

            String inputSueldo = System.console().readLine("Ingrese el sueldo de la persona " + (i + 1) + ": ");
            double sueldo = Double.parseDouble(inputSueldo);

            sueldosGenero[i][0] = genero;
            sueldosGenero[i][1] = sueldo;
        }

        double sueldoMedioVarones = 0;
        double sueldoMedioMujeres = 0;
        int countVarones = 0;
        int countMujeres = 0;

        for (int i = 0; i < nPersonas; i++) {
            double sueldo = sueldosGenero[i][1];

            if (sueldosGenero[i][0] == 0) {
                sueldoMedioVarones += sueldo;
                countVarones++;
            } else {
                sueldoMedioMujeres += sueldo;
                countMujeres++;
            }
        }

        sueldoMedioVarones /= countVarones;
        sueldoMedioMujeres /= countMujeres;

        System.out.println("Sueldo medio de varones: " + sueldoMedioVarones);
        System.out.println("Sueldo medio de mujeres: " + sueldoMedioMujeres);
    }
}