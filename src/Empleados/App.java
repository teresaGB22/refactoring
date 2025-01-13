package Empleados;

import java.util.Scanner;

/**
 * Aplicación principal para gestionar empleados.
 * En este caso, se trabaja con un objeto Gerente.
 * 
 * @author teres
 */
public class App {

    /**
     * Método principal que ejecuta la aplicación.
     * 
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner para entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar y leer el salario del usuario
            System.out.print("Introduzca el salario: ");
            double salario = scanner.nextDouble();

            // Solicitar y leer el bono del usuario
            System.out.print("Introduzca el bono: ");
            double bono = scanner.nextDouble();

            // Crear un objeto Gerente con los valores ingresados
            Gerente gerente = new Gerente(bono, salario);

            // Mostrar información detallada del gerente
            gerente.mostrarInformacion();
        } catch (Exception e) {
            System.out.println("Error en la entrada de datos. Asegúrese de ingresar números válidos.");
        } finally {
            // Cerrar el Scanner para liberar recursos
            scanner.close();
        }
    }
}

