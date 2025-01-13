/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.Animales;

/**
 *
 * @author teres
 */
public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    void hacerSonido() {
        System.out.println("El perro ladra"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
