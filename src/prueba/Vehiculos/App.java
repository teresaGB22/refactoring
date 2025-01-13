/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba.Vehiculos;

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
        Coche[] coches = new Coche[5];
        Scanner t = new Scanner(System.in);
        for(int i = 0; i < coches.length; i++){
            System.out.println("Inserte la marca del coche: ");
            String marca = t.nextLine();
            System.out.println("Inserte el modelo del coche: ");
            String modelo = t.nextLine();
            System.out.println("Inserte puertas del coche: ");
            int puertas = t.nextInt();
            coches[i] = new Coche(marca, modelo, puertas);
            t.nextLine();
        }
        for(Coche c : coches){
            c.mostrarDetalles();
        }
    }
    
}
