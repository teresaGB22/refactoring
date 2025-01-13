/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.Animales;

/**
 *
 * @author teres
 */
public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    void hacerSonido() {
        System.out.println("El gato maulla");// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    void cazarRatones(){
        System.out.println("El gato está cazando ratones");
    }
}
