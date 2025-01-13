/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author teres
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona();
        Empleado e = new Empleado();
        
        Scanner t = new Scanner(System.in);
        
        System.out.println("Escribe el nombre del empleado: ");
        e.nombre = t.nextLine();
        System.out.println("Escribe la edad del empleado: ");
        e.edad = t.nextInt();
        System.out.println("Escribe la estatura del empleado: ");
        e.estatura = t.nextLine();
        t.nextLine();
        System.out.println("Escribe el salario del empleado");
        e.salario = t.nextDouble();
        System.out.println("----------------------------------");
        System.out.println("Escribe el nombre de la persona: ");
        p.nombre = t.nextLine();
        t.nextLine();
        System.out.println("Escribe la edad de la persona: ");
        p.edad = t.nextInt();
        System.out.println("Escribe la estatura de la persona: ");
        p.estatura = t.nextDouble();
        System.out.println("-------Datos de la persona---------");
        p.mostrarDatos();
        
        System.out.println("----------Datos del empleado---------");
    }
    
}
