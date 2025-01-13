/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Empleados;

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
        // TODO code application logic here
        Gerente g ;
        Scanner t = new Scanner(System.in);
        System.out.println("Introduzca el salario: ");
        double salario = t.nextDouble();
        System.out.println("Introduzca el bono: ");
        double bono = t.nextInt();
        g = new Gerente(bono, salario);
        g.calcularSalarioTotal();
    }
    
}
