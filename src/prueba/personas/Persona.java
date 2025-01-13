/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.personas;

/**
 *
 * @author teres
 */
public class Persona {
    private int edad;
    private String nombre;

    public Persona() {
    }

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    
    void presentarse(){
        System.out.printf("hola soy %s y tengo %d",this.nombre,this.edad);
    }
}
