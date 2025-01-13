/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.Animales;

/**
 *
 * @author teres
 */
public class Animal {
     private String nombre;
     int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Animal() {
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
}
